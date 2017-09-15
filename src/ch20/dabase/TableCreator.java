package ch20.dabase;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class TableCreator {
	public static void main(String[] args) throws Exception {
		String className = "ch20.dabase.Member";
		Class<?>  cl = Class.forName(className);
		DBTable dbTable = cl.getAnnotation(DBTable.class);
		if (dbTable == null) {
			System.out.println("No DBTable annotations in class " + className);
			//continue;
		}
		String tableName = dbTable.name();
		//if the name is empty ,use the class name
		if (tableName.length() < 1) {
			tableName = cl.getName().toUpperCase();
		}
		List<String> columnDefs = new ArrayList<String>();
		for(Field field : cl.getDeclaredFields()){
			String columnName = null;
			Annotation[] anns = field.getDeclaredAnnotations();
			if (anns.length < 1) {
				continue;
			}
			if (anns[0] instanceof SQLInteger) {
				SQLInteger sInt = (SQLInteger) anns[0];
				if (sInt.name().length() < 1) {
					columnName = field.getName().toUpperCase();
				}else {
					columnName = sInt.name();
				}
				columnDefs.add(columnName + " INT" + getConstraints(sInt.constraints()));
			}
			if (anns[0] instanceof SqlString) {
				SqlString sString = (SqlString) anns[0];
				//use field name if name not specified
				if (sString.name().length() < 1) {
					columnName = field.getName().toUpperCase();
				}else {
					columnName = sString.name();
				}
				columnDefs.add(columnName + " VARCHAR(" + sString.value() + ")"
						+ getConstraints(sString.constraints()));
			}
			StringBuffer createCommand = new StringBuffer("CREATE TABLE " + tableName + "(");
			for(String columnDef : columnDefs){
				createCommand.append("\n  " + columnDef + ",");
			}
			//remove trailing comma
			String tableCreate = createCommand.substring(0,createCommand.length() -1) + ");";
			System.out.println("Table  Createion sql for " + className + "is :\n" +tableCreate);
		}
	}
	private static String getConstraints(Constraints con){
		String constraints = "";
		if (!con.allowNull()) {
			constraints += " NOT NULL";
		}
		if (con.primaryKey()) {
			constraints += " primary Key";
		}
		if (con.unique()) {
			constraints += " UNIQUE";
		}
		return constraints;
	}
}

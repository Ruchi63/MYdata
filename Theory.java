package dayJDBC;

public class Theory {
	//JDBC==>Java database connectivity
	/*database testing[phpMyAdmin]--jdbc
	 * 	To create connection with database--download jar file--> mysqlconnector.jar
	 * 	It contains some predefined classes,interfaces to create connection
	 * 	with database
	 * 
	 *  1]	connection Interface--> to create connection with database
	 *  2]	getConnection() method of DriverManager class-->for actually
	 *  		creating connection with database
	 *  3]	To fire query on database, we have to use Statement Interface
	 *  		According to type of Statement, different methods are
	 *  			available 
	 *   		1]	execute()--->return boolean value
	 *   			DDL--->data definition lang
	 *   			create,alter,rename,drop,truncate
	 *   
	 *   		2]	executeUpdate()--->return integer value
	 *   			DML--->data manipulation lang
	 *   			insert,update,delete
	 *   
	 *   		3]	executeQuery()-->it return ResultSet
	 *   			DQL--->data query lang
	 *   			select
	 *   			It returns table kind of structure.To handle this table
	 *   			kind of structure, we have to use ResultSet Interface.
	 *   			Row concept is not present,to move the pointer to the
	 *   			next row we use next() method of ResultSet	
	 *   
	 */   		

}

package lib;

import java.util.ArrayList;
import java.util.List;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;

public class Utility {
	
	

/**
 * @author Ethans
 * Funnction name :- getRecordUsingFillo
 * @throws FilloException 
 */
	public static Recordset getRecordUsingFillo(String fileName , String strQuery) throws FilloException {
		Connection con = null;
		Fillo fil = null;
		Recordset rs = null;
		
		try {
			fil = new Fillo();
			con = fil.getConnection(fileName);
			rs = con.executeQuery(strQuery);
		}
		catch(Exception e) {
			
		}
		
		return rs;
		
	}
	
	
	/**
	 * @author Ethans
	 * Funnction name :- readGroups
	 * @throws FilloException 
	 */
		public static List readGroups(String fileName , String strQuery) throws FilloException {
			
			ArrayList l = new ArrayList();
			try {
				Recordset rs = Utility.getRecordUsingFillo(fileName, strQuery);
				
				while(rs.next()) {
					String grps = rs.getField("Groups");
					l.add(grps);
				}
			}
			catch(Exception e) {
				
			}
			
			return l;
			
		}
		
		
		/**
		 * @author Ethans
		 * Funnction name :- readTestcases
		 * @throws FilloException 
		 */
			public static Recordset readTestcases(String fileName , String strQuery) throws FilloException {			
				Recordset rs = Utility.getRecordUsingFillo(fileName, strQuery);
				return rs;
				
			}


}

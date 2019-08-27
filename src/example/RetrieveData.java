package example;

import java.util.ArrayList;
import java.sql.*;

public class RetrieveData {
    public ArrayList listMethod() {
        ArrayList<String> codeList = new ArrayList<String>();
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.5.115:1522:WAW115", "k", "k");
            Statement stmt = con.createStatement();
            String codeSql = "select INTL_ID from code_obj_type";

            ResultSet rs = stmt.executeQuery(codeSql);

            while (rs.next()) {
                System.out.println(rs.getString("INTL_ID"));
                String intlID = rs.getString("INTL_ID");
                codeList.add(intlID);
            }
            con.close();
            System.out.println("Codelist size: "+codeList.size());
        } catch (Exception e) {
            System.out.println(e);
        }
        return codeList;
    }
}

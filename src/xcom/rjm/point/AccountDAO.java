package xcom.rjm.point;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rjm.util.DBConnector;

public class AccountDAO {

	public int update(AccountDTO aDTO, Connection con) throws Exception {

		int result = 0;

		String sql = "";
		PreparedStatement st = con.prepareStatement(sql);
		st.setInt(1, aDTO.getAcc_num());
		st.setInt(2, aDTO.getOpening());
		st.setString(3, aDTO.getAcc_name());
		st.setInt(4, aDTO.getBalance());
		result = st.executeUpdate();
		DBConnector.disConnect(st, con);

		return result;

	}

}

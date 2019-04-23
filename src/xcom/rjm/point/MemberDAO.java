package xcom.rjm.point;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.rjm.util.DBConnector;

public class MemberDAO {

	public int insert(MemberDTO mDTO, Connection con) throws Exception {

		int result = 0;

		String sql = "insert into io values(member_seq.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, mDTO.getId());
		st.setInt(2, mDTO.getPw());
		st.setString(3, mDTO.getMem_name());
		st.setInt(4, mDTO.getPhone());
		st.setString(5, mDTO.getEmail());
		result = st.executeUpdate();
		DBConnector.disConnect(st, con);

		return result;

	}

}

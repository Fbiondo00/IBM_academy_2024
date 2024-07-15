import com.sistemi.informativi.connection.ConnectionManager;
import com.sistemi.informativi.dao.FacadeDAO;
import com.sistemi.informativi.dao.FacadeDAOImpl;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class CrudTest {

    @Test
    public void removeCourseTest() throws SQLException, ClassNotFoundException {

        FacadeDAO facadeDAO = new FacadeDAOImpl();
        Connection con = ConnectionManager.getConnection();

        facadeDAO.removeCourse(3);

        ConnectionManager.closeConnection();


    }

}

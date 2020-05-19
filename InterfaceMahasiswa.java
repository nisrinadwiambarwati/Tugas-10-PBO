/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor_4;

/**
 *
 * @author ASUS
 */
import java.sql.SQLException;
import java.util.List;
public interface InterfaceMahasiswa {
     Mahasiswa insert(Mahasiswa o) throws SQLException;

    void update(Mahasiswa o) throws SQLException;

    void delete(String nim) throws SQLException;

    List getAll() throws SQLException;


}

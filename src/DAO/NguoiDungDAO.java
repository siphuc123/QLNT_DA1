package DAO;

import Model.NguoiDung;
import Helper.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NguoiDungDAO {

    public void insert(NguoiDung model) {
        String sql = "INSERT INTO NguoiDung (MaNguoiDung, HoTen, VaiTro, MatKhau) VALUES (?, ?, ?, ?)";
        JdbcHelper.executeUpdate(sql, model.getMaNGuoiDung(), model.getHoTen(), model.isVaiTro(), model.getMatKhau());
    }

    public void update(NguoiDung model) {
        String sql = "UPDATE NguoiDung SET MatKhau=?, HoTen=?, VaiTro=? WHERE MaNguoiDung=?";
        JdbcHelper.executeUpdate(sql, model.getMatKhau(), model.getHoTen(), model.isVaiTro(), model.getMaNGuoiDung());

    }

    public void delete(String MaNV) {
        String sql = "DELETE FROM NguoiDung WHERE MaNguoiDung=?";
        JdbcHelper.executeUpdate(sql, MaNV);
    }

    public List<NguoiDung> select() {
        String sql = "SELECT * FROM NguoiDung";
        return select(sql);
    }

    public NguoiDung findById(String manv) {
        String sql = "SELECT * FROM NguoiDung WHERE MaNguoiDung=?";
        List<NguoiDung> list = select(sql, manv);
        return list.size() > 0 ? list.get(0) : null;
    }

    private List<NguoiDung> select(String sql, Object... args) {
        List<NguoiDung> list = new ArrayList<>();
        try {
            ResultSet rs = null;
            try {
                rs = JdbcHelper.executeQuery(sql, args);
                while (rs.next()) {
                    NguoiDung model = readFromResultSet(rs);
                    list.add(model);
                }
                rs.close();
            } finally {
            }
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return list;
    }

    private NguoiDung readFromResultSet(ResultSet rs) throws SQLException {
        NguoiDung model = new NguoiDung();
        model.setMaNGuoiDung(rs.getString("MaNguoiDung"));
        model.setMatKhau(rs.getString("MatKhau"));
        model.setHoTen(rs.getString("HoTen"));
        model.setVaiTro(rs.getBoolean("VaiTro"));
        return model;
    }
}

package Helper;

//import Model.NhanVien;
import Model.NguoiDung;
import java.awt.Image;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

public class ShareHelper {

    public static final Image APP_ICON;
    
    //Ảnh biểu tượng của ứng dụng, xuất hiện trên mọi cửa sổ
    static {
        String file = "/Icons/logo_icon.png";
        APP_ICON = new ImageIcon(ShareHelper.class.getResource(file)).getImage();
    }
    //Sao chép file logo chuyên đề vào thư mục logo
    public static boolean saveLogo(File file) {
        File dir = new File("logos");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        File newFile = new File(dir, file.getName());
        try {
            Path source = Paths.get(file.getAbsolutePath());
            Path destination = Paths.get(newFile.getAbsolutePath());
            Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    // fileName là tên truyền vào, sau đó sẽ return ảnh mới
    public static ImageIcon readLogo(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());
    }

// đối tượng chứa thông tin người dùng sau khi đăng nhập (login) vào
    public static NguoiDung USER = null;
// xóa thông tin, chuyển về null khi có yêu cầu đăng xuất (logoff)
    public static void logoff() {
        ShareHelper.USER = null;
    }

// kiểm tra phần đăng nhập xem đã đăng nhập hay chưa ( true = đã đăng nhập và ngược lại)
    public static boolean authenticated() {
        return ShareHelper.USER != null;
    }
}

package search;
import java.util.List;
/**
 * @author <url>http://singleant.iteye.com/blog/1497259</url>
 */
public class FileSearch implements Search {
    @Override
    public List<Object> search(String keyword) {
        System.out.println("now use file system search. keyword:" + keyword);
        return null;
    }
}

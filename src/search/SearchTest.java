package search;
import java.util.Iterator;
import java.util.ServiceLoader;
/**
 * @author <url>http://singleant.iteye.com/blog/1497259</url>
 */
public class SearchTest {
    public static void main(String[] args) {
        ServiceLoader<Search> s = ServiceLoader.load(Search.class);
        Iterator<Search> searchIterator = s.iterator();
        if (searchIterator.hasNext()) {
            Search curSearch = searchIterator.next();
            curSearch.search("test");
        }else{
            System.out.println("请检 META-INF 查文件路径是否正确");
        }
    }
}
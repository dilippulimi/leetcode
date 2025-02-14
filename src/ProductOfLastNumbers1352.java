import java.util.ArrayList;
import java.util.List;

public class ProductOfLastNumbers1352 {

    private static List<Integer> list;

    public ProductOfLastNumbers1352() {
        list = new ArrayList<>();
        list.add(1);
    }

    public void add(int num) {
        if(num==0){
            list = new ArrayList<>();
            list.add(1);
        }else{
            int pro = list.get(list.size()-1);
            list.add(pro * num);
        }
    }

    public int getProduct(int k) {
        int n = list.size();
        if (k >= n) return 0;
        return list.get(n - 1) / list.get(n - 1 - k);
    }
}

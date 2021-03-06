/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OnThi.composite.BT06;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Administrator
 */
public class Composite extends MonHocAbstract{
   List<MonHocAbstract> childItems = new ArrayList<>();

    public Composite(String name) {
        super(name);
    }


    @Override
    public void add(MonHocAbstract item) {
        if(!childItems.contains(item)){
            childItems.add(item);
        }
    }

    @Override
    public void remove(MonHocAbstract item) {
         if(childItems.contains(item)){
            childItems.remove(item);
        }
    }

    @Override
    public int tongTC() {
        //Cách duyệt 1
//       int tongtc =0;
//       for(MonHocAbstract t: childItems)
//       {
//           tongtc += t.tongTC();
//       }
//       return tongtc;
        //Cách duyệt 2
        int result = childItems.stream().mapToInt(value -> value.tongTC()).sum();
        return result;
    }

    @Override
    public double tongHocPhi() {
        double result = childItems.stream().mapToDouble(value -> value.tongHocPhi()).sum();
        return result;
    }

    @Override
    public String hienThiCay() {
        StringBuilder Builder = new StringBuilder();
        Builder.append(pre)
                .append(name);
        for(MonHocAbstract item : childItems){
            item.pre = this.pre + "-----";
            Builder.append("\n")
                    .append(item.hienThiCay());
            item.pre = "";
        }
        return Builder.toString();
    }
}

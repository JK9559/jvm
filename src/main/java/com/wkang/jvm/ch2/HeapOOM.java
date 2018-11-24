package com.wkang.jvm.ch2;

import java.util.ArrayList;
import java.util.List;
/**
 * @author wkang
 * @date 2018/11/24
 * -Xms20M -Xmx20M -XX:+HeapDumpOnOutOfMemoryError
 * -Xms 堆的最小值 -Xmx 堆的最大值
 */
public class HeapOOM {

    static class OOMObject{

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true){
            list.add(new OOMObject());
        }
    }
}

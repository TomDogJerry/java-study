package com.hqyj.cl.day13.testMap;

import java.util.HashMap;
import java.util.Map;

/*
*   ① `public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中。
    ② `public V remove(Object key)`: 把指定的键所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
    ③ `public V get(Object key)`：根据指定的键，在Map集合中获取对应的值。
    ④ `boolean containsKey(Object key)`：判断集合中是否包含指定的键。
    ⑤ `public Set<K> keySet()`: 获取Map集合中所有的键，存储到Set集合中。
    ⑥ `public Set<Map.Entry<K,V>> entrySet()`: 获取到Map集合中所有的键值对对象的集合(Set集合)。
* */
public class DemoMap01 {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,String> map = new HashMap<>();
        //`public V put(K key, V value)`:  把指定的键与指定的值添加到Map集合中
        // 如果这个键不存在，会添加进去，返回null
        // 如果这个键存在，就会替换掉之前的值，返回的是被替换掉的值
        String s1 = map.put("黄晓明","杨颖");
        System.out.println(s1);//null
        System.out.println(map);//{黄晓明=杨颖}
        //再一次添加黄晓明-杨颖2
/*        String s2 = map.put("黄晓明","杨颖2");
        System.out.println(s2);//杨颖
        System.out.println(map);//{黄晓明=杨颖2}*/

        //`public V remove(Object key)`: 把指定的键所对应的键值对元素 在Map集合中删除，返回被删除元素的值。
//        String s3 = map.remove("黄晓明");
//        System.out.println(s3);//杨颖
//        System.out.println(map);//{}
        /*
        * 再添加几个元素
        * */
        map.put("邓超","孙俪");
        map.put("谢霆锋","王菲");
        //`public V get(Object key)`：根据指定的键，在Map集合中获取对应的值。
        //如果这个键存在，返回对应的值，如果不存在，返回null
        String s4 = map.get("邓超");
        System.out.println(s4);//孙俪

        //`boolean containsKey(Object key)`：判断集合中是否包含指定的键。
        //如果这个键存在，返回true，否则返回false
        boolean b1 = map.containsKey("刘亦菲");
        System.out.println(b1);//false
        boolean b2 = map.containsKey("谢霆锋");
        System.out.println(b2);//true

        //存入空值的元素
        map.put("张三","");
        //存入空键的元素
        map.put("","赵六");
        //如果重复的键存在，但是没有值，新加入的键对应的值会覆盖掉前面键对应的值
        map.put("张三","李四");
        map.put("邓超","周末");
        //如果map中存在空键对应一个值，空键不能被覆盖
        map.put("田七","赵六");
        map.put("","下课了");
        System.out.println(map);
    }
}

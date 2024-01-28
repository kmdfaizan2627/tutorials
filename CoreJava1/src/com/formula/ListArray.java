package com.formula;
import java.util.ArrayList;
import java.util.Set;

public class ListArray {
public static void main (String[] args)
{
 ArrayList <String> list = new ArrayList<>();
 list.add("imran");
 list.add("kamran");
 list.add("faizan");
 System.out.println(list);
 ArrayList <String> result = new ArrayList<>();
 result.addAll(list);
 System.out.println(result);
 result.remove(2);
 System.out.println(result.size());

}
}

package vd.code;

import com.google.common.base.Stopwatch;
import vd.code.entity.MyBST;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        MyBinaryTree myBinaryTree = new MyBinaryTree();
//        myBinaryTree.init();
        Stopwatch stopwatch1 = Stopwatch.createStarted();
        MyBST myBST1 = new MyBST();
        myBST1.root = myBST1.insertIntoBST(myBST1.root,5);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,1);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,6);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,0);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,3);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,7);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,2);
        myBST1.root = myBST1.insertIntoBST(myBST1.root,4);
        stopwatch1.stop();
        System.out.println("Tạo thành công node1");
        System.out.println("⏱ Thời gian tạo node1: " + stopwatch1.elapsed().toNanos() + " ns");

        Stopwatch stopwatch2 = Stopwatch.createStarted();
        MyBST myBST2 = new MyBST();
        myBST2.root = myBST2.insert(myBST2.root,5);
        myBST2.root = myBST2.insert(myBST2.root,1);
        myBST2.root = myBST2.insert(myBST2.root,6);
        myBST2.root = myBST2.insert(myBST2.root,0);
        myBST2.root = myBST2.insert(myBST2.root,3);
        myBST2.root = myBST2.insert(myBST2.root,7);
        myBST2.root = myBST2.insert(myBST2.root,2);
        myBST2.root = myBST2.insert(myBST2.root,4);
        stopwatch2.stop();
        System.out.println("Tạo thành công node2");
        System.out.println("⏱ Thời gian tạo node2: " + stopwatch2.elapsed().toNanos() + " ns");
        Stopwatch stopwatch3 = Stopwatch.createStarted();
        MyBST myBST3 = new MyBST();
        myBST3.root = myBST3.insertIntoBST(myBST3.root,5);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,1);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,6);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,0);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,3);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,7);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,2);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,4);
        myBST3.root = myBST3.insertIntoBST(myBST3.root,10);
        myBST3.root = myBST3.insert(myBST3.root,15);
        stopwatch3.stop();
        System.out.println("Tạo thành công node3");
        System.out.println("⏱ Thời gian tạo node3: " + stopwatch3.elapsed().toNanos() + " ns");
        System.out.println("Done BenchMark code java");
//        myBST1.deleteNode(myBST1.root, 1);
        System.out.println("Done");

        // Code duyệt cây nhị phân theo chuẩn B+ Tree

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b); // false

        Integer x = 1;
        Integer y = 1;
        System.out.println(x == y); // true

        Integer d = 15;
        Integer e = 15;
        System.out.println(d == e); // true

        Integer c = 128;
        Integer v = 128;
        System.out.println(c == v); // true
    }
}
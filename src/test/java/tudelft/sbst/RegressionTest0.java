package tudelft.sbst;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        tudelft.sbst.Triangle.TriangleType triangleType0 = tudelft.sbst.Triangle.TriangleType.ISOSCELES;
        java.lang.Class<?> wildcardClass1 = triangleType0.getClass();
        org.junit.Assert.assertTrue("'" + triangleType0 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType0.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) -1, (int) (byte) 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) -1, (int) (byte) 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangleType5.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        tudelft.sbst.Triangle.TriangleType triangleType0 = tudelft.sbst.Triangle.TriangleType.SCALENE;
        java.lang.Class<?> wildcardClass1 = triangleType0.getClass();
        org.junit.Assert.assertTrue("'" + triangleType0 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType0.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 100, 100, 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangleType4.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (byte) -1, 100);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (short) 10, (int) (short) 10);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.EQUILATERAL + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.EQUILATERAL));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) -1, (int) (byte) 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) 'a', (int) 'a');
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) -1, (int) (byte) 0, (-1));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) '4', (int) (short) -1, (int) 'a');
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (byte) 10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 100, 100, 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (short) 10, (int) (short) 10);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 100, 100, 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangleType5.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) ' ', 0, (-1));
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, 0, (int) ' ');
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) -1, (int) (byte) 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType6 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType6 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType6.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) '4', (int) (byte) 0, (int) (short) 0);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 0, (int) ' ', (int) (byte) 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(100, (int) '#', (int) (byte) 1);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) 'a', (int) (byte) 10, (int) (byte) 1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test27");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (byte) -1, (int) 'a');
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangleType4.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test28");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (short) 0, (int) (short) 1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test29");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (byte) -1, (int) 'a');
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test30");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) ' ', 100, (int) (byte) -1);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test31");
        tudelft.sbst.Triangle.TriangleType triangleType0 = tudelft.sbst.Triangle.TriangleType.EQUILATERAL;
        java.lang.Class<?> wildcardClass1 = triangleType0.getClass();
        org.junit.Assert.assertTrue("'" + triangleType0 + "' != '" + tudelft.sbst.Triangle.TriangleType.EQUILATERAL + "'", triangleType0.equals(tudelft.sbst.Triangle.TriangleType.EQUILATERAL));
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test32");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 100, 1, (int) '4');
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test33");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(10, (int) '4', (int) '#');
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test34");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 0, (int) (byte) -1, (int) ' ');
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test35");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (byte) -1, (int) 'a');
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        java.lang.Class<?> wildcardClass6 = triangleType5.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test36");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) '4', (int) (short) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test37");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) '4', (int) (short) 0, (int) (byte) 0);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test38");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 1, (-1), (int) (short) 0);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test39");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) -1, 0, (int) ' ');
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test40");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (byte) 10, 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test41");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 100, (int) '4', (int) 'a');
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test42");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) 'a', (int) (byte) 10, (int) (byte) 1);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test43");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 10, 10, 0);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test44");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) ' ', (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test45");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 10, (int) (short) 10, (int) (short) 10);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangleType4.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.EQUILATERAL + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.EQUILATERAL));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test46");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 0, 0, 10);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test47");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 0, 0, (int) (byte) 1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test48");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, (int) (byte) 100, (int) (byte) 0);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test49");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) 'a', 1, 0);
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test50");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 10, 10, 0);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test51");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 10, (int) (byte) 10, (int) ' ');
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test52");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 0, (int) (byte) -1, 1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test53");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 0, 1, 1);
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test54");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, 0, (int) ' ');
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        tudelft.sbst.Triangle.TriangleType triangleType5 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertTrue("'" + triangleType5 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType5.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test55");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) '#', (int) (short) 1, (-1));
        java.lang.Class<?> wildcardClass4 = triangle3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test56");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (byte) 100, (int) (short) 100, (int) (byte) 100);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test57");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 1, 1, 10);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        java.lang.Class<?> wildcardClass5 = triangle3.getClass();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.ISOSCELES + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.ISOSCELES));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test58");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle(0, 10, (int) (short) -1);
        tudelft.sbst.Triangle.TriangleType triangleType4 = triangle3.classify();
        org.junit.Assert.assertTrue("'" + triangleType4 + "' != '" + tudelft.sbst.Triangle.TriangleType.SCALENE + "'", triangleType4.equals(tudelft.sbst.Triangle.TriangleType.SCALENE));
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test59");
        tudelft.sbst.Triangle triangle3 = new tudelft.sbst.Triangle((int) (short) 0, 100, (int) (byte) -1);
    }
}


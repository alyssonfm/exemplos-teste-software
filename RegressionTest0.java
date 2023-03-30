import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = cal0.numberOfDays((int) ' ', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.Class<?> wildcardClass13 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cal0.firstOfMonth((int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cal0.firstOfMonth((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.firstOfMonth((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        java.lang.Class<?> wildcardClass3 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.numberOfDays((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.numberOfDays((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.firstOfMonth((int) 'a', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.firstOfMonth((int) '#', (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cal0.firstOfMonth((int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (byte) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "    1 " + "'", str7, "    1 ");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        java.lang.String str8 = cal0.cal((int) (short) 10, 4);
        boolean boolean10 = cal0.isLeap((int) (short) 1);
        int int13 = cal0.firstOfMonth(1, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               1  2  3  4\n" + "'", str8, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        java.lang.Class<?> wildcardClass7 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.firstOfMonth((int) (byte) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.numberOfDays((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cal0.numberOfDays(31, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        int int6 = cal0.jan1((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) (byte) 1, 4);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.numberOfDays((int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    1  2  3  4 " + "'", str14, "    1  2  3  4 ");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        java.lang.Class<?> wildcardClass5 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth((int) (short) -1, 6);
        java.lang.Class<?> wildcardClass4 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 5 + "'", int3 == 5);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) (byte) 1, 4);
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    1  2  3  4 " + "'", str14, "    1  2  3  4 ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        java.lang.String str8 = cal0.cal((int) (short) 10, 4);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               1  2  3  4\n" + "'", str8, "                               1  2  3  4\n");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.firstOfMonth((int) (short) 10, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.firstOfMonth((int) (short) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cal0.firstOfMonth(100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int14 = cal0.numberOfDays((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.firstOfMonth((int) (byte) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.Class<?> wildcardClass8 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth((int) (byte) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth((int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        int int22 = cal0.firstOfMonth((int) (byte) 0, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.Class<?> wildcardClass4 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1(0);
        java.lang.Class<?> wildcardClass11 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = cal0.numberOfDays((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.numberOfDays((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        int int8 = cal0.firstOfMonth((int) (short) -1, (int) (byte) 10);
        int int10 = cal0.jan1((int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.numberOfDays((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        boolean boolean15 = cal0.isLeap(5);
        boolean boolean17 = cal0.isLeap(3);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        java.lang.String str12 = cal0.cal((int) (byte) 1, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cal0.numberOfDays((int) (short) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str12, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int14 = cal0.numberOfDays((int) (short) 0, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.firstOfMonth((int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = cal0.firstOfMonth((int) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.numberOfDays((int) ' ', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        int int7 = cal0.firstOfMonth(4, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cal0.numberOfDays((-1), (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.Class<?> wildcardClass20 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        java.lang.Class<?> wildcardClass7 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        java.lang.String str16 = cal0.cal((int) (byte) 0, 0);
        java.lang.String str19 = cal0.cal(2, 10);
        java.lang.String str22 = cal0.cal((int) (short) 10, 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       1  2  3  4  5\n 6  7  8  9 10 " + "'", str19, "       1  2  3  4  5\n 6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                              " + "'", str22, "                              ");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(31);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = cal0.firstOfMonth((int) '4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        java.lang.String str9 = cal0.cal((int) (short) 0, 4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1  2  3  4 " + "'", str9, " 1  2  3  4 ");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.firstOfMonth((int) (short) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = cal0.numberOfDays((int) '4', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        java.lang.Class<?> wildcardClass4 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        boolean boolean12 = cal0.isLeap(4);
        int int14 = cal0.jan1(31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        java.lang.Class<?> wildcardClass23 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        java.lang.Class<?> wildcardClass20 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        java.lang.Class<?> wildcardClass5 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        int int14 = cal0.numberOfDays(0, 6);
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (short) 100, 100);
        int int10 = cal0.numberOfDays((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str7, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) (short) 1);
        java.lang.String str13 = cal0.cal(0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.numberOfDays((int) '4', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.numberOfDays((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        java.lang.String str22 = cal0.cal((int) (short) -1, 5);
        java.lang.String str25 = cal0.cal(31, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1\n 2  3  4  5 " + "'", str22, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                                                                                              1  2 " + "'", str25, "                                                                                              1  2 ");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        java.lang.Class<?> wildcardClass7 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) (byte) 1, 4);
        int int16 = cal0.jan1((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.numberOfDays((int) '#', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    1  2  3  4 " + "'", str14, "    1  2  3  4 ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1(6);
        int int5 = cal0.numberOfDays(3, 2);
        java.lang.Class<?> wildcardClass6 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(4, 30);
        java.lang.String str23 = cal0.cal(30, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str20, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str23, "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        boolean boolean13 = cal0.isLeap(0);
        int int16 = cal0.numberOfDays(5, 4);
        java.lang.Class<?> wildcardClass17 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1(6);
        java.lang.String str5 = cal0.cal(6, (int) (short) 0);
        java.lang.Class<?> wildcardClass6 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                  " + "'", str5, "                  ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', 1);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                 1 " + "'", str11, "                                                                                                 1 ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.numberOfDays((int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        boolean boolean13 = cal0.isLeap(0);
        int int15 = cal0.jan1((int) (byte) 100);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int19 = cal0.jan1((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.numberOfDays((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        int int17 = cal0.jan1((int) (short) 0);
        java.lang.String str20 = cal0.cal(30, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                          " + "'", str20, "                                                                                          ");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.numberOfDays((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        boolean boolean13 = cal0.isLeap(0);
        int int16 = cal0.numberOfDays(5, 4);
        boolean boolean18 = cal0.isLeap(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        java.lang.String str16 = cal0.cal((int) (byte) 0, 0);
        java.lang.String str19 = cal0.cal(2, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.firstOfMonth((int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       1  2  3  4  5\n 6  7  8  9 10 " + "'", str19, "       1  2  3  4  5\n 6  7  8  9 10 ");
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        int int7 = cal0.numberOfDays(2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 29 + "'", int7 == 29);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        boolean boolean17 = cal0.isLeap((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1(6);
        int int5 = cal0.numberOfDays(3, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cal0.numberOfDays((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 31 + "'", int5 == 31);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal(2, (int) (short) 1);
        java.lang.String str19 = cal0.cal((int) (short) 10, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.numberOfDays((int) (byte) -1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str19, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.numberOfDays((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int18 = cal0.jan1(3);
        java.lang.String str21 = cal0.cal((int) ' ', 5);
        java.lang.Class<?> wildcardClass22 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                 1  2  3\n 4  5 " + "'", str21, "                                                                                                 1  2  3\n 4  5 ");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        java.lang.String str18 = cal0.cal((int) '#', 1);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                          1 " + "'", str18, "                                                                                                          1 ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        int int14 = cal0.firstOfMonth(0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        boolean boolean13 = cal0.isLeap((int) (short) 10);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1(6);
        java.lang.String str5 = cal0.cal(6, (int) (short) 0);
        java.lang.String str8 = cal0.cal(1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                  " + "'", str5, "                  ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 " + "'", str8, "    1  2  3  4  5  6\n 7  8  9 10 ");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        boolean boolean10 = cal0.isLeap((int) (short) 0);
        int int12 = cal0.jan1((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        int int7 = cal0.firstOfMonth(4, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cal0.numberOfDays((int) '#', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        java.lang.Class<?> wildcardClass11 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        int int17 = cal0.jan1((int) (short) 0);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.numberOfDays((int) (short) 100, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str22, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        boolean boolean14 = cal0.isLeap((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.firstOfMonth((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str22, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth((int) (short) -1, 30);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        int int27 = cal0.numberOfDays((int) (byte) 1, (int) (short) 100);
        int int29 = cal0.jan1(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int10 = cal0.jan1((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        int int22 = cal0.numberOfDays(2, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.firstOfMonth(30, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        boolean boolean12 = cal0.isLeap(4);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cal0.firstOfMonth((int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth(10, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.firstOfMonth((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        boolean boolean13 = cal0.isLeap(31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        cal.Cal cal0 = new cal.Cal();
        java.lang.Class<?> wildcardClass1 = cal0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        boolean boolean10 = cal0.isLeap((int) (short) 0);
        int int13 = cal0.numberOfDays(3, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.firstOfMonth(29, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        boolean boolean13 = cal0.isLeap(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.numberOfDays(100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        int int21 = cal0.jan1((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = cal0.numberOfDays((int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays(5, 10);
        int int6 = cal0.firstOfMonth(4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.firstOfMonth(29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        int int27 = cal0.numberOfDays((int) (byte) 1, (int) (short) 100);
        int int30 = cal0.numberOfDays(6, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int33 = cal0.firstOfMonth((int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30 + "'", int30 == 30);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.numberOfDays((int) (byte) 10, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth(100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int14 = cal0.firstOfMonth(5, (int) (short) 10);
        java.lang.String str17 = cal0.cal((int) (short) 10, 6);
        boolean boolean19 = cal0.isLeap(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6 " + "'", str17, "                               1  2  3  4\n 5  6 ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        int int19 = cal0.numberOfDays(2, 0);
        java.lang.String str22 = cal0.cal((int) 'a', 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.numberOfDays((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                                                                                                                                                                                                                   " + "'", str22, "                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.firstOfMonth((int) ' ', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.Class<?> wildcardClass13 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        boolean boolean16 = cal0.isLeap(100);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.numberOfDays((int) ' ', 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        boolean boolean13 = cal0.isLeap(0);
        int int15 = cal0.jan1((int) (short) 1);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        boolean boolean15 = cal0.isLeap(5);
        boolean boolean17 = cal0.isLeap(3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = cal0.firstOfMonth(29, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        int int8 = cal0.numberOfDays((int) (byte) 10, 10);
        java.lang.String str11 = cal0.cal((int) 'a', (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.numberOfDays((int) (short) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n" + "'", str11, "                                                                                                                                                                                                                                                                                                    1\n");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1((int) (short) -1);
        int int11 = cal0.numberOfDays((int) (byte) 0, 10);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        int int17 = cal0.jan1((int) (short) 0);
        java.lang.String str20 = cal0.cal(30, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = cal0.numberOfDays((int) (short) -1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                          " + "'", str20, "                                                                                          ");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        cal.Cal cal0 = new cal.Cal();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = cal0.numberOfDays((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        boolean boolean17 = cal0.isLeap(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        boolean boolean6 = cal0.isLeap((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.numberOfDays((int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal(5, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                1  2\n 3 " + "'", str22, "                1  2\n 3 ");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        boolean boolean17 = cal0.isLeap((int) (short) -1);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.numberOfDays(4, 6);
        java.lang.Class<?> wildcardClass21 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30 + "'", int20 == 30);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.firstOfMonth((-1), 10);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        int int8 = cal0.firstOfMonth((int) (short) -1, (int) (byte) 10);
        int int10 = cal0.jan1(1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.Class<?> wildcardClass17 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        int int13 = cal0.jan1((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        int int24 = cal0.firstOfMonth(3, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        boolean boolean5 = cal0.isLeap(0);
        int int8 = cal0.firstOfMonth(5, 29);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        boolean boolean6 = cal0.isLeap((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        java.lang.String str6 = cal0.cal((int) 'a', (int) 'a');
        int int9 = cal0.numberOfDays(1, (int) ' ');
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        java.lang.String str14 = cal0.cal((int) (short) 100, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 " + "'", str6, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 " + "'", str14, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 ");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1((int) (short) -1);
        java.lang.String str11 = cal0.cal((int) (byte) 1, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 " + "'", str11, "    1  2  3  4  5  6\n 7  8  9 10 ");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        boolean boolean12 = cal0.isLeap(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        boolean boolean12 = cal0.isLeap(2);
        java.lang.Class<?> wildcardClass13 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int14 = cal0.firstOfMonth(5, (int) (short) 10);
        java.lang.String str17 = cal0.cal((int) (short) 10, 6);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6 " + "'", str17, "                               1  2  3  4\n 5  6 ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean20 = cal0.isLeap(4);
        int int22 = cal0.jan1(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1((int) (short) -1);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((-1));
        int int17 = cal0.jan1(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(31);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = cal0.numberOfDays(31, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.numberOfDays((int) (byte) 1, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 31 + "'", int12 == 31);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) (short) 1);
        java.lang.String str13 = cal0.cal(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        java.lang.String str5 = cal0.cal((int) '#', (int) ' ');
        java.lang.String str8 = cal0.cal((int) ' ', (int) 'a');
        java.lang.String str11 = cal0.cal((int) 'a', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 " + "'", str5, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 36 37 38\n39 40 41 42 43 44 45\n46 47 48 49 50 51 52\n53 54 55 56 57 58 59\n60 61 62 63 64 65 66\n67 68 69 70 71 72 73\n74 75 76 77 78 79 80\n81 82 83 84 85 86 87\n88 89 90 91 92 93 94\n95 96 97 " + "'", str8, "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 36 37 38\n39 40 41 42 43 44 45\n46 47 48 49 50 51 52\n53 54 55 56 57 58 59\n60 61 62 63 64 65 66\n67 68 69 70 71 72 73\n74 75 76 77 78 79 80\n81 82 83 84 85 86 87\n88 89 90 91 92 93 94\n95 96 97 ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2 " + "'", str11, "                                                                                                                                                                                                                                                                                                    1\n 2 ");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        boolean boolean11 = cal0.isLeap(31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        boolean boolean16 = cal0.isLeap(2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.numberOfDays((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.numberOfDays(1, (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cal0.numberOfDays(29, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) 1, (int) (short) -1);
        java.lang.String str14 = cal0.cal(29, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str14, "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        boolean boolean13 = cal0.isLeap(0);
        int int15 = cal0.jan1((int) (byte) 100);
        boolean boolean17 = cal0.isLeap((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int8 = cal0.jan1((int) (byte) 10);
        java.lang.String str11 = cal0.cal(0, (int) (byte) 1);
        int int13 = cal0.jan1(5);
        int int15 = cal0.jan1(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " 1 " + "'", str11, " 1 ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        boolean boolean11 = cal0.isLeap(100);
        java.lang.String str14 = cal0.cal((-1), (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.numberOfDays((int) 'a', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 " + "'", str14, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 ");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays((int) (byte) 10, (int) (byte) 10);
        int int22 = cal0.numberOfDays(6, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.numberOfDays((int) (short) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.numberOfDays((int) (byte) -1, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal(6, (int) (short) -1);
        int int22 = cal0.firstOfMonth(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                  " + "'", str19, "                  ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int16 = cal0.firstOfMonth(0, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth(100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) (short) 1);
        boolean boolean12 = cal0.isLeap((int) (byte) 0);
        boolean boolean14 = cal0.isLeap(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays(5, 10);
        int int6 = cal0.firstOfMonth(4, (int) (short) 100);
        int int8 = cal0.jan1((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.numberOfDays((int) ' ', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        java.lang.String str5 = cal0.cal((int) '#', (int) ' ');
        java.lang.String str8 = cal0.cal((int) ' ', (int) 'a');
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 " + "'", str5, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 36 37 38\n39 40 41 42 43 44 45\n46 47 48 49 50 51 52\n53 54 55 56 57 58 59\n60 61 62 63 64 65 66\n67 68 69 70 71 72 73\n74 75 76 77 78 79 80\n81 82 83 84 85 86 87\n88 89 90 91 92 93 94\n95 96 97 " + "'", str8, "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 36 37 38\n39 40 41 42 43 44 45\n46 47 48 49 50 51 52\n53 54 55 56 57 58 59\n60 61 62 63 64 65 66\n67 68 69 70 71 72 73\n74 75 76 77 78 79 80\n81 82 83 84 85 86 87\n88 89 90 91 92 93 94\n95 96 97 ");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        int int12 = cal0.jan1(0);
        int int15 = cal0.numberOfDays(10, 3);
        int int18 = cal0.firstOfMonth((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        boolean boolean11 = cal0.isLeap(100);
        java.lang.String str14 = cal0.cal((-1), (int) ' ');
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 " + "'", str14, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        int int14 = cal0.numberOfDays(0, 6);
        int int16 = cal0.jan1((int) 'a');
        boolean boolean18 = cal0.isLeap((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        java.lang.String str6 = cal0.cal((int) 'a', (int) 'a');
        int int9 = cal0.numberOfDays(1, (int) ' ');
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 " + "'", str6, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        java.lang.String str18 = cal0.cal((int) '#', (int) (short) -1);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                         " + "'", str18, "                                                                                                         ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal(6, (int) (short) -1);
        java.lang.String str22 = cal0.cal(30, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                  " + "'", str19, "                  ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                          " + "'", str22, "                                                                                          ");
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        int int14 = cal0.firstOfMonth((int) (byte) -1, (int) (short) -1);
        boolean boolean16 = cal0.isLeap(1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) (byte) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        boolean boolean15 = cal0.isLeap(5);
        boolean boolean17 = cal0.isLeap(3);
        java.lang.String str20 = cal0.cal((int) '4', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                                                                                            " + "'", str20, "                                                                                                                                                            ");
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int20 = cal0.jan1((int) (short) 1);
        java.lang.Class<?> wildcardClass21 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        boolean boolean15 = cal0.isLeap(5);
        int int18 = cal0.firstOfMonth(5, 29);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays(5, 10);
        int int6 = cal0.firstOfMonth(4, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.numberOfDays((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.String str15 = cal0.cal((int) (byte) 100, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.numberOfDays((int) ' ', (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 " + "'", str15, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 ");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal((int) ' ', (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                " + "'", str19, "                                                                                                ");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal(6, (int) (short) -1);
        int int22 = cal0.firstOfMonth(1, 29);
        boolean boolean24 = cal0.isLeap(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                  " + "'", str19, "                  ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        int int6 = cal0.jan1((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(5);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.numberOfDays((-1), 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        boolean boolean11 = cal0.isLeap(0);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) 1, (int) (short) -1);
        java.lang.String str14 = cal0.cal((int) (byte) 1, (int) (byte) -1);
        int int17 = cal0.numberOfDays((int) (byte) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 31 + "'", int17 == 31);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        java.lang.String str21 = cal0.cal(30, 31);
        java.lang.String str24 = cal0.cal((int) '#', 0);
        boolean boolean26 = cal0.isLeap((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 " + "'", str21, "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                         " + "'", str24, "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        java.lang.String str18 = cal0.cal((int) 'a', (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int21 = cal0.numberOfDays(31, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                   " + "'", str18, "                                                                                                                                                                                                                                                                                                   ");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        int int20 = cal0.jan1(6);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = cal0.firstOfMonth((int) ' ', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1((int) (short) -1);
        int int11 = cal0.numberOfDays((int) (byte) 0, 10);
        java.lang.String str14 = cal0.cal(5, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                1  2\n 3  4  5  6  7  8  9\n10 " + "'", str14, "                1  2\n 3  4  5  6  7  8  9\n10 ");
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        java.lang.String str11 = cal0.cal(0, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.numberOfDays((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 " + "'", str11, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 ");
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.numberOfDays((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        int int16 = cal0.jan1((int) (byte) 1);
        java.lang.String str19 = cal0.cal(100, (int) (short) 100);
        int int22 = cal0.firstOfMonth((int) (byte) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str19, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        int int25 = cal0.firstOfMonth(4, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        int int21 = cal0.firstOfMonth(2, (int) 'a');
        int int24 = cal0.firstOfMonth(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 100);
        int int25 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass26 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str22, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal(2, (int) (short) 1);
        java.lang.String str19 = cal0.cal((int) (short) 10, (int) (short) 100);
        int int21 = cal0.jan1((int) (short) 1);
        java.lang.String str24 = cal0.cal((int) (byte) -1, (int) '#');
        boolean boolean26 = cal0.isLeap((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str19, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 " + "'", str24, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 ");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int18 = cal0.jan1(3);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = cal0.numberOfDays((int) 'a', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth(2, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth((int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((-1));
        java.lang.String str18 = cal0.cal(29, 29);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 " + "'", str18, "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth((-1), 10);
        int int7 = cal0.jan1((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        java.lang.String str25 = cal0.cal((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass26 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                              " + "'", str25, "                              ");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        int int17 = cal0.jan1(10);
        boolean boolean19 = cal0.isLeap((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        java.lang.String str6 = cal0.cal((int) 'a', (int) 'a');
        int int9 = cal0.numberOfDays(1, (int) ' ');
        java.lang.String str12 = cal0.cal(30, (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 " + "'", str6, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                           1 " + "'", str12, "                                                                                           1 ");
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        java.lang.Class<?> wildcardClass6 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.numberOfDays(0, 3);
        int int15 = cal0.jan1(0);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        java.lang.String str11 = cal0.cal((int) (byte) 0, (-1));
        java.lang.String str14 = cal0.cal((int) '#', (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.numberOfDays(29, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str14, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal(2, (int) (short) 1);
        java.lang.String str19 = cal0.cal((int) (short) 10, (int) (short) 100);
        int int21 = cal0.jan1((int) (short) 1);
        java.lang.Class<?> wildcardClass22 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str19, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        int int7 = cal0.jan1(29);
        int int9 = cal0.jan1((int) (byte) 0);
        java.lang.String str12 = cal0.cal((int) (byte) 100, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str12, "                                                                                                                                                                                                                                                                                                            ");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        java.lang.String str21 = cal0.cal(30, 31);
        java.lang.String str24 = cal0.cal((int) '#', 0);
        java.lang.Class<?> wildcardClass25 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 " + "'", str21, "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 ");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                         " + "'", str24, "                                                                                                         ");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        int int16 = cal0.jan1((int) (byte) 1);
        java.lang.String str19 = cal0.cal(100, (int) (short) 100);
        int int21 = cal0.jan1((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str19, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.firstOfMonth((int) (byte) 100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth((-1), 10);
        int int7 = cal0.jan1((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cal0.numberOfDays(30, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        boolean boolean6 = cal0.isLeap((int) ' ');
        int int8 = cal0.jan1((int) (short) -1);
        java.lang.String str11 = cal0.cal(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                              " + "'", str11, "                              ");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (short) 100, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cal0.numberOfDays(29, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str7, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        boolean boolean19 = cal0.isLeap(1);
        java.lang.String str22 = cal0.cal(29, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 " + "'", str22, "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 ");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        boolean boolean8 = cal0.isLeap(3);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.firstOfMonth(29, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1(4);
        int int18 = cal0.firstOfMonth((-1), 5);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        int int6 = cal0.jan1((int) (byte) 1);
        int int8 = cal0.jan1(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        java.lang.String str5 = cal0.cal((int) '#', (int) ' ');
        int int8 = cal0.numberOfDays((int) (short) 0, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 " + "'", str5, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 ");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        int int24 = cal0.numberOfDays((int) (byte) 1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = cal0.firstOfMonth((int) (short) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        java.lang.String str8 = cal0.cal((int) (short) 10, 4);
        boolean boolean10 = cal0.isLeap((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cal0.numberOfDays((int) (byte) 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               1  2  3  4\n" + "'", str8, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(6, 3);
        boolean boolean12 = cal0.isLeap((int) 'a');
        java.lang.String str15 = cal0.cal((int) '4', (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                   1\n 2  3 " + "'", str10, "                   1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                            " + "'", str15, "                                                                                                                                                            ");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        java.lang.String str22 = cal0.cal((int) (short) -1, 5);
        int int24 = cal0.jan1((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1\n 2  3  4  5 " + "'", str22, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        java.lang.String str8 = cal0.cal((int) (short) 10, 4);
        int int10 = cal0.jan1((int) (byte) 1);
        int int12 = cal0.jan1(29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               1  2  3  4\n" + "'", str8, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        boolean boolean12 = cal0.isLeap(4);
        java.lang.Class<?> wildcardClass13 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        int int20 = cal0.numberOfDays(10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass21 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        boolean boolean13 = cal0.isLeap(0);
        boolean boolean15 = cal0.isLeap((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        int int6 = cal0.jan1((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.numberOfDays((int) (short) 100, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        boolean boolean12 = cal0.isLeap((-1));
        int int15 = cal0.numberOfDays((int) (short) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        java.lang.String str7 = cal0.cal((int) (byte) 10, 5);
        int int9 = cal0.jan1((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                               1  2  3  4\n 5 " + "'", str7, "                               1  2  3  4\n 5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) 'a', (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth((int) (short) -1, 30);
        boolean boolean13 = cal0.isLeap((int) (byte) 10);
        java.lang.String str16 = cal0.cal(5, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "               " + "'", str16, "               ");
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal(2, (int) (short) 1);
        java.lang.String str19 = cal0.cal((int) (short) 10, (int) (short) 100);
        int int22 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str19, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        java.lang.String str8 = cal0.cal((int) (short) 10, 4);
        boolean boolean10 = cal0.isLeap((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               1  2  3  4\n" + "'", str8, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        int int19 = cal0.numberOfDays(2, 0);
        java.lang.String str22 = cal0.cal((int) 'a', 0);
        boolean boolean24 = cal0.isLeap((int) '#');
        java.lang.Class<?> wildcardClass25 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                                                                                                                                                                                                                   " + "'", str22, "                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.firstOfMonth((-1), 10);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.numberOfDays((int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = cal0.firstOfMonth((int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        boolean boolean11 = cal0.isLeap(0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.numberOfDays((int) (short) 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1(0);
        int int13 = cal0.firstOfMonth((int) (byte) 1, (int) (short) 10);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        boolean boolean14 = cal0.isLeap((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.firstOfMonth(100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        java.lang.String str8 = cal0.cal((int) (short) 10, 4);
        int int11 = cal0.firstOfMonth(2, (int) '4');
        int int13 = cal0.jan1((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                               1  2  3  4\n" + "'", str8, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        int int15 = cal0.jan1((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        boolean boolean10 = cal0.isLeap(0);
        java.lang.String str13 = cal0.cal((int) '4', 100);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str13, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.numberOfDays((int) (byte) 0, (int) 'a');
        int int8 = cal0.jan1((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        java.lang.String str18 = cal0.cal((int) '#', (int) (short) -1);
        java.lang.String str21 = cal0.cal(29, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = cal0.firstOfMonth(28, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                         " + "'", str18, "                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 " + "'", str21, "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 ");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal(5, 29);
        int int25 = cal0.firstOfMonth((int) (short) 10, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 " + "'", str22, "                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.numberOfDays(29, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 29 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        java.lang.String str22 = cal0.cal((int) (short) -1, 5);
        int int24 = cal0.jan1(100);
        java.lang.String str27 = cal0.cal((int) (byte) 100, (int) '#');
        int int30 = cal0.numberOfDays((int) (short) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1\n 2  3  4  5 " + "'", str22, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 " + "'", str27, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 ");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 31 + "'", int30 == 31);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        int int18 = cal0.firstOfMonth((-1), 3);
        java.lang.String str21 = cal0.cal((int) (byte) 0, 2);
        int int24 = cal0.numberOfDays(6, 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " 1  2 " + "'", str21, " 1  2 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        int int17 = cal0.firstOfMonth((-1), (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) '#', (int) (byte) -1);
        int int25 = cal0.firstOfMonth(10, (int) (short) 100);
        boolean boolean27 = cal0.isLeap(29);
        java.lang.String str30 = cal0.cal((int) (short) 100, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                         " + "'", str22, "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 " + "'", str30, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 ");
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        java.lang.String str21 = cal0.cal(6, (int) (short) 100);
        int int24 = cal0.firstOfMonth(4, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 " + "'", str21, "                   1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        int int21 = cal0.jan1(3);
        int int23 = cal0.jan1((int) (short) -1);
        boolean boolean25 = cal0.isLeap(31);
        java.lang.Class<?> wildcardClass26 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        boolean boolean16 = cal0.isLeap(100);
        int int18 = cal0.jan1((int) (byte) 10);
        int int20 = cal0.jan1((int) (short) 0);
        java.lang.String str23 = cal0.cal(5, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "               " + "'", str23, "               ");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.numberOfDays(0, 3);
        java.lang.String str16 = cal0.cal((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 " + "'", str16, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 ");
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.firstOfMonth((int) (short) 1, 100);
        int int23 = cal0.firstOfMonth(1, 2);
        boolean boolean25 = cal0.isLeap((-1));
        java.lang.Class<?> wildcardClass26 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean20 = cal0.isLeap(4);
        int int23 = cal0.firstOfMonth((int) (short) 0, 4);
        java.lang.Class<?> wildcardClass24 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        boolean boolean10 = cal0.isLeap((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        int int12 = cal0.numberOfDays((int) (byte) 0, 5);
        boolean boolean14 = cal0.isLeap((int) 'a');
        int int16 = cal0.jan1((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) (short) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.String str15 = cal0.cal((int) (byte) 100, (int) 'a');
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 " + "'", str15, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 ");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        java.lang.String str7 = cal0.cal((int) (byte) 10, 5);
        int int9 = cal0.jan1(2);
        int int11 = cal0.jan1((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                               1  2  3  4\n 5 " + "'", str7, "                               1  2  3  4\n 5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        int int11 = cal0.jan1(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        java.lang.String str9 = cal0.cal((int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        int int6 = cal0.jan1((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(4, 30);
        java.lang.String str23 = cal0.cal(100, 31);
        java.lang.Class<?> wildcardClass24 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str20, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 " + "'", str23, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 ");
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.String str15 = cal0.cal((int) (byte) 100, (int) 'a');
        int int18 = cal0.firstOfMonth(5, 3);
        int int20 = cal0.jan1((int) '#');
        int int23 = cal0.firstOfMonth((int) (byte) 0, (int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 " + "'", str15, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth((int) (short) -1, 30);
        int int14 = cal0.numberOfDays(0, (int) (byte) 100);
        boolean boolean16 = cal0.isLeap(31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(4, 30);
        java.lang.Class<?> wildcardClass21 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str20, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        boolean boolean7 = cal0.isLeap(6);
        int int10 = cal0.numberOfDays(4, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (short) 100, 100);
        boolean boolean9 = cal0.isLeap((int) (byte) 10);
        int int11 = cal0.jan1((int) (byte) 100);
        java.lang.Class<?> wildcardClass12 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str7, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.numberOfDays((int) (short) -1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays((int) (byte) 10, (int) (byte) 10);
        int int22 = cal0.numberOfDays(6, (int) (short) 0);
        boolean boolean24 = cal0.isLeap(6);
        boolean boolean26 = cal0.isLeap((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        int int8 = cal0.numberOfDays((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int20 = cal0.jan1((int) (short) 1);
        boolean boolean22 = cal0.isLeap(31);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.firstOfMonth((int) '4', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        boolean boolean26 = cal0.isLeap(0);
        java.lang.Class<?> wildcardClass27 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal(2, (int) (short) 1);
        boolean boolean18 = cal0.isLeap(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        java.lang.String str18 = cal0.cal((int) '#', (int) (short) -1);
        boolean boolean20 = cal0.isLeap((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                         " + "'", str18, "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        boolean boolean10 = cal0.isLeap((int) (short) 0);
        java.lang.String str13 = cal0.cal(30, (-1));
        java.lang.String str16 = cal0.cal((int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                          " + "'", str13, "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str16, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth((int) (short) -1, 30);
        boolean boolean13 = cal0.isLeap((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 6 + "'", int8 == 6);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        boolean boolean8 = cal0.isLeap(3);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        int int7 = cal0.jan1((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cal0.firstOfMonth(30, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1(0);
        int int13 = cal0.firstOfMonth((int) (byte) 1, (int) (short) 10);
        int int15 = cal0.jan1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        java.lang.String str16 = cal0.cal((int) (byte) 0, 0);
        int int19 = cal0.firstOfMonth((int) (byte) -1, 3);
        int int21 = cal0.jan1(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth((-1), 10);
        int int7 = cal0.jan1((int) 'a');
        int int10 = cal0.firstOfMonth((int) (byte) 0, 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays((int) (byte) 10, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.numberOfDays((int) '#', 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (byte) 10, (int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.numberOfDays(100, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        int int14 = cal0.numberOfDays(0, 6);
        int int16 = cal0.jan1((int) 'a');
        int int18 = cal0.jan1((int) (byte) -1);
        int int21 = cal0.firstOfMonth(1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        boolean boolean14 = cal0.isLeap(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        boolean boolean26 = cal0.isLeap(0);
        boolean boolean28 = cal0.isLeap(5);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = cal0.numberOfDays((int) (byte) -1, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        java.lang.String str18 = cal0.cal((int) '#', 1);
        int int21 = cal0.firstOfMonth((int) (byte) 1, (-1));
        java.lang.String str24 = cal0.cal(31, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                          1 " + "'", str18, "                                                                                                          1 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                              1 " + "'", str24, "                                                                                              1 ");
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.numberOfDays((int) (byte) -1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str22, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean20 = cal0.isLeap(4);
        int int22 = cal0.jan1((int) (byte) 0);
        int int25 = cal0.firstOfMonth(1, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        boolean boolean15 = cal0.isLeap(4);
        int int17 = cal0.jan1(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        int int19 = cal0.numberOfDays(2, 0);
        boolean boolean21 = cal0.isLeap((int) (short) 0);
        java.lang.String str24 = cal0.cal((int) (byte) 1, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "   " + "'", str24, "   ");
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (short) 100, 100);
        boolean boolean9 = cal0.isLeap((int) (byte) 10);
        int int11 = cal0.jan1(0);
        java.lang.String str14 = cal0.cal(1, 0);
        int int16 = cal0.jan1(30);
        boolean boolean18 = cal0.isLeap(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str7, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int14 = cal0.firstOfMonth((int) (short) 0, 5);
        boolean boolean16 = cal0.isLeap((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean20 = cal0.isLeap(4);
        int int23 = cal0.firstOfMonth((int) (short) 0, 4);
        java.lang.String str26 = cal0.cal(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1((int) (byte) 1);
        int int13 = cal0.numberOfDays(10, (int) (byte) -1);
        int int16 = cal0.firstOfMonth((int) (byte) 10, (int) (byte) 10);
        boolean boolean18 = cal0.isLeap(28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        java.lang.String str6 = cal0.cal((int) 'a', (int) 'a');
        int int9 = cal0.numberOfDays(1, (int) ' ');
        int int11 = cal0.jan1(6);
        int int14 = cal0.firstOfMonth((int) (short) 0, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = cal0.firstOfMonth(29, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 " + "'", str6, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(5, (int) (short) 0);
        java.lang.String str22 = cal0.cal((int) ' ', (int) (short) 10);
        int int24 = cal0.jan1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "               " + "'", str19, "               ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n" + "'", str22, "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) (short) 1);
        java.lang.String str13 = cal0.cal(0, (int) (byte) 0);
        java.lang.String str16 = cal0.cal((int) (short) 10, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                              " + "'", str16, "                              ");
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        int int5 = cal0.jan1(10);
        java.lang.String str8 = cal0.cal((int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 " + "'", str8, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 ");
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        java.lang.String str5 = cal0.cal((int) '#', (int) ' ');
        int int7 = cal0.jan1((int) (byte) 1);
        int int10 = cal0.firstOfMonth((int) (byte) 1, 30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 " + "'", str5, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean20 = cal0.isLeap(4);
        int int23 = cal0.firstOfMonth((int) (short) 0, 4);
        java.lang.String str26 = cal0.cal((int) (short) -1, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = cal0.numberOfDays(28, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 28 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 " + "'", str26, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 ");
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int17 = cal0.jan1((int) '4');
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        java.lang.String str25 = cal0.cal((int) (byte) 10, 0);
        int int27 = cal0.jan1(10);
        boolean boolean29 = cal0.isLeap((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                              " + "'", str25, "                              ");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        int int27 = cal0.numberOfDays((int) (byte) 1, (int) (short) 100);
        int int30 = cal0.numberOfDays(6, (int) (short) 10);
        boolean boolean32 = cal0.isLeap((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 30 + "'", int30 == 30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        int int25 = cal0.firstOfMonth(4, 5);
        int int27 = cal0.jan1(29);
        java.lang.Class<?> wildcardClass28 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth(10, 10);
        int int14 = cal0.numberOfDays((int) (byte) 10, (int) (byte) 10);
        int int16 = cal0.jan1(28);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) (byte) 100, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        boolean boolean15 = cal0.isLeap((int) (short) 100);
        int int17 = cal0.jan1(4);
        boolean boolean19 = cal0.isLeap(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = cal0.numberOfDays((int) '#', 6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal(0, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1  2  3  4 " + "'", str6, " 1  2  3  4 ");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean20 = cal0.isLeap(4);
        java.lang.String str23 = cal0.cal(3, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str23, "          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        boolean boolean10 = cal0.isLeap((int) (short) 0);
        int int13 = cal0.numberOfDays(3, (-1));
        boolean boolean15 = cal0.isLeap(28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(31);
        java.lang.Class<?> wildcardClass25 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        java.lang.String str14 = cal0.cal(1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 " + "'", str14, "    1  2  3  4  5  6\n 7  8  9 10 ");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        int int17 = cal0.jan1(4);
        int int19 = cal0.jan1((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        int int17 = cal0.jan1((int) (short) 0);
        java.lang.String str20 = cal0.cal(30, (int) (byte) -1);
        int int22 = cal0.jan1(31);
        // The following exception was thrown during execution in test generation
        try {
            int int25 = cal0.firstOfMonth(28, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                          " + "'", str20, "                                                                                          ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        java.lang.String str9 = cal0.cal((int) '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str9, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal(2, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) (short) 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        int int12 = cal0.jan1(0);
        int int15 = cal0.numberOfDays(10, 3);
        boolean boolean17 = cal0.isLeap((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(2, (int) (byte) 100);
        java.lang.String str22 = cal0.cal(5, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str19, "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "               " + "'", str22, "               ");
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        boolean boolean19 = cal0.isLeap(1);
        boolean boolean21 = cal0.isLeap(6);
        int int24 = cal0.firstOfMonth(10, (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1(0);
        int int13 = cal0.firstOfMonth((int) (byte) 1, (int) (short) 10);
        int int16 = cal0.firstOfMonth((int) (short) 10, 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        java.lang.String str22 = cal0.cal((int) (short) -1, 5);
        boolean boolean24 = cal0.isLeap((int) (byte) 10);
        int int27 = cal0.firstOfMonth((-1), (int) ' ');
        java.lang.Class<?> wildcardClass28 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1\n 2  3  4  5 " + "'", str22, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        boolean boolean15 = cal0.isLeap(5);
        int int18 = cal0.numberOfDays((int) (byte) 10, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        boolean boolean15 = cal0.isLeap((int) (short) 100);
        int int17 = cal0.jan1(4);
        boolean boolean19 = cal0.isLeap((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        boolean boolean26 = cal0.isLeap(0);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = cal0.numberOfDays((int) 'a', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((-1));
        int int18 = cal0.firstOfMonth((-1), 0);
        java.lang.String str21 = cal0.cal(100, 3);
        int int24 = cal0.firstOfMonth((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3 " + "'", str21, "                                                                                                                                                                                                                                                                                                             1  2  3 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 6 + "'", int24 == 6);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        int int19 = cal0.numberOfDays(2, 0);
        boolean boolean21 = cal0.isLeap((int) (short) 0);
        int int24 = cal0.numberOfDays((int) (short) 10, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = cal0.firstOfMonth((int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        int int11 = cal0.jan1((int) '#');
        int int13 = cal0.jan1(28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        int int11 = cal0.jan1(31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        int int24 = cal0.numberOfDays((int) (byte) 1, 100);
        int int26 = cal0.jan1((int) (byte) 1);
        int int29 = cal0.numberOfDays(4, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 31 + "'", int24 == 31);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 30 + "'", int29 == 30);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.numberOfDays((int) (byte) 0, (int) 'a');
        java.lang.Class<?> wildcardClass7 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.String str15 = cal0.cal((int) (byte) 1, (int) 'a');
        int int17 = cal0.jan1((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str15, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        java.lang.String str14 = cal0.cal((int) (short) 100, (int) (byte) 100);
        boolean boolean16 = cal0.isLeap((int) (byte) 100);
        boolean boolean18 = cal0.isLeap((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str14, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        java.lang.String str16 = cal0.cal((int) (byte) 0, 0);
        int int19 = cal0.firstOfMonth((int) (byte) -1, 3);
        boolean boolean21 = cal0.isLeap(6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((int) ' ', 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                 1  2 " + "'", str9, "                                                                                                 1  2 ");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        int int14 = cal0.numberOfDays(0, 6);
        int int16 = cal0.jan1((int) 'a');
        int int18 = cal0.jan1(31);
        int int21 = cal0.firstOfMonth((int) (short) 1, 0);
        java.lang.String str24 = cal0.cal((int) '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str24, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int9 = cal0.jan1((int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = cal0.numberOfDays((-1), 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int24 = cal0.firstOfMonth((int) (short) 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(5);
        int int16 = cal0.firstOfMonth(4, 5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        int int14 = cal0.firstOfMonth((int) (byte) -1, (int) (short) -1);
        boolean boolean16 = cal0.isLeap(1);
        boolean boolean18 = cal0.isLeap((int) (short) 10);
        java.lang.String str21 = cal0.cal((int) (short) -1, 28);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 " + "'", str21, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 ");
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        java.lang.String str18 = cal0.cal((int) '#', 1);
        int int20 = cal0.jan1(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                          1 " + "'", str18, "                                                                                                          1 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        int int11 = cal0.jan1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.numberOfDays((int) (byte) 10, 0);
        int int21 = cal0.firstOfMonth(0, 0);
        java.lang.Class<?> wildcardClass22 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(4, 30);
        int int23 = cal0.numberOfDays(1, (int) (byte) 10);
        boolean boolean25 = cal0.isLeap((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str20, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        int int20 = cal0.numberOfDays(10, (int) (byte) 10);
        int int23 = cal0.firstOfMonth((int) (short) 1, 4);
        int int26 = cal0.numberOfDays((int) (short) 1, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2 + "'", int23 == 2);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 31 + "'", int26 == 31);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 100);
        int int25 = cal0.numberOfDays(6, (int) '4');
        int int27 = cal0.jan1((int) (short) -1);
        java.lang.Class<?> wildcardClass28 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str22, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        java.lang.String str10 = cal0.cal((int) (byte) 0, (int) (byte) 100);
        boolean boolean12 = cal0.isLeap(31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str10, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int19 = cal0.jan1((int) (short) 100);
        int int21 = cal0.jan1(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        boolean boolean11 = cal0.isLeap(100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.firstOfMonth(100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        boolean boolean24 = cal0.isLeap(2);
        int int27 = cal0.numberOfDays((int) (byte) 1, (int) (short) 100);
        int int30 = cal0.firstOfMonth(1, 30);
        int int33 = cal0.numberOfDays((int) (byte) 1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 31 + "'", int27 == 31);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 31 + "'", int33 == 31);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        int int18 = cal0.firstOfMonth((int) (byte) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.firstOfMonth(1, (int) (short) -1);
        java.lang.String str11 = cal0.cal((-1), 0);
        int int14 = cal0.numberOfDays((int) (byte) 10, 0);
        boolean boolean16 = cal0.isLeap((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 31 + "'", int14 == 31);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth(4, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) 1, (int) (short) -1);
        java.lang.String str14 = cal0.cal((int) (byte) 1, (int) (byte) -1);
        boolean boolean16 = cal0.isLeap((int) 'a');
        int int18 = cal0.jan1(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 6 + "'", int18 == 6);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        int int17 = cal0.numberOfDays(0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.numberOfDays((-1), (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int16 = cal0.firstOfMonth(0, 0);
        int int19 = cal0.firstOfMonth((int) (short) 10, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.firstOfMonth(100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.firstOfMonth((int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1((int) (byte) 1);
        int int13 = cal0.numberOfDays(10, (int) (byte) -1);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1(6);
        java.lang.String str5 = cal0.cal((int) (byte) 0, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        int int12 = cal0.numberOfDays((int) (byte) 0, 5);
        boolean boolean14 = cal0.isLeap((int) 'a');
        java.lang.String str17 = cal0.cal(31, (-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                             " + "'", str17, "                                                                                             ");
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        int int11 = cal0.jan1((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.numberOfDays(30, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 30 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        int int18 = cal0.firstOfMonth((-1), 3);
        java.lang.String str21 = cal0.cal((int) (byte) 0, 2);
        boolean boolean23 = cal0.isLeap(3);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = cal0.numberOfDays((int) '#', 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " 1  2 " + "'", str21, " 1  2 ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        java.lang.String str6 = cal0.cal((int) (byte) 10, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 " + "'", str6, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 ");
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        boolean boolean12 = cal0.isLeap((int) (short) 0);
        java.lang.Class<?> wildcardClass13 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((-1));
        int int17 = cal0.jan1((int) (byte) 1);
        boolean boolean19 = cal0.isLeap((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 6 + "'", int17 == 6);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (short) 10, (-1));
        int int23 = cal0.jan1((int) '4');
        int int26 = cal0.numberOfDays(0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1((int) (short) -1);
        int int11 = cal0.firstOfMonth(1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        int int19 = cal0.numberOfDays(2, 0);
        java.lang.String str22 = cal0.cal((int) 'a', 0);
        boolean boolean24 = cal0.isLeap((int) '#');
        int int27 = cal0.firstOfMonth(0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 29 + "'", int19 == 29);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                                                                                                                                                                                                                   " + "'", str22, "                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1((int) (short) -1);
        boolean boolean10 = cal0.isLeap((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        boolean boolean11 = cal0.isLeap(0);
        java.lang.String str14 = cal0.cal(100, 0);
        boolean boolean16 = cal0.isLeap((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str14, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays((int) (byte) 10, (int) (byte) 10);
        int int22 = cal0.numberOfDays(6, (int) (short) 0);
        boolean boolean24 = cal0.isLeap(6);
        java.lang.String str27 = cal0.cal(100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 31 + "'", int19 == 31);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "                                                                                                                                                                                                                                                                                                             1 " + "'", str27, "                                                                                                                                                                                                                                                                                                             1 ");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        boolean boolean10 = cal0.isLeap(0);
        java.lang.String str13 = cal0.cal((int) '4', 100);
        int int15 = cal0.jan1(6);
        java.lang.Class<?> wildcardClass16 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str13, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(5, (int) (short) 0);
        java.lang.String str22 = cal0.cal((int) ' ', (int) (short) 10);
        java.lang.Class<?> wildcardClass23 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "               " + "'", str19, "               ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n" + "'", str22, "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth(1, (int) (byte) -1);
        boolean boolean7 = cal0.isLeap(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        boolean boolean16 = cal0.isLeap(2);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.numberOfDays(31, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 31 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.numberOfDays(0, 3);
        int int15 = cal0.jan1(0);
        int int17 = cal0.jan1((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth(1, (int) (byte) -1);
        java.lang.String str8 = cal0.cal((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        java.lang.String str14 = cal0.cal((int) (short) 100, (int) (byte) 100);
        java.lang.Class<?> wildcardClass15 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str14, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        java.lang.String str18 = cal0.cal((int) '#', 1);
        int int21 = cal0.firstOfMonth((int) (byte) 1, (-1));
        int int23 = cal0.jan1((int) (short) 100);
        int int25 = cal0.jan1((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                          1 " + "'", str18, "                                                                                                          1 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        java.lang.String str10 = cal0.cal((int) (byte) 0, (int) (byte) 100);
        int int12 = cal0.jan1((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str10, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int6 = cal0.numberOfDays(0, (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        java.lang.String str22 = cal0.cal((int) (short) -1, 5);
        boolean boolean24 = cal0.isLeap((int) (byte) 10);
        int int27 = cal0.firstOfMonth((-1), (int) ' ');
        int int29 = cal0.jan1(10);
        int int32 = cal0.firstOfMonth((int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1\n 2  3  4  5 " + "'", str22, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2 + "'", int27 == 2);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        boolean boolean23 = cal0.isLeap(10);
        java.lang.Class<?> wildcardClass24 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(2, (int) (byte) 100);
        int int21 = cal0.jan1(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str19, "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int10 = cal0.jan1((int) (byte) 10);
        int int13 = cal0.numberOfDays(10, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (short) 100, 100);
        boolean boolean9 = cal0.isLeap((int) (byte) 10);
        int int11 = cal0.jan1(0);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.firstOfMonth((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str7, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        int int17 = cal0.jan1((int) (short) 0);
        java.lang.String str20 = cal0.cal(30, (int) (byte) -1);
        java.lang.String str23 = cal0.cal((int) (short) -1, (int) (short) 10);
        int int26 = cal0.numberOfDays((int) (short) 0, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                          " + "'", str20, "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str23, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) '#', (int) (byte) -1);
        int int25 = cal0.firstOfMonth(10, (int) (short) 100);
        int int28 = cal0.firstOfMonth((int) (byte) 1, (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "                                                                                                         " + "'", str22, "                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 6 + "'", int28 == 6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        int int18 = cal0.jan1(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        boolean boolean10 = cal0.isLeap(0);
        java.lang.String str13 = cal0.cal((int) '4', 100);
        int int15 = cal0.jan1(6);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.firstOfMonth(100, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str13, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        boolean boolean10 = cal0.isLeap((int) (short) 0);
        int int13 = cal0.numberOfDays(3, (-1));
        java.lang.String str16 = cal0.cal((int) (byte) 10, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) (byte) 100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                              " + "'", str16, "                              ");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.firstOfMonth((int) (short) 1, 100);
        int int23 = cal0.firstOfMonth(1, 2);
        boolean boolean25 = cal0.isLeap((-1));
        int int27 = cal0.jan1((int) (short) 10);
        java.lang.String str30 = cal0.cal((int) (byte) -1, (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int14 = cal0.numberOfDays((int) (short) 0, (int) '4');
        java.lang.String str17 = cal0.cal(6, 6);
        int int20 = cal0.firstOfMonth(0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                   1\n 2  3  4  5  6 " + "'", str17, "                   1\n 2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(6, 3);
        boolean boolean12 = cal0.isLeap((int) 'a');
        int int15 = cal0.firstOfMonth(4, 29);
        int int17 = cal0.jan1(0);
        int int19 = cal0.jan1((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                   1\n 2  3 " + "'", str10, "                   1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.firstOfMonth((int) (short) 1, 100);
        int int23 = cal0.firstOfMonth(1, 2);
        boolean boolean25 = cal0.isLeap((int) (short) 10);
        java.lang.String str28 = cal0.cal((int) (byte) 1, 0);
        boolean boolean30 = cal0.isLeap(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "   " + "'", str28, "   ");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1((int) (byte) 1);
        int int13 = cal0.numberOfDays(10, (int) (byte) -1);
        int int16 = cal0.firstOfMonth((int) (byte) 10, (int) (byte) 10);
        boolean boolean18 = cal0.isLeap(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.firstOfMonth((int) (short) 1, 100);
        java.lang.String str23 = cal0.cal((int) (byte) 1, (int) (byte) 1);
        java.lang.String str26 = cal0.cal((int) (byte) 100, 29);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = cal0.numberOfDays((int) 'a', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "    1 " + "'", str23, "    1 ");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 " + "'", str26, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 ");
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        int int13 = cal0.jan1((int) (short) -1);
        java.lang.String str16 = cal0.cal((int) '#', 30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 " + "'", str16, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 ");
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        boolean boolean5 = cal0.isLeap((int) (byte) -1);
        java.lang.String str8 = cal0.cal((int) 'a', 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 " + "'", str8, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 ");
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        java.lang.String str9 = cal0.cal(1, 4);
        boolean boolean11 = cal0.isLeap((int) (byte) 100);
        boolean boolean13 = cal0.isLeap(29);
        java.lang.String str16 = cal0.cal(30, 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "    1  2  3  4 " + "'", str9, "    1  2  3  4 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                           1 " + "'", str16, "                                                                                           1 ");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        java.lang.String str11 = cal0.cal((int) (byte) 0, (-1));
        int int14 = cal0.firstOfMonth((int) (short) 1, 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        boolean boolean12 = cal0.isLeap(2);
        int int15 = cal0.firstOfMonth((-1), 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((-1));
        int int18 = cal0.firstOfMonth((-1), 0);
        int int20 = cal0.jan1((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int6 = cal0.numberOfDays(2, 29);
        boolean boolean8 = cal0.isLeap((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(5, (int) (short) 0);
        int int22 = cal0.numberOfDays(2, 0);
        int int25 = cal0.numberOfDays(6, (int) (short) -1);
        int int28 = cal0.numberOfDays(5, (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "               " + "'", str19, "               ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 29 + "'", int22 == 29);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 31 + "'", int28 == 31);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal(6, (int) (short) -1);
        int int22 = cal0.firstOfMonth(1, 29);
        java.lang.Class<?> wildcardClass23 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                  " + "'", str19, "                  ");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 6 + "'", int22 == 6);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        int int11 = cal0.jan1((int) '#');
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        int int15 = cal0.jan1((int) (short) 10);
        java.lang.String str18 = cal0.cal(5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = cal0.firstOfMonth(29, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 32 33 34 35 36 37\n38 39 40 41 42 43 44\n45 46 47 48 49 50 51\n52 53 54 55 56 57 58\n59 60 61 62 63 64 65\n66 67 68 69 70 71 72\n73 74 75 76 77 78 79\n80 81 82 83 84 85 86\n87 88 89 90 91 92 93\n94 95 96 97 98 99 100\n" + "'", str18, "                1  2\n 3  4  5  6  7  8  9\n10 11 12 13 14 15 16\n17 18 19 20 21 22 23\n24 25 26 27 28 29 30\n31 32 33 34 35 36 37\n38 39 40 41 42 43 44\n45 46 47 48 49 50 51\n52 53 54 55 56 57 58\n59 60 61 62 63 64 65\n66 67 68 69 70 71 72\n73 74 75 76 77 78 79\n80 81 82 83 84 85 86\n87 88 89 90 91 92 93\n94 95 96 97 98 99 100\n");
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int14 = cal0.numberOfDays((int) (short) 0, (int) '4');
        java.lang.String str17 = cal0.cal(6, 6);
        int int20 = cal0.firstOfMonth(0, (int) (byte) -1);
        int int22 = cal0.jan1((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                   1\n 2  3  4  5  6 " + "'", str17, "                   1\n 2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) (short) 100, 100);
        boolean boolean9 = cal0.isLeap((int) (byte) 10);
        int int11 = cal0.jan1(0);
        java.lang.String str14 = cal0.cal(1, 0);
        int int16 = cal0.jan1(30);
        java.lang.String str19 = cal0.cal((int) ' ', 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str7, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   " + "'", str14, "   ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 36 37 38\n39 40 41 42 43 44 45\n46 47 48 49 50 51 52\n53 54 55 56 57 58 59\n60 61 62 63 64 65 66\n67 68 69 70 71 72 73\n74 75 76 77 78 79 80\n81 82 83 84 85 86 87\n88 89 90 91 92 93 94\n95 96 97 98 99 100 " + "'", str19, "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 36 37 38\n39 40 41 42 43 44 45\n46 47 48 49 50 51 52\n53 54 55 56 57 58 59\n60 61 62 63 64 65 66\n67 68 69 70 71 72 73\n74 75 76 77 78 79 80\n81 82 83 84 85 86 87\n88 89 90 91 92 93 94\n95 96 97 98 99 100 ");
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        boolean boolean13 = cal0.isLeap(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        int int14 = cal0.firstOfMonth((int) (byte) -1, (int) (short) -1);
        boolean boolean16 = cal0.isLeap(1);
        boolean boolean18 = cal0.isLeap((int) (short) 10);
        boolean boolean20 = cal0.isLeap((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int14 = cal0.firstOfMonth(5, (int) (short) 10);
        java.lang.String str17 = cal0.cal((int) (short) 10, 6);
        int int20 = cal0.firstOfMonth((int) (byte) 1, (int) (short) 100);
        java.lang.String str23 = cal0.cal(1, 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6 " + "'", str17, "                               1  2  3  4\n 5  6 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "    1 " + "'", str23, "    1 ");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.String str15 = cal0.cal((int) (byte) 1, (int) 'a');
        int int17 = cal0.jan1((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str15, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        int int16 = cal0.jan1((int) (byte) 1);
        java.lang.String str19 = cal0.cal(100, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = cal0.numberOfDays((int) '4', 30);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str19, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(4, 30);
        java.lang.String str23 = cal0.cal((int) '4', (-1));
        boolean boolean25 = cal0.isLeap(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str20, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                                                                                                                                                            " + "'", str23, "                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        int int24 = cal0.jan1((int) (byte) 100);
        int int27 = cal0.firstOfMonth(0, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 4 + "'", int27 == 4);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) (short) 1);
        boolean boolean12 = cal0.isLeap((int) (byte) 0);
        int int15 = cal0.numberOfDays(4, (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.numberOfDays(0, 3);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        boolean boolean16 = cal0.isLeap((int) (short) 100);
        java.lang.String str19 = cal0.cal(30, 0);
        boolean boolean21 = cal0.isLeap((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                                                                                          " + "'", str19, "                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        java.lang.String str16 = cal0.cal((int) (short) 10, (int) (short) -1);
        java.lang.Class<?> wildcardClass17 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                              " + "'", str16, "                              ");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = cal0.firstOfMonth((int) 'a', 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.numberOfDays(0, 3);
        int int15 = cal0.jan1(0);
        int int18 = cal0.numberOfDays(1, 30);
        boolean boolean20 = cal0.isLeap(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        boolean boolean23 = cal0.isLeap(10);
        java.lang.String str26 = cal0.cal(1, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = cal0.firstOfMonth(100, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "   " + "'", str26, "   ");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        int int13 = cal0.jan1((int) (short) -1);
        boolean boolean15 = cal0.isLeap(6);
        int int17 = cal0.jan1(6);
        boolean boolean19 = cal0.isLeap(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (byte) 1, 30);
        int int21 = cal0.jan1(3);
        int int23 = cal0.jan1((int) (short) -1);
        boolean boolean25 = cal0.isLeap(31);
        boolean boolean27 = cal0.isLeap((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 " + "'", str19, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        boolean boolean10 = cal0.isLeap(4);
        int int12 = cal0.jan1((-1));
        java.lang.String str15 = cal0.cal((int) (byte) 100, (int) 'a');
        int int18 = cal0.firstOfMonth(5, 3);
        int int20 = cal0.jan1(2);
        int int23 = cal0.numberOfDays(4, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 " + "'", str15, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 30 + "'", int23 == 30);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        boolean boolean9 = cal0.isLeap((int) (short) 10);
        int int11 = cal0.jan1(3);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = cal0.firstOfMonth(30, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.numberOfDays(3, (int) (short) -1);
        java.lang.String str16 = cal0.cal((int) '4', (int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str16, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        boolean boolean16 = cal0.isLeap(100);
        java.lang.String str19 = cal0.cal(2, 4);
        int int21 = cal0.jan1((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       1  2  3  4 " + "'", str19, "       1  2  3  4 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        boolean boolean15 = cal0.isLeap((int) (short) 100);
        int int17 = cal0.jan1(4);
        java.lang.String str20 = cal0.cal(28, (int) '#');
        boolean boolean22 = cal0.isLeap((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                     1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n" + "'", str20, "                                                                                     1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        java.lang.String str10 = cal0.cal((int) (byte) 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str10, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int9 = cal0.firstOfMonth(4, 3);
        int int11 = cal0.jan1((int) ' ');
        boolean boolean13 = cal0.isLeap(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.numberOfDays(0, 3);
        int int15 = cal0.jan1(0);
        int int18 = cal0.numberOfDays(1, 30);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int21 = cal0.numberOfDays((int) (byte) 1, 0);
        boolean boolean23 = cal0.isLeap(10);
        int int25 = cal0.jan1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth((int) '4', 28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        int int15 = cal0.jan1((int) (short) 10);
        int int18 = cal0.firstOfMonth((int) (short) 0, 3);
        boolean boolean20 = cal0.isLeap((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = cal0.firstOfMonth(30, 29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        int int13 = cal0.jan1((int) (short) -1);
        boolean boolean15 = cal0.isLeap(6);
        int int17 = cal0.jan1(6);
        int int20 = cal0.firstOfMonth(4, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1(6);
        boolean boolean4 = cal0.isLeap((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 5 + "'", int2 == 5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass19 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int10 = cal0.jan1(0);
        int int13 = cal0.firstOfMonth((int) (byte) 1, (int) (short) 10);
        int int16 = cal0.numberOfDays((int) (byte) 10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal(10, 31);
        int int20 = cal0.jan1((int) (short) 1);
        boolean boolean22 = cal0.isLeap(31);
        int int25 = cal0.numberOfDays(5, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 31 + "'", int25 == 31);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int11 = cal0.firstOfMonth((int) (short) -1, 30);
        boolean boolean13 = cal0.isLeap((int) (byte) 10);
        java.lang.String str16 = cal0.cal(28, (int) (byte) 10);
        int int18 = cal0.jan1((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                     1  2  3  4  5  6  7\n 8  9 10 " + "'", str16, "                                                                                     1  2  3  4  5  6  7\n 8  9 10 ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(5, (int) (short) 0);
        int int13 = cal0.numberOfDays(0, 3);
        int int15 = cal0.jan1(0);
        boolean boolean17 = cal0.isLeap(0);
        int int19 = cal0.jan1((int) '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "               " + "'", str10, "               ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 6 + "'", int19 == 6);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        java.lang.String str12 = cal0.cal((int) (byte) 1, (int) 'a');
        int int14 = cal0.jan1(0);
        boolean boolean16 = cal0.isLeap(4);
        java.lang.String str19 = cal0.cal((int) (short) 10, 4);
        boolean boolean21 = cal0.isLeap(28);
        int int24 = cal0.numberOfDays((int) (short) 0, (int) (byte) 100);
        int int27 = cal0.firstOfMonth((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str12, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n" + "'", str19, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        java.lang.String str25 = cal0.cal((int) (byte) 10, 0);
        int int27 = cal0.jan1((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "                              " + "'", str25, "                              ");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 6 + "'", int27 == 6);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        boolean boolean9 = cal0.isLeap((int) (short) 10);
        int int11 = cal0.jan1(3);
        int int13 = cal0.jan1(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = cal0.numberOfDays((-1), (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int19 = cal0.numberOfDays(4, (int) (byte) 1);
        int int21 = cal0.jan1(31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        int int5 = cal0.jan1(10);
        java.lang.Class<?> wildcardClass6 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        java.lang.String str6 = cal0.cal((int) 'a', (int) 'a');
        int int9 = cal0.numberOfDays(1, (int) ' ');
        int int11 = cal0.jan1(6);
        int int14 = cal0.firstOfMonth((int) (short) 0, 3);
        java.lang.String str17 = cal0.cal((int) (short) 100, 2);
        int int20 = cal0.firstOfMonth(1, 28);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 " + "'", str6, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2 " + "'", str17, "                                                                                                                                                                                                                                                                                                             1  2 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        java.lang.String str14 = cal0.cal(31, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                             " + "'", str14, "                                                                                             ");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal(6, (int) (byte) 0);
        boolean boolean16 = cal0.isLeap((int) (short) 1);
        java.lang.String str19 = cal0.cal(3, (int) (short) 10);
        java.lang.String str22 = cal0.cal((int) (short) 0, 6);
        int int25 = cal0.firstOfMonth(4, 5);
        boolean boolean27 = cal0.isLeap(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                  " + "'", str14, "                  ");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 " + "'", str19, "          1  2  3  4\n 5  6  7  8  9 10 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + " 1  2  3  4  5  6 " + "'", str22, " 1  2  3  4  5  6 ");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 3 + "'", int25 == 3);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        java.lang.String str11 = cal0.cal((int) (byte) 0, (-1));
        int int13 = cal0.jan1(5);
        int int16 = cal0.numberOfDays((int) (byte) 10, 30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        boolean boolean12 = cal0.isLeap((-1));
        int int15 = cal0.firstOfMonth((int) (short) 1, 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 6 + "'", int15 == 6);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int14 = cal0.firstOfMonth(5, (int) (short) 10);
        java.lang.String str17 = cal0.cal((int) (short) 10, 6);
        java.lang.String str20 = cal0.cal((int) (short) 10, (int) (byte) 0);
        boolean boolean22 = cal0.isLeap((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6 " + "'", str17, "                               1  2  3  4\n 5  6 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                              " + "'", str20, "                              ");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        boolean boolean13 = cal0.isLeap((int) (short) 10);
        boolean boolean15 = cal0.isLeap(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        boolean boolean4 = cal0.isLeap((-1));
        int int6 = cal0.jan1((int) (byte) 1);
        java.lang.String str9 = cal0.cal((int) (short) 100, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 6 + "'", int6 == 6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "                                                                                                                                                                                                                                                                                                             1 " + "'", str9, "                                                                                                                                                                                                                                                                                                             1 ");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        boolean boolean19 = cal0.isLeap(1);
        boolean boolean21 = cal0.isLeap(6);
        int int24 = cal0.firstOfMonth(4, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        int int15 = cal0.jan1((int) 'a');
        java.lang.String str18 = cal0.cal((int) '#', 1);
        boolean boolean20 = cal0.isLeap((int) (byte) 1);
        int int23 = cal0.firstOfMonth(2, 100);
        int int25 = cal0.jan1(28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                          1 " + "'", str18, "                                                                                                          1 ");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        boolean boolean5 = cal0.isLeap(0);
        int int7 = cal0.jan1((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int8 = cal0.jan1(3);
        int int11 = cal0.firstOfMonth((int) (byte) -1, (int) (byte) 1);
        int int14 = cal0.firstOfMonth((int) (byte) -1, (int) (short) -1);
        boolean boolean16 = cal0.isLeap(1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = cal0.firstOfMonth((int) ' ', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 6 + "'", int11 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.numberOfDays(1, (-1));
        int int12 = cal0.jan1((int) '4');
        java.lang.String str15 = cal0.cal((int) (byte) 0, 4);
        int int18 = cal0.numberOfDays(0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 31 + "'", int10 == 31);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4 " + "'", str15, " 1  2  3  4 ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 6 + "'", int10 == 6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        boolean boolean15 = cal0.isLeap((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = cal0.firstOfMonth(100, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        java.lang.String str18 = cal0.cal(31, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                              1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 " + "'", str18, "                                                                                              1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 ");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        java.lang.String str18 = cal0.cal((int) (short) 100, (int) (byte) 0);
        java.lang.String str21 = cal0.cal(30, 31);
        boolean boolean23 = cal0.isLeap(31);
        java.lang.Class<?> wildcardClass24 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                            " + "'", str18, "                                                                                                                                                                                                                                                                                                            ");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 " + "'", str21, "                                                                                           1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 ");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        java.lang.String str15 = cal0.cal((int) (short) 0, (int) (short) 100);
        int int17 = cal0.jan1((int) (short) 0);
        java.lang.String str20 = cal0.cal(30, (int) (byte) -1);
        java.lang.String str23 = cal0.cal((int) (short) -1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = cal0.firstOfMonth(29, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, " 1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                          " + "'", str20, "                                                                                          ");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str23, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(0, (int) (byte) 1);
        boolean boolean5 = cal0.isLeap((int) (short) 10);
        int int7 = cal0.jan1(29);
        int int9 = cal0.jan1((int) (byte) 0);
        java.lang.Class<?> wildcardClass10 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 1 " + "'", str3, " 1 ");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(2, (int) (byte) 100);
        java.lang.String str22 = cal0.cal((int) (byte) -1, (-1));
        boolean boolean24 = cal0.isLeap((int) '#');
        int int26 = cal0.jan1(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 " + "'", str19, "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 32 33\n34 35 36 37 38 39 40\n41 42 43 44 45 46 47\n48 49 50 51 52 53 54\n55 56 57 58 59 60 61\n62 63 64 65 66 67 68\n69 70 71 72 73 74 75\n76 77 78 79 80 81 82\n83 84 85 86 87 88 89\n90 91 92 93 94 95 96\n97 98 99 100 ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 3 + "'", int26 == 3);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int13 = cal0.jan1((int) (byte) 1);
        int int15 = cal0.jan1((int) (short) 10);
        java.lang.String str18 = cal0.cal((int) 'a', (-1));
        int int21 = cal0.numberOfDays(3, (int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                                                                                                                                                                                                                   " + "'", str18, "                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 31 + "'", int21 == 31);
    }
}


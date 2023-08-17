import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int16 = cal0.firstOfMonth(0, 0);
        java.lang.Class<?> wildcardClass17 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        int int15 = cal0.jan1((int) (short) 10);
        boolean boolean17 = cal0.isLeap(5);
        boolean boolean19 = cal0.isLeap(10);
        int int22 = cal0.numberOfDays(10, (int) ' ');
        boolean boolean24 = cal0.isLeap(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 31 + "'", int22 == 31);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        boolean boolean10 = cal0.isLeap(0);
        java.lang.String str13 = cal0.cal((int) '4', 100);
        int int16 = cal0.firstOfMonth(3, 29);
        java.lang.String str19 = cal0.cal((int) (short) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str13, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + " 1 " + "'", str19, " 1 ");
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        int int13 = cal0.jan1((int) (short) -1);
        int int15 = cal0.jan1((int) (short) 0);
        java.lang.String str18 = cal0.cal(1, (int) (short) 1);
        int int20 = cal0.jan1(28);
        int int22 = cal0.jan1((int) (short) 10);
        int int25 = cal0.firstOfMonth(2, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "    1 " + "'", str18, "    1 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 4 + "'", int20 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        int int9 = cal0.firstOfMonth((int) (byte) -1, (-1));
        int int12 = cal0.firstOfMonth(5, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
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
        int int27 = cal0.firstOfMonth(10, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str12, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n" + "'", str19, "                               1  2  3  4\n");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 5 + "'", int27 == 5);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, (int) (short) -1);
        int int14 = cal0.numberOfDays(0, 6);
        int int16 = cal0.jan1((int) 'a');
        int int18 = cal0.jan1(31);
        int int20 = cal0.jan1(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.numberOfDays(10, (int) (short) -1);
        boolean boolean11 = cal0.isLeap((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 31 + "'", int9 == 31);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 1, 0);
        java.lang.String str12 = cal0.cal(0, 5);
        java.lang.String str15 = cal0.cal(28, 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + " 1  2  3  4  5 " + "'", str12, " 1  2  3  4  5 ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "                                                                                     1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 " + "'", str15, "                                                                                     1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 33 34 35\n36 37 38 39 40 41 42\n43 44 45 46 47 48 49\n50 51 52 53 54 55 56\n57 58 59 60 61 62 63\n64 65 66 67 68 69 70\n71 72 73 74 75 76 77\n78 79 80 81 82 83 84\n85 86 87 88 89 90 91\n92 93 94 95 96 97 98\n99 100 ");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1((int) 'a');
        boolean boolean8 = cal0.isLeap(1);
        boolean boolean10 = cal0.isLeap(0);
        java.lang.String str13 = cal0.cal((int) '4', 100);
        int int16 = cal0.firstOfMonth(1, 10);
        java.lang.Class<?> wildcardClass17 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str13, "                                                                                                                                                             1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        boolean boolean16 = cal0.isLeap(4);
        int int18 = cal0.jan1(3);
        java.lang.String str21 = cal0.cal((int) ' ', 5);
        int int23 = cal0.jan1(28);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "                                                                                                 1  2  3\n 4  5 " + "'", str21, "                                                                                                 1  2  3\n 4  5 ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 4 + "'", int23 == 4);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        int int18 = cal0.firstOfMonth((-1), 3);
        java.lang.String str21 = cal0.cal((int) (byte) 0, 2);
        int int23 = cal0.jan1(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + " 1  2 " + "'", str21, " 1  2 ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        int int29 = cal0.firstOfMonth((int) (short) 0, (int) (byte) 0);
        int int32 = cal0.firstOfMonth((int) (short) -1, (int) '#');
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 6 + "'", int32 == 6);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
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
        int int26 = cal0.jan1((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       1 " + "'", str16, "       1 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str19, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 6 + "'", int21 == 6);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 " + "'", str24, " 1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 ");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        java.lang.String str9 = cal0.cal((-1), 3);
        boolean boolean11 = cal0.isLeap(100);
        boolean boolean13 = cal0.isLeap((int) (byte) -1);
        int int15 = cal0.jan1((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + " 1\n 2  3 " + "'", str9, " 1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        int int13 = cal0.jan1((int) (short) -1);
        int int15 = cal0.jan1((int) (short) 0);
        java.lang.String str18 = cal0.cal((int) (short) 1, (int) 'a');
        boolean boolean20 = cal0.isLeap((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n" + "'", str18, "    1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 30 31 32 33 34\n35 36 37 38 39 40 41\n42 43 44 45 46 47 48\n49 50 51 52 53 54 55\n56 57 58 59 60 61 62\n63 64 65 66 67 68 69\n70 71 72 73 74 75 76\n77 78 79 80 81 82 83\n84 85 86 87 88 89 90\n91 92 93 94 95 96 97\n");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        boolean boolean6 = cal0.isLeap(31);
        boolean boolean8 = cal0.isLeap((int) (byte) 10);
        java.lang.Class<?> wildcardClass9 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        int int8 = cal0.firstOfMonth(2, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        int int15 = cal0.jan1((int) (short) 10);
        boolean boolean17 = cal0.isLeap(5);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        java.lang.String str14 = cal0.cal((int) ' ', 2);
        java.lang.String str17 = cal0.cal(31, 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "                                                                                                 1  2 " + "'", str14, "                                                                                                 1  2 ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                                                                                             " + "'", str17, "                                                                                             ");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int7 = cal0.numberOfDays(0, (int) (short) 10);
        boolean boolean9 = cal0.isLeap(30);
        boolean boolean11 = cal0.isLeap(0);
        boolean boolean13 = cal0.isLeap(100);
        java.lang.String str16 = cal0.cal((int) 'a', 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 " + "'", str16, "                                                                                                                                                                                                                                                                                                    1\n 2  3  4  5  6  7  8\n 9 10 11 12 13 14 15\n16 17 18 19 20 21 22\n23 24 25 26 27 28 29\n30 31 32 33 34 35 36\n37 38 39 40 41 42 43\n44 45 46 47 48 49 50\n51 52 53 54 55 56 57\n58 59 60 61 62 63 64\n65 66 67 68 69 70 71\n72 73 74 75 76 77 78\n79 80 81 82 83 84 85\n86 87 88 89 90 91 92\n93 94 95 96 97 98 99\n100 ");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((-1));
        java.lang.String str18 = cal0.cal(29, 29);
        int int21 = cal0.firstOfMonth(6, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int24 = cal0.firstOfMonth((int) '4', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 " + "'", str18, "                                                                                        1  2  3  4  5  6\n 7  8  9 10 11 12 13\n14 15 16 17 18 19 20\n21 22 23 24 25 26 27\n28 29 ");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.firstOfMonth(5, (int) (short) 0);
        java.lang.String str16 = cal0.cal((int) (short) -1, 10);
        java.lang.String str19 = cal0.cal(5, (int) (short) 0);
        boolean boolean21 = cal0.isLeap((int) (short) 0);
        int int24 = cal0.firstOfMonth((int) (byte) -1, 6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + " 1\n 2  3  4  5  6  7  8\n 9 10 " + "'", str16, " 1\n 2  3  4  5  6  7  8\n 9 10 ");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "               " + "'", str19, "               ");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth((-1), 10);
        int int7 = cal0.jan1((int) 'a');
        java.lang.String str10 = cal0.cal(100, 31);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 " + "'", str10, "                                                                                                                                                                                                                                                                                                             1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 30 31 ");
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(31, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "                                                                                              1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n" + "'", str20, "                                                                                              1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n");
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        int int12 = cal0.jan1((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int15 = cal0.numberOfDays((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        int int29 = cal0.firstOfMonth((int) (short) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = cal0.firstOfMonth(31, (int) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 6 + "'", int26 == 6);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        int int28 = cal0.jan1((int) (byte) 0);
        int int31 = cal0.firstOfMonth((int) (short) 1, (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 3 + "'", int31 == 3);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) (byte) 100);
        int int11 = cal0.firstOfMonth((int) (short) 1, (int) (byte) 100);
        int int13 = cal0.jan1((int) (byte) 10);
        int int15 = cal0.jan1((int) (byte) 0);
        java.lang.String str18 = cal0.cal((int) ' ', 30);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = cal0.firstOfMonth(30, 6);
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
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str18, "                                                                                                 1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int10 = cal0.firstOfMonth(4, 100);
        int int13 = cal0.numberOfDays(3, (int) (short) -1);
        int int16 = cal0.firstOfMonth((int) (byte) 0, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 31 + "'", int13 == 31);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int5 = cal0.firstOfMonth(1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        boolean boolean12 = cal0.isLeap(4);
        int int15 = cal0.numberOfDays((int) (byte) 10, 5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 31 + "'", int15 == 31);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        int int20 = cal0.numberOfDays(4, 6);
        int int23 = cal0.firstOfMonth((int) (byte) 0, (int) (short) 1);
        int int25 = cal0.jan1((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 30 + "'", int20 == 30);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 6 + "'", int23 == 6);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 6 + "'", int25 == 6);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        int int9 = cal0.jan1((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = cal0.firstOfMonth((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 13 out of bounds for length 13");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        cal.Cal cal0 = new cal.Cal();
        java.lang.String str3 = cal0.cal(10, (int) 'a');
        int int5 = cal0.jan1(6);
        int int8 = cal0.numberOfDays((int) (byte) 10, 10);
        java.lang.String str11 = cal0.cal((int) 'a', (int) (byte) 1);
        int int13 = cal0.jan1((int) (short) -1);
        java.lang.Class<?> wildcardClass14 = cal0.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 " + "'", str3, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 ");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 5 + "'", int5 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                                                                                                                                                                                                                    1\n" + "'", str11, "                                                                                                                                                                                                                                                                                                    1\n");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        int int9 = cal0.firstOfMonth((int) (short) 0, 10);
        int int12 = cal0.firstOfMonth((int) (short) 0, (-1));
        boolean boolean14 = cal0.isLeap((-1));
        java.lang.String str17 = cal0.cal((int) (short) -1, 4);
        java.lang.String str20 = cal0.cal(4, 30);
        int int23 = cal0.numberOfDays(1, (int) (byte) 10);
        java.lang.String str26 = cal0.cal(2, 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + " 1\n 2  3  4 " + "'", str17, " 1\n 2  3  4 ");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 " + "'", str20, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 ");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 31 + "'", int23 == 31);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 " + "'", str26, "       1  2  3  4  5\n 6  7  8  9 10 11 12\n13 14 15 16 17 18 19\n20 21 22 23 24 25 26\n27 28 29 ");
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        boolean boolean19 = cal0.isLeap(1);
        boolean boolean21 = cal0.isLeap(6);
        java.lang.Class<?> wildcardClass22 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(6, 3);
        boolean boolean12 = cal0.isLeap((int) 'a');
        int int15 = cal0.firstOfMonth(4, 29);
        int int17 = cal0.jan1(0);
        java.lang.Class<?> wildcardClass18 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                   1\n 2  3 " + "'", str10, "                   1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        int int5 = cal0.numberOfDays(0, (int) (byte) -1);
        int int8 = cal0.numberOfDays(4, (int) ' ');
        int int10 = cal0.jan1(30);
        java.lang.Class<?> wildcardClass11 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        int int13 = cal0.jan1(0);
        int int15 = cal0.jan1((int) (short) 10);
        int int18 = cal0.firstOfMonth((int) (short) 0, 3);
        int int21 = cal0.firstOfMonth(0, 5);
        java.lang.String str24 = cal0.cal((int) '#', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "                                                                                                          1  2  3  4  5  6 " + "'", str24, "                                                                                                          1  2  3  4  5  6 ");
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        int int11 = cal0.firstOfMonth(0, 0);
        java.lang.String str14 = cal0.cal((int) (byte) -1, (int) (short) -1);
        java.lang.String str17 = cal0.cal((int) (short) 10, (int) (byte) 100);
        int int20 = cal0.numberOfDays(10, (int) (byte) 10);
        java.lang.String str23 = cal0.cal((int) (short) 10, 100);
        int int26 = cal0.firstOfMonth(5, (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str17, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 31 + "'", int20 == 31);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 " + "'", str23, "                               1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 32\n33 34 35 36 37 38 39\n40 41 42 43 44 45 46\n47 48 49 50 51 52 53\n54 55 56 57 58 59 60\n61 62 63 64 65 66 67\n68 69 70 71 72 73 74\n75 76 77 78 79 80 81\n82 83 84 85 86 87 88\n89 90 91 92 93 94 95\n96 97 98 99 100 ");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        java.lang.String str5 = cal0.cal((int) '#', (int) ' ');
        int int7 = cal0.jan1(5);
        java.lang.Class<?> wildcardClass8 = cal0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 " + "'", str5, "                                                                                                          1  2  3  4  5  6  7\n 8  9 10 11 12 13 14\n15 16 17 18 19 20 21\n22 23 24 25 26 27 28\n29 30 31 32 ");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 4 + "'", int7 == 4);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        cal.Cal cal0 = new cal.Cal();
        boolean boolean2 = cal0.isLeap(6);
        int int4 = cal0.jan1((int) (byte) 1);
        int int6 = cal0.jan1(4);
        int int8 = cal0.jan1(30);
        int int11 = cal0.numberOfDays((int) (short) 1, (int) 'a');
        int int14 = cal0.firstOfMonth((int) (byte) 1, 2);
        java.lang.String str17 = cal0.cal(4, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 6 + "'", int4 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 31 + "'", int11 == 31);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 " + "'", str17, "             1  2  3\n 4  5  6  7  8  9 10\n11 12 13 14 15 16 17\n18 19 20 21 22 23 24\n25 26 27 28 29 30 31\n32 33 34 35 ");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.firstOfMonth(1, (int) (byte) 1);
        int int6 = cal0.firstOfMonth((int) (short) 1, 0);
        boolean boolean8 = cal0.isLeap((int) ' ');
        java.lang.String str11 = cal0.cal((int) ' ', (int) (byte) 0);
        boolean boolean13 = cal0.isLeap((int) (short) 0);
        boolean boolean15 = cal0.isLeap(3);
        int int17 = cal0.jan1((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 6 + "'", int3 == 6);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "                                                                                                " + "'", str11, "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        cal.Cal cal0 = new cal.Cal();
        int int2 = cal0.jan1((int) '#');
        boolean boolean4 = cal0.isLeap((int) '4');
        java.lang.String str7 = cal0.cal((int) '#', 2);
        java.lang.String str10 = cal0.cal(6, 3);
        boolean boolean12 = cal0.isLeap((int) 'a');
        int int15 = cal0.firstOfMonth(4, 29);
        java.lang.String str18 = cal0.cal(3, 31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 6 + "'", int2 == 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "                                                                                                          1  2 " + "'", str7, "                                                                                                          1  2 ");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "                   1\n 2  3 " + "'", str10, "                   1\n 2  3 ");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 " + "'", str18, "          1  2  3  4\n 5  6  7  8  9 10 11\n12 13 14 15 16 17 18\n19 20 21 22 23 24 25\n26 27 28 29 30 31 ");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        cal.Cal cal0 = new cal.Cal();
        int int3 = cal0.numberOfDays((int) (short) 1, 3);
        java.lang.String str6 = cal0.cal((-1), 5);
        int int9 = cal0.firstOfMonth((int) (byte) 10, 2);
        boolean boolean11 = cal0.isLeap((int) (byte) -1);
        int int13 = cal0.jan1(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " 1\n 2  3  4  5 " + "'", str6, " 1\n 2  3  4  5 ");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest01 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        int int0 = Movie.NEW_RELEASE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = Movie.REGULAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = Movie.CHILDRENS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Movie movie2 = new Movie("hi!", 1);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Movie movie2 = new Movie("", (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        Movie movie2 = new Movie("", (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Movie movie2 = new Movie("", (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Movie movie2 = new Movie("hi!", 0);
        int int3 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        Movie movie2 = new Movie("hi!", (int) (short) 0);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        java.lang.String str8 = movie2.getTitle();
        movie2.setPriceCode(2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Movie movie2 = new Movie("", 1);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        java.lang.String str6 = movie2.getTitle();
        java.lang.String str7 = movie2.getTitle();
        java.lang.Class<?> wildcardClass8 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        movie2.setPriceCode((int) (short) 1);
        java.lang.Class<?> wildcardClass11 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        java.lang.String str8 = movie2.getTitle();
        java.lang.Class<?> wildcardClass9 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        java.lang.String str5 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Movie movie2 = new Movie("hi!", 0);
        movie2.setPriceCode((int) (short) 0);
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        java.lang.String str6 = movie2.getTitle();
        int int7 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass8 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Movie movie2 = new Movie("hi!", 0);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        Movie movie2 = new Movie("", (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        Movie movie2 = new Movie("", 2);
        int int3 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        java.lang.String str6 = movie2.getTitle();
        int int7 = movie2.getPriceCode();
        movie2.setPriceCode((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Movie movie2 = new Movie("", 2);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        Movie movie2 = new Movie("", 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        int int9 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass10 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        java.lang.String str5 = movie2.getTitle();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Movie movie2 = new Movie("hi!", 0);
        java.lang.String str3 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        int int9 = movie2.getPriceCode();
        int int10 = movie2.getPriceCode();
        int int11 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass12 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        java.lang.String str5 = movie2.getTitle();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Movie movie2 = new Movie("", 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Movie movie2 = new Movie("hi!", 0);
        movie2.setPriceCode((int) (short) 0);
        int int5 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        movie2.setPriceCode((int) (short) 1);
        java.lang.String str11 = movie2.getTitle();
        java.lang.Class<?> wildcardClass12 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        java.lang.String str5 = movie2.getTitle();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        int int9 = movie2.getPriceCode();
        int int10 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        java.lang.String str8 = movie2.getTitle();
        java.lang.String str9 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Movie movie2 = new Movie("hi!", 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        Movie movie2 = new Movie("", (int) (short) 0);
        java.lang.String str3 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        int int8 = movie2.getPriceCode();
        int int9 = movie2.getPriceCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        movie2.setPriceCode(2);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass7 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        java.lang.String str7 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        int int8 = movie2.getPriceCode();
        java.lang.String str9 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        Movie movie2 = new Movie("hi!", 2);
        int int3 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Movie movie2 = new Movie("hi!", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode((int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Movie movie2 = new Movie("hi!", 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        java.lang.String str7 = movie2.getTitle();
        movie2.setPriceCode(2);
        java.lang.String str10 = movie2.getTitle();
        int int11 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass12 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 1);
        java.lang.Class<?> wildcardClass9 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        movie2.setPriceCode((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        java.lang.String str7 = movie2.getTitle();
        int int8 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        java.lang.String str5 = movie2.getTitle();
        movie2.setPriceCode((int) (short) 1);
        movie2.setPriceCode((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Movie movie2 = new Movie("", 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        int int5 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        Movie movie2 = new Movie("", 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        java.lang.String str7 = movie2.getTitle();
        movie2.setPriceCode(2);
        java.lang.String str10 = movie2.getTitle();
        int int11 = movie2.getPriceCode();
        int int12 = movie2.getPriceCode();
        java.lang.String str13 = movie2.getTitle();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(1);
        java.lang.String str5 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Movie movie2 = new Movie("", 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        int int5 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        java.lang.String str8 = movie2.getTitle();
        movie2.setPriceCode((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        movie2.setPriceCode(2);
        java.lang.String str7 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Movie movie2 = new Movie("", (int) (short) 1);
        int int3 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Movie movie2 = new Movie("", 1);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 1);
        java.lang.String str9 = movie2.getTitle();
        int int10 = movie2.getPriceCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Movie movie2 = new Movie("", 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        int int5 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        int int8 = movie2.getPriceCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        int int5 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        Movie movie2 = new Movie("hi!", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        movie2.setPriceCode((int) (short) 1);
        movie2.setPriceCode((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Movie movie2 = new Movie("", 2);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        Movie movie2 = new Movie("", 0);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        int int5 = movie2.getPriceCode();
        java.lang.String str6 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        int int9 = movie2.getPriceCode();
        int int10 = movie2.getPriceCode();
        int int11 = movie2.getPriceCode();
        java.lang.String str12 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        Movie movie2 = new Movie("hi!", 0);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        movie2.setPriceCode((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        int int4 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        movie2.setPriceCode((int) (byte) 0);
        java.lang.String str8 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        int int3 = movie2.getPriceCode();
        int int4 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        Movie movie2 = new Movie("", 0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        int int6 = movie2.getPriceCode();
        movie2.setPriceCode((int) (byte) 0);
        movie2.setPriceCode((int) (short) 1);
        int int11 = movie2.getPriceCode();
        java.lang.String str12 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        Movie movie2 = new Movie("", 1);
        int int3 = movie2.getPriceCode();
        int int4 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        java.lang.String str5 = movie2.getTitle();
        movie2.setPriceCode((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        movie2.setPriceCode((int) (byte) 0);
        java.lang.String str8 = movie2.getTitle();
        java.lang.String str9 = movie2.getTitle();
        java.lang.Class<?> wildcardClass10 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        Movie movie2 = new Movie("", (int) (byte) 0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        java.lang.String str5 = movie2.getTitle();
        java.lang.Class<?> wildcardClass6 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        Movie movie2 = new Movie("hi!", (int) (byte) 1);
        movie2.setPriceCode(0);
        java.lang.String str5 = movie2.getTitle();
        movie2.setPriceCode((int) (byte) 0);
        movie2.setPriceCode((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }
}


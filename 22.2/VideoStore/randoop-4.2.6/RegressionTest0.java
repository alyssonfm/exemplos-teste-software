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
        int int0 = Movie.REGULAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = Movie.NEW_RELEASE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        int int0 = Movie.CHILDRENS;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(1);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        Customer customer1 = new Customer("");
        java.lang.Class<?> wildcardClass2 = customer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.getName();
        java.lang.String str3 = customerR1.statement();
        java.lang.String str4 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.getName();
        java.lang.String str5 = customer1.htmlStatement();
        java.lang.String str6 = customer1.getName();
        java.lang.String str7 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str5, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str7, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode(0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode(0);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.getName();
        java.lang.String str3 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        java.lang.Class<?> wildcardClass5 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.getName();
        java.lang.String str4 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        Movie movie2 = new Movie("", 2);
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.getName();
        java.lang.String str5 = customer1.htmlStatement();
        java.lang.Class<?> wildcardClass6 = customer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str5, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.getName();
        java.lang.String str4 = customerR1.statement();
        java.lang.String str5 = customerR1.getName();
        java.lang.Class<?> wildcardClass6 = customerR1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        Customer customer1 = new Customer("Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.statement();
        java.lang.String str4 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        Customer customer1 = new Customer("");
        java.lang.String str2 = customer1.statement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(1);
        java.lang.String str8 = movie2.getTitle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str8, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        CustomerR customerR1 = new CustomerR("<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.Class<?> wildcardClass4 = customer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        Customer customer1 = new Customer("<H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for <H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for <H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", (int) (byte) 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        Customer customer1 = new Customer("");
        java.lang.String str2 = customer1.statement();
        java.lang.String str3 = customer1.getName();
        java.lang.String str4 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        Customer customer1 = new Customer("");
        java.lang.String str2 = customer1.statement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        Customer customer1 = new Customer("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customer1.statement();
        java.lang.String str3 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        CustomerR customerR1 = new CustomerR("hi!");
        java.lang.String str2 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.getName();
        java.lang.String str5 = customer1.htmlStatement();
        java.lang.String str6 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str5, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        Customer customer1 = new Customer("<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        Movie movie2 = new Movie("", 2);
        java.lang.String str3 = movie2.getTitle();
        java.lang.String str4 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        int int6 = movie2.getPriceCode();
        java.lang.String str7 = movie2.getTitle();
        java.lang.String str8 = movie2.getTitle();
        java.lang.Class<?> wildcardClass9 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str8, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        CustomerR customerR1 = new CustomerR("<H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        CustomerR customerR1 = new CustomerR("hi!");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.statement();
        java.lang.String str4 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(1);
        movie2.setPriceCode(1);
        movie2.setPriceCode(2);
        java.lang.String str12 = movie2.getTitle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str12, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.getName();
        java.lang.Class<?> wildcardClass6 = customer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.statement();
        java.lang.String str6 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        java.lang.String str6 = movie2.getTitle();
        java.lang.Class<?> wildcardClass7 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        int int6 = movie2.getPriceCode();
        int int7 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        CustomerR customerR1 = new CustomerR("Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        Movie movie2 = new Movie("", 2);
        java.lang.String str3 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.getName();
        java.lang.String str6 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        CustomerR customerR1 = new CustomerR("Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        java.lang.String str4 = movie2.getTitle();
        int int5 = movie2.getPriceCode();
        java.lang.String str6 = movie2.getTitle();
        java.lang.String str7 = movie2.getTitle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(1);
        movie2.setPriceCode(1);
        movie2.setPriceCode(2);
        movie2.setPriceCode(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        java.lang.String str6 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        CustomerR customerR1 = new CustomerR("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        CustomerR customerR1 = new CustomerR("Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.statement();
        java.lang.Class<?> wildcardClass3 = customerR1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        Customer customer1 = new Customer("");
        java.lang.String str2 = customer1.statement();
        java.lang.String str3 = customer1.getName();
        java.lang.String str4 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        Customer customer1 = new Customer("");
        java.lang.String str2 = customer1.getName();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.Class<?> wildcardClass4 = customer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.getName();
        java.lang.String str6 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(1);
        movie2.setPriceCode(1);
        int int10 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        Customer customer1 = new Customer("Rental Record for <H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        CustomerR customerR1 = new CustomerR("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customerR1.getName();
        java.lang.String str3 = customerR1.statement();
        java.lang.String str4 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for <H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode(0);
        java.lang.String str6 = movie2.getTitle();
        java.lang.Class<?> wildcardClass7 = movie2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        Movie movie2 = new Movie("Rental Record for Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points", (int) (short) 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        Customer customer1 = new Customer("<H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM><H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM><H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        java.lang.String str6 = movie2.getTitle();
        java.lang.String str7 = movie2.getTitle();
        java.lang.String str8 = movie2.getTitle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str8, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.statement();
        java.lang.String str4 = customerR1.getName();
        java.lang.String str5 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        // The following exception was thrown during execution in test generation
        try {
            Movie movie2 = new Movie("Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        int int4 = movie2.getPriceCode();
        movie2.setPriceCode((int) (short) 0);
        java.lang.String str7 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        Customer customer1 = new Customer("<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str5, "<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        Customer customer1 = new Customer("Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        Customer customer1 = new Customer("<H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for <H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        CustomerR customerR1 = new CustomerR("hi!");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.getName();
        java.lang.String str4 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.getName();
        java.lang.String str5 = customer1.htmlStatement();
        java.lang.String str6 = customer1.getName();
        java.lang.String str7 = customer1.htmlStatement();
        java.lang.String str8 = customer1.statement();
        java.lang.String str9 = customer1.htmlStatement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str5, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str8, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str9, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        CustomerR customerR1 = new CustomerR("Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.getName();
        java.lang.String str3 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        Customer customer1 = new Customer("Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        movie2.setPriceCode(1);
        movie2.setPriceCode(1);
        movie2.setPriceCode(2);
        int int12 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        CustomerR customerR1 = new CustomerR("Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        CustomerR customerR1 = new CustomerR("hi!");
        java.lang.Class<?> wildcardClass2 = customerR1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode(0);
        java.lang.String str6 = movie2.getTitle();
        java.lang.String str7 = movie2.getTitle();
        java.lang.String str8 = movie2.getTitle();
        java.lang.String str9 = movie2.getTitle();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str8, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str9, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.getName();
        java.lang.String str5 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        int int4 = movie2.getPriceCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        Movie movie2 = new Movie("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points", 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        Movie movie2 = new Movie("Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points", 0);
        java.lang.Class<?> wildcardClass3 = movie2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        // The following exception was thrown during execution in test generation
        try {
            movie2.setPriceCode((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incorrect Price Code");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.getName();
        java.lang.String str5 = customer1.htmlStatement();
        java.lang.String str6 = customer1.getName();
        java.lang.Class<?> wildcardClass7 = customer1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str5, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        java.lang.String str3 = movie2.getTitle();
        movie2.setPriceCode(0);
        java.lang.String str6 = movie2.getTitle();
        java.lang.String str7 = movie2.getTitle();
        int int8 = movie2.getPriceCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str6, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        CustomerR customerR1 = new CustomerR("Rental Record for <H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for <H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for <H1>Rentals for <EM>Rental Record for Rental Record for hi!\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        Movie movie2 = new Movie("Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points", 2);
        int int3 = movie2.getPriceCode();
        java.lang.Class<?> wildcardClass4 = movie2.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        CustomerR customerR1 = new CustomerR("Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        Movie movie2 = new Movie("<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", 0);
        int int3 = movie2.getPriceCode();
        movie2.setPriceCode(0);
        int int6 = movie2.getPriceCode();
        java.lang.String str7 = movie2.getTitle();
        java.lang.String str8 = movie2.getTitle();
        java.lang.String str9 = movie2.getTitle();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str7, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str8, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str9, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        CustomerR customerR1 = new CustomerR("<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.getName();
        java.lang.Class<?> wildcardClass4 = customerR1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for <H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for <H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM><H1>Rentals for <EM></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        CustomerR customerR1 = new CustomerR("Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customerR1.getName();
        java.lang.String str3 = customerR1.statement();
        java.lang.String str4 = customerR1.statement();
        java.lang.String str5 = customerR1.statement();
        java.lang.String str6 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        CustomerR customerR1 = new CustomerR("");
        java.lang.String str2 = customerR1.statement();
        java.lang.String str3 = customerR1.getName();
        java.lang.String str4 = customerR1.statement();
        java.lang.String str5 = customerR1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str2, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.statement();
        java.lang.String str4 = customer1.statement();
        java.lang.String str5 = customer1.getName();
        java.lang.String str6 = customer1.getName();
        java.lang.String str7 = customer1.statement();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str3, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str4, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str6, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str7, "Rental Record for Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points\nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        Movie movie2 = new Movie("<H1>Rentals for <EM><H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P></EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>", (int) (byte) 0);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        Customer customer1 = new Customer("Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
        java.lang.String str2 = customer1.htmlStatement();
        java.lang.String str3 = customer1.htmlStatement();
        java.lang.String str4 = customer1.htmlStatement();
        java.lang.String str5 = customer1.getName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str2, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str3, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>" + "'", str4, "<H1>Rentals for <EM>Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points</EM></H1><P>\n<P>You owe <EM>0.0</EM><P>\nOn this rental you earned <EM>0</EM> frequent renter points<P>");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points" + "'", str5, "Rental Record for \nAmount owed is 0.0\nYou earned 0 frequent renter points");
    }
}


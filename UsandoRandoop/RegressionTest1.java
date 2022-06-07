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
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator41 = serializableList38.spliterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator42 = serializableList38.spliterator();
        serializableList38.ensureCapacity((int) (short) 0);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(serializableSpliterator41);
        org.junit.Assert.assertNotNull(serializableSpliterator42);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration6 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.NavigableSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L, true);
        java.util.NavigableSet<java.io.Serializable> serializableSet10 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.lang.Class<java.io.Serializable> serializableClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet10, serializableClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableEnumeration6);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableSet10);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.ListIterator<java.io.Serializable> serializableItor85 = serializableList80.listIterator(0);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator86 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator87 = java.util.Collections.reverseOrder(charSequenceComparator86);
        int int88 = serializableList80.indexOf((java.lang.Object) charSequenceComparator87);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator89 = java.util.Collections.reverseOrder(charSequenceComparator87);
        java.util.TreeSet<java.lang.CharSequence> charSequenceSet90 = new java.util.TreeSet<java.lang.CharSequence>(charSequenceComparator87);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor85);
        org.junit.Assert.assertNotNull(charSequenceComparator86);
        org.junit.Assert.assertNotNull(charSequenceComparator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(charSequenceComparator89);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.util.Map<java.util.List<java.io.Serializable>, java.lang.Object[]> serializableListMap0 = java.util.Collections.emptyMap();
        org.junit.Assert.assertNotNull(serializableListMap0);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Iterator<java.io.Serializable> serializableItor6 = serializableSet3.descendingIterator();
        java.io.Serializable serializable7 = serializableSet3.pollLast();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNull(serializable7);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.lang.Object[] objArray17 = serializableSet12.toArray();
        int int18 = serializableSet12.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        boolean boolean14 = strSet11.equals((java.lang.Object) false);
        boolean boolean15 = strSet11.isEmpty();
        boolean boolean17 = strSet11.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList19 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet18);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet(serializableSet18);
        java.util.TreeSet<java.io.Serializable> serializableSet21 = new java.util.TreeSet<java.io.Serializable>(serializableSet20);
        boolean boolean23 = serializableSet21.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator24 = serializableSet21.comparator();
        boolean boolean25 = strSet11.remove((java.lang.Object) serializableSet21);
        boolean boolean26 = strSet5.remove((java.lang.Object) serializableSet21);
        java.util.NavigableSet<java.io.Serializable> serializableSet27 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet21);
        java.lang.Object obj28 = serializableSet21.clone();
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        java.util.Collection<java.io.Serializable> serializableCollection69 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList67);
        java.lang.Object[] objArray70 = serializableList67.toArray();
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        boolean boolean78 = strSet75.equals((java.lang.Object) false);
        int int79 = strSet75.size();
        java.io.Serializable serializable80 = serializableList67.set((int) '#', (java.io.Serializable) strSet75);
        java.util.SortedSet<java.io.Serializable> serializableSet81 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList82 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet81);
        java.util.SortedSet<java.io.Serializable> serializableSet83 = java.util.Collections.unmodifiableSortedSet(serializableSet81);
        java.util.TreeSet<java.io.Serializable> serializableSet84 = new java.util.TreeSet<java.io.Serializable>(serializableSet83);
        boolean boolean86 = serializableSet84.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable87 = serializableSet84.pollLast();
        java.util.SortedSet<java.io.Serializable> serializableSet88 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet84);
        boolean boolean89 = serializableList67.addAll((java.util.Collection<java.io.Serializable>) serializableSet84);
        java.io.Serializable serializable90 = serializableSet21.ceiling((java.io.Serializable) serializableSet84);
        int int91 = serializableSet21.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNotNull(serializableIterableList19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardComparator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertEquals(obj28.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj28), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj28), "[]");
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(serializableCollection69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertEquals("'" + serializable80 + "' != '" + (byte) -1 + "'", serializable80, (byte) -1);
        org.junit.Assert.assertNotNull(serializableSet81);
        org.junit.Assert.assertNotNull(serializableIterableList82);
        org.junit.Assert.assertNotNull(serializableSet83);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(serializable87);
        org.junit.Assert.assertNotNull(serializableSet88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNull(serializable90);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.stream.Stream<java.io.Serializable> serializableStream84 = serializableList80.stream();
        boolean boolean85 = serializableList80.isEmpty();
        java.util.Random random86 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList80, random86);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableStream84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.util.TreeSet<java.io.Serializable> serializableSet8 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.io.Serializable[] serializableArray46 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList47 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList47, serializableArray46);
        java.util.Collection<java.io.Serializable> serializableCollection49 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList47);
        java.lang.Object obj50 = serializableList47.clone();
        java.util.Iterator<java.io.Serializable> serializableItor51 = serializableList47.iterator();
        serializableList47.clear();
        java.util.HashSet<java.lang.String> strSet54 = new java.util.HashSet<java.lang.String>(10);
        boolean boolean55 = serializableList47.remove((java.lang.Object) 10);
        boolean boolean56 = serializableSet3.addAll((java.util.Collection<java.io.Serializable>) serializableList47);
        java.util.SortedSet<java.io.Serializable> serializableSet57 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList58 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet57);
        java.util.SortedSet<java.io.Serializable> serializableSet59 = java.util.Collections.unmodifiableSortedSet(serializableSet57);
        java.util.TreeSet<java.io.Serializable> serializableSet60 = new java.util.TreeSet<java.io.Serializable>(serializableSet59);
        java.io.Serializable serializable61 = serializableSet60.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator62 = serializableSet60.comparator();
        boolean boolean63 = serializableSet60.isEmpty();
        serializableSet60.clear();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator65 = serializableSet60.spliterator();
        java.io.Serializable serializable66 = serializableSet60.pollLast();
        java.util.NavigableSet<java.io.Serializable> serializableSet67 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet60);
        java.util.NavigableSet<java.io.Serializable> serializableSet68 = java.util.Collections.unmodifiableNavigableSet(serializableSet67);
        java.util.Set<java.io.Serializable> serializableSet69 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet68);
        boolean boolean70 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableSet3, (java.util.Collection<java.io.Serializable>) serializableSet69);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableCollection49);
        org.junit.Assert.assertNotNull(obj50);
        org.junit.Assert.assertEquals(obj50.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj50), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj50), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor51);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(serializableSet57);
        org.junit.Assert.assertNotNull(serializableIterableList58);
        org.junit.Assert.assertNotNull(serializableSet59);
        org.junit.Assert.assertNull(serializable61);
        org.junit.Assert.assertNull(wildcardComparator62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator65);
        org.junit.Assert.assertNull(serializable66);
        org.junit.Assert.assertNotNull(serializableSet67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertNotNull(serializableSet69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.util.ListIterator<java.io.Serializable> serializableItor42 = serializableList38.listIterator();
        java.util.SortedSet<java.io.Serializable> serializableSet44 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList45 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet44);
        java.util.SortedSet<java.io.Serializable> serializableSet46 = java.util.Collections.unmodifiableSortedSet(serializableSet44);
        java.util.TreeSet<java.io.Serializable> serializableSet47 = new java.util.TreeSet<java.io.Serializable>(serializableSet46);
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet46);
        serializableList38.add((int) (byte) 1, (java.io.Serializable) serializableList48);
        java.util.Random random50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList38, random50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertNotNull(serializableSet44);
        org.junit.Assert.assertNotNull(serializableIterableList45);
        org.junit.Assert.assertNotNull(serializableSet46);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object obj41 = serializableList38.clone();
        java.util.Iterator<java.io.Serializable> serializableItor42 = serializableList38.iterator();
        java.util.ArrayList<java.util.Enumeration<java.util.HashSet<java.lang.String>>> strSetEnumerationList44 = new java.util.ArrayList<java.util.Enumeration<java.util.HashSet<java.lang.String>>>((int) (short) 100);
        boolean boolean45 = serializableList38.equals((java.lang.Object) strSetEnumerationList44);
        java.util.SortedSet<java.io.Serializable> serializableSet46 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList47 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet46);
        java.util.SortedSet<java.io.Serializable> serializableSet48 = java.util.Collections.unmodifiableSortedSet(serializableSet46);
        java.util.TreeSet<java.io.Serializable> serializableSet49 = new java.util.TreeSet<java.io.Serializable>(serializableSet48);
        java.io.Serializable serializable50 = serializableSet49.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator51 = serializableSet49.comparator();
        boolean boolean52 = serializableList38.retainAll((java.util.Collection<java.io.Serializable>) serializableSet49);
        java.lang.Object obj53 = serializableSet49.clone();
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(serializableSet46);
        org.junit.Assert.assertNotNull(serializableIterableList47);
        org.junit.Assert.assertNotNull(serializableSet48);
        org.junit.Assert.assertNull(serializable50);
        org.junit.Assert.assertNull(wildcardComparator51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(obj53);
        org.junit.Assert.assertEquals(obj53.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj53), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj53), "[]");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.util.TreeSet<java.io.Serializable> serializableSet8 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableSet3.parallelStream();
        java.util.Iterator<java.io.Serializable> serializableItor10 = serializableSet3.iterator();
        boolean boolean11 = serializableSet3.isEmpty();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(serializableItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.lang.Class<java.io.Serializable> serializableClass17 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet12, serializableClass17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator56 = serializableList51.spliterator();
        serializableList51.clear();
        java.lang.Object obj58 = serializableList51.clone();
        serializableList51.ensureCapacity(10);
        serializableList51.ensureCapacity((int) (short) 0);
        boolean boolean63 = serializableList51.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator56);
        org.junit.Assert.assertNotNull(obj58);
        org.junit.Assert.assertEquals(obj58.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj58), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj58), "[]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator10 = serializableSet3.spliterator();
        java.util.TreeSet<java.io.Serializable> serializableSet11 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable12 = serializableSet3.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNotNull(serializableSpliterator10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList39 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList39, serializableArray38);
        java.util.Collection<java.io.Serializable> serializableCollection41 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList39);
        java.lang.Object[] objArray42 = serializableList39.toArray();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList43 = java.util.Collections.nCopies(0, (java.util.List<java.io.Serializable>) serializableList39);
        java.util.Iterator<java.io.Serializable> serializableItor44 = serializableList39.iterator();
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(serializableCollection41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableListList43);
        org.junit.Assert.assertNotNull(serializableItor44);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        java.util.List<java.io.Serializable> serializableList0 = null;
        java.util.HashSet<java.util.stream.Stream<java.io.Serializable>> serializableStreamSet3 = new java.util.HashSet<java.util.stream.Stream<java.io.Serializable>>(0, (float) (short) 100);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        boolean boolean10 = strSet7.equals((java.lang.Object) false);
        boolean boolean11 = strSet7.isEmpty();
        boolean boolean13 = strSet7.equals((java.lang.Object) 10L);
        java.util.Iterator<java.lang.String> strItor14 = strSet7.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList16 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet15);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableSortedSet(serializableSet15);
        java.util.TreeSet<java.io.Serializable> serializableSet18 = new java.util.TreeSet<java.io.Serializable>(serializableSet17);
        java.io.Serializable serializable19 = serializableSet18.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator20 = serializableSet18.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet21 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet18);
        java.util.stream.Stream[][] streamArray22 = new java.util.stream.Stream[][] {};
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet18, streamArray22);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator24 = serializableSet18.comparator();
        boolean boolean25 = strSet7.equals((java.lang.Object) serializableSet18);
        java.util.Map<java.lang.Cloneable, java.util.NavigableSet<java.io.Serializable>> cloneableMap26 = java.util.Collections.singletonMap((java.lang.Cloneable) serializableStreamSet3, (java.util.NavigableSet<java.io.Serializable>) serializableSet18);
        java.util.HashSet<java.lang.String> strSet29 = new java.util.HashSet<java.lang.String>(10, (float) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean30 = java.util.Collections.replaceAll(serializableList0, (java.io.Serializable) serializableSet18, (java.io.Serializable) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableIterableList16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNull(wildcardComparator20);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNotNull(streamArray22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardComparator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(cloneableMap26);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList48, serializableArray47);
        java.util.Collection<java.io.Serializable> serializableCollection50 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList48);
        java.io.Serializable[] serializableArray57 = new java.io.Serializable[] { 'a', 10, 100, serializableList48, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList58 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList58, serializableArray57);
        boolean boolean62 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList58, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap65 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int66 = serializableList58.lastIndexOf((java.lang.Object) (short) 1);
        serializableList58.clear();
        java.util.Random random68 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList58, random68);
        java.io.Serializable serializable70 = serializableSet3.lower((java.io.Serializable) random68);
        java.util.Set<java.io.Serializable> serializableSet71 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet3);
        java.lang.Class<java.io.Serializable> serializableClass72 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.io.Serializable> serializableSet73 = java.util.Collections.checkedSet(serializableSet71, serializableClass72);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(serializableArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(serializableMap65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(serializable70);
        org.junit.Assert.assertNotNull(serializableSet71);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj2 = null;
        boolean boolean3 = strSet1.contains(obj2);
        java.lang.Object obj4 = strSet1.clone();
        java.util.Collection<java.io.Serializable> serializableCollection5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strSet1.removeAll(serializableCollection5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.stream.Stream<java.io.Serializable> serializableStream84 = serializableList80.stream();
        boolean boolean85 = serializableList80.isEmpty();
        java.util.Collection<java.io.Serializable> serializableCollection86 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList80);
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList80);
        java.lang.Object obj88 = serializableList80.clone();
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableStream84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(serializableCollection86);
        org.junit.Assert.assertNotNull(obj88);
        org.junit.Assert.assertEquals(obj88.toString(), "[10.0, 0.0, -1, 100, 0, 10, 0.0, 4, 0.0, 100, 100, 1, 1, 1, 10, 100, hi!, 100, 10.0, -1, hi!, #, -1.0, false, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], 10.0, 0, 1, #, 1, -1, , 0, 100.0, hi!, -1, 0, 0, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj88), "[10.0, 0.0, -1, 100, 0, 10, 0.0, 4, 0.0, 100, 100, 1, 1, 1, 10, 100, hi!, 100, 10.0, -1, hi!, #, -1.0, false, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], 10.0, 0, 1, #, 1, -1, , 0, 100.0, hi!, -1, 0, 0, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj88), "[10.0, 0.0, -1, 100, 0, 10, 0.0, 4, 0.0, 100, 100, 1, 1, 1, 10, 100, hi!, 100, 10.0, -1, hi!, #, -1.0, false, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], 10.0, 0, 1, #, 1, -1, , 0, 100.0, hi!, -1, 0, 0, 1]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        java.lang.Object obj38 = null;
        boolean boolean39 = serializableList36.equals(obj38);
        java.util.stream.Stream<java.io.Serializable> serializableStream40 = serializableList36.stream();
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList36);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableStream40);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        java.lang.CharSequence charSequence1 = null;
        java.util.List<java.lang.CharSequence> charSequenceList2 = java.util.Collections.nCopies(1, charSequence1);
        org.junit.Assert.assertNotNull(charSequenceList2);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.util.List<java.lang.CharSequence> charSequenceList1 = java.util.Collections.singletonList((java.lang.CharSequence) "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(charSequenceList1);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(serializableSet17);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator56 = serializableList51.spliterator();
        serializableList51.clear();
        boolean boolean58 = serializableList51.isEmpty();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator59 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList51.replaceAll(serializableUnaryOperator59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.util.ListIterator<java.io.Serializable> serializableItor42 = serializableList38.listIterator();
        java.io.Serializable serializable44 = serializableList38.get((int) ' ');
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap47 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        boolean boolean48 = serializableList38.contains((java.lang.Object) serializableMap47);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor50 = serializableList38.listIterator((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 37");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + 1.0d + "'", serializable44, 1.0d);
        org.junit.Assert.assertNotNull(serializableMap47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.ListIterator<java.io.Serializable> serializableItor85 = serializableList80.listIterator(0);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator86 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator87 = java.util.Collections.reverseOrder(charSequenceComparator86);
        int int88 = serializableList80.indexOf((java.lang.Object) charSequenceComparator87);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator89 = serializableList80.spliterator();
        java.lang.Object obj90 = serializableList80.clone();
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor85);
        org.junit.Assert.assertNotNull(charSequenceComparator86);
        org.junit.Assert.assertNotNull(charSequenceComparator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(serializableSpliterator89);
        org.junit.Assert.assertNotNull(obj90);
        org.junit.Assert.assertEquals(obj90.toString(), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj90), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj90), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        serializableList80.trimToSize();
        int int85 = serializableList80.size();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList88 = serializableList80.subList((int) (short) -1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: fromIndex = -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 39 + "'", int85 == 39);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.lang.Comparable<java.lang.String>[]> strSetMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.ListIterator<java.io.Serializable> serializableItor85 = serializableList80.listIterator(0);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator86 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator87 = java.util.Collections.reverseOrder(charSequenceComparator86);
        int int88 = serializableList80.indexOf((java.lang.Object) charSequenceComparator87);
        java.util.TreeSet<java.lang.CharSequence> charSequenceSet89 = new java.util.TreeSet<java.lang.CharSequence>(charSequenceComparator87);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator90 = java.util.Collections.reverseOrder(charSequenceComparator87);
        java.util.TreeSet<java.lang.CharSequence> charSequenceSet91 = new java.util.TreeSet<java.lang.CharSequence>(charSequenceComparator87);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor85);
        org.junit.Assert.assertNotNull(charSequenceComparator86);
        org.junit.Assert.assertNotNull(charSequenceComparator87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertNotNull(charSequenceComparator90);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.lang.Class<java.io.Serializable> serializableClass5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.checkedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3, serializableClass5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        java.util.NavigableMap<java.util.Iterator<java.io.Serializable>, java.io.Serializable> serializableItorMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(serializableItorMap0);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Random random7 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList1, random7);
        java.util.ArrayList<java.io.Serializable> serializableList10 = new java.util.ArrayList<java.io.Serializable>(100);
        int int11 = java.util.Collections.indexOfSubList((java.util.List<java.io.Serializable>) serializableList1, (java.util.List<java.io.Serializable>) serializableList10);
        java.lang.Class<java.io.Serializable> serializableClass12 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList13 = java.util.Collections.checkedList((java.util.List<java.io.Serializable>) serializableList1, serializableClass12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap1 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap2 = java.util.Collections.synchronizedNavigableMap(strSetMap1);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap3 = java.util.Collections.synchronizedNavigableMap(strSetMap2);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap4 = java.util.Collections.synchronizedNavigableMap(strSetMap3);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap5 = java.util.Collections.synchronizedNavigableMap(strSetMap3);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap6 = java.util.Collections.synchronizedNavigableMap(strSetMap3);
        java.util.List<java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>>> strSetMapList7 = java.util.Collections.nCopies(0, strSetMap6);
        org.junit.Assert.assertNotNull(strSetMap1);
        org.junit.Assert.assertNotNull(strSetMap2);
        org.junit.Assert.assertNotNull(strSetMap3);
        org.junit.Assert.assertNotNull(strSetMap4);
        org.junit.Assert.assertNotNull(strSetMap5);
        org.junit.Assert.assertNotNull(strSetMap6);
        org.junit.Assert.assertNotNull(strSetMapList7);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration6 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.NavigableSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L, true);
        java.util.NavigableSet<java.io.Serializable> serializableSet10 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.Set<java.io.Serializable> serializableSet11 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet10);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableEnumeration6);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableSet11);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.equals((java.lang.Object) false);
        int int50 = strSet46.size();
        java.io.Serializable serializable51 = serializableList38.set((int) '#', (java.io.Serializable) strSet46);
        java.util.Collections.rotate((java.util.List<java.io.Serializable>) serializableList38, (int) (byte) 1);
        java.util.ListIterator<java.io.Serializable> serializableItor54 = serializableList38.listIterator();
        java.util.List<java.util.Collection<java.io.Serializable>> serializableCollectionList55 = java.util.Collections.singletonList((java.util.Collection<java.io.Serializable>) serializableList38);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) -1 + "'", serializable51, (byte) -1);
        org.junit.Assert.assertNotNull(serializableItor54);
        org.junit.Assert.assertNotNull(serializableCollectionList55);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet61 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList62 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet61);
        java.util.SortedSet<java.io.Serializable> serializableSet63 = java.util.Collections.unmodifiableSortedSet(serializableSet61);
        java.util.TreeSet<java.io.Serializable> serializableSet64 = new java.util.TreeSet<java.io.Serializable>(serializableSet63);
        java.io.Serializable serializable65 = serializableSet64.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator66 = serializableSet64.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration67 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList69 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet68);
        java.util.SortedSet<java.io.Serializable> serializableSet70 = java.util.Collections.unmodifiableSortedSet(serializableSet68);
        java.util.TreeSet<java.io.Serializable> serializableSet71 = new java.util.TreeSet<java.io.Serializable>(serializableSet70);
        java.io.Serializable serializable72 = serializableSet71.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet74 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet76 = serializableSet71.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator77 = serializableSet71.spliterator();
        boolean boolean78 = serializableSet64.addAll((java.util.Collection<java.io.Serializable>) serializableSet71);
        java.util.SortedSet<java.io.Serializable> serializableSet79 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet64);
        boolean boolean80 = serializableList51.retainAll((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet81 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList82 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet81);
        java.util.SortedSet<java.io.Serializable> serializableSet83 = java.util.Collections.unmodifiableSortedSet(serializableSet81);
        java.util.TreeSet<java.io.Serializable> serializableSet84 = new java.util.TreeSet<java.io.Serializable>(serializableSet83);
        java.io.Serializable serializable85 = serializableSet84.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator86 = serializableSet84.comparator();
        boolean boolean87 = serializableSet84.isEmpty();
        serializableSet84.clear();
        java.util.TreeSet<java.io.Serializable> serializableSet89 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet84);
        java.util.NavigableSet<java.io.Serializable> serializableSet90 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet84);
        boolean boolean91 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableSet64, (java.util.Collection<java.io.Serializable>) serializableSet84);
        java.util.Iterator<java.io.Serializable> serializableItor92 = serializableSet64.iterator();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableSet61);
        org.junit.Assert.assertNotNull(serializableIterableList62);
        org.junit.Assert.assertNotNull(serializableSet63);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertNull(wildcardComparator66);
        org.junit.Assert.assertNotNull(serializableEnumeration67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertNotNull(serializableIterableList69);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertNull(serializable72);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertNotNull(serializableSpliterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(serializableSet81);
        org.junit.Assert.assertNotNull(serializableIterableList82);
        org.junit.Assert.assertNotNull(serializableSet83);
        org.junit.Assert.assertNull(serializable85);
        org.junit.Assert.assertNull(wildcardComparator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(serializableSet90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(serializableItor92);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        boolean boolean5 = serializableSet3.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator6 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = serializableSet10.headSet((java.io.Serializable) (short) 0);
        int int18 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableSet3, (java.lang.Object) serializableSet17);
        java.util.Set<java.io.Serializable> serializableSet19 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableSet3.stream();
        java.util.TreeSet<java.io.Serializable> serializableSet21 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNotNull(serializableStream20);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        java.util.HashSet<java.lang.AutoCloseable> autoCloseableSet0 = new java.util.HashSet<java.lang.AutoCloseable>();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Random random7 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList1, random7);
        java.util.ArrayList<java.io.Serializable> serializableList10 = new java.util.ArrayList<java.io.Serializable>(100);
        int int11 = java.util.Collections.indexOfSubList((java.util.List<java.io.Serializable>) serializableList1, (java.util.List<java.io.Serializable>) serializableList10);
        boolean boolean12 = serializableList10.isEmpty();
        java.io.Serializable[] serializableArray64 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList65, serializableArray64);
        java.util.Collection<java.io.Serializable> serializableCollection67 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList65);
        java.io.Serializable[] serializableArray92 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList65, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList93 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean94 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList93, serializableArray92);
        serializableList93.ensureCapacity(100);
        serializableList93.trimToSize();
        int int98 = java.util.Collections.lastIndexOfSubList((java.util.List<java.io.Serializable>) serializableList10, (java.util.List<java.io.Serializable>) serializableList93);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(serializableArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(serializableCollection67);
        org.junit.Assert.assertNotNull(serializableArray92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + (-1) + "'", int98 == (-1));
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.SortedSet<java.io.Serializable> serializableSet57 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList58 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet57);
        java.util.SortedSet<java.io.Serializable> serializableSet59 = java.util.Collections.unmodifiableSortedSet(serializableSet57);
        java.util.TreeSet<java.io.Serializable> serializableSet60 = new java.util.TreeSet<java.io.Serializable>(serializableSet59);
        java.io.Serializable serializable61 = serializableSet60.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator62 = serializableSet60.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet63 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet60);
        java.util.SortedSet<java.io.Serializable> serializableSet64 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList65 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet66 = java.util.Collections.unmodifiableSortedSet(serializableSet64);
        java.util.TreeSet<java.io.Serializable> serializableSet67 = new java.util.TreeSet<java.io.Serializable>(serializableSet66);
        java.util.HashSet<java.lang.String> strSet69 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj70 = strSet69.clone();
        java.io.Serializable serializable71 = serializableSet67.lower((java.io.Serializable) strSet69);
        java.lang.String[] strArray74 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet75 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet75, strArray74);
        boolean boolean78 = strSet75.equals((java.lang.Object) false);
        boolean boolean79 = strSet75.isEmpty();
        boolean boolean81 = strSet75.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet82 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList83 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet82);
        java.util.SortedSet<java.io.Serializable> serializableSet84 = java.util.Collections.unmodifiableSortedSet(serializableSet82);
        java.util.TreeSet<java.io.Serializable> serializableSet85 = new java.util.TreeSet<java.io.Serializable>(serializableSet84);
        boolean boolean87 = serializableSet85.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator88 = serializableSet85.comparator();
        boolean boolean89 = strSet75.remove((java.lang.Object) serializableSet85);
        boolean boolean90 = strSet69.remove((java.lang.Object) serializableSet85);
        boolean boolean91 = serializableSet60.remove((java.lang.Object) boolean90);
        boolean boolean92 = serializableList51.addAll((int) (short) 0, (java.util.Collection<java.io.Serializable>) serializableSet60);
        java.util.ArrayList<java.io.Serializable> serializableList93 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet60);
        serializableSet60.clear();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSet57);
        org.junit.Assert.assertNotNull(serializableIterableList58);
        org.junit.Assert.assertNotNull(serializableSet59);
        org.junit.Assert.assertNull(serializable61);
        org.junit.Assert.assertNull(wildcardComparator62);
        org.junit.Assert.assertNotNull(serializableSet63);
        org.junit.Assert.assertNotNull(serializableSet64);
        org.junit.Assert.assertNotNull(serializableIterableList65);
        org.junit.Assert.assertNotNull(serializableSet66);
        org.junit.Assert.assertNotNull(obj70);
        org.junit.Assert.assertEquals(obj70.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj70), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj70), "[]");
        org.junit.Assert.assertNull(serializable71);
        org.junit.Assert.assertNotNull(strArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(serializableSet82);
        org.junit.Assert.assertNotNull(serializableIterableList83);
        org.junit.Assert.assertNotNull(serializableSet84);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNull(wildcardComparator88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        java.util.Enumeration<java.lang.reflect.Type> typeEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(typeEnumeration0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Random random7 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList1, random7);
        java.util.ArrayList<java.io.Serializable> serializableList10 = new java.util.ArrayList<java.io.Serializable>(100);
        int int11 = java.util.Collections.indexOfSubList((java.util.List<java.io.Serializable>) serializableList1, (java.util.List<java.io.Serializable>) serializableList10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList13 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet12);
        java.util.SortedSet<java.io.Serializable> serializableSet14 = java.util.Collections.unmodifiableSortedSet(serializableSet12);
        java.util.TreeSet<java.io.Serializable> serializableSet15 = new java.util.TreeSet<java.io.Serializable>(serializableSet14);
        java.io.Serializable serializable16 = serializableSet15.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator17 = serializableSet15.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration18 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet15);
        java.util.SortedSet<java.io.Serializable> serializableSet19 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList20 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet19);
        java.util.SortedSet<java.io.Serializable> serializableSet21 = java.util.Collections.unmodifiableSortedSet(serializableSet19);
        java.util.TreeSet<java.io.Serializable> serializableSet22 = new java.util.TreeSet<java.io.Serializable>(serializableSet21);
        java.io.Serializable serializable23 = serializableSet22.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet25 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet27 = serializableSet22.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator28 = serializableSet22.spliterator();
        boolean boolean29 = serializableSet15.addAll((java.util.Collection<java.io.Serializable>) serializableSet22);
        java.io.Serializable[] serializableArray70 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList71 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList71, serializableArray70);
        java.util.Collection<java.io.Serializable> serializableCollection73 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList71);
        java.io.Serializable[] serializableArray80 = new java.io.Serializable[] { 'a', 10, 100, serializableList71, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList81 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList81, serializableArray80);
        boolean boolean85 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList81, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap88 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int89 = serializableList81.lastIndexOf((java.lang.Object) (short) 1);
        serializableList81.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration91 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList81);
        boolean boolean92 = serializableSet15.retainAll((java.util.Collection<java.io.Serializable>) serializableList81);
        java.util.HashSet<java.lang.String> strSet93 = new java.util.HashSet<java.lang.String>();
        java.io.Serializable serializable94 = serializableSet15.floor((java.io.Serializable) strSet93);
        boolean boolean95 = serializableList1.add(serializable94);
        java.util.stream.Stream<java.io.Serializable> serializableStream96 = serializableList1.stream();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertNotNull(serializableIterableList13);
        org.junit.Assert.assertNotNull(serializableSet14);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNull(wildcardComparator17);
        org.junit.Assert.assertNotNull(serializableEnumeration18);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNotNull(serializableIterableList20);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNull(serializable23);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertNotNull(serializableSpliterator28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(serializableArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(serializableCollection73);
        org.junit.Assert.assertNotNull(serializableArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(serializableMap88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNull(serializable94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNotNull(serializableStream96);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet1 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) 'a');
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        int int8 = serializableSet3.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.io.Serializable serializable7 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet9 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        serializableSet3.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList12 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet(serializableSet11);
        java.util.TreeSet<java.io.Serializable> serializableSet14 = new java.util.TreeSet<java.io.Serializable>(serializableSet13);
        java.io.Serializable serializable15 = serializableSet14.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet14.comparator();
        serializableSet14.clear();
        java.util.Iterator<java.io.Serializable> serializableItor18 = serializableSet14.descendingIterator();
        java.io.Serializable serializable19 = serializableSet3.ceiling((java.io.Serializable) serializableSet14);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet14);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNotNull(serializableIterableList12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertNotNull(serializableItor18);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializableSet20);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        boolean boolean5 = serializableSet3.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable6 = serializableSet3.pollLast();
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream8 = serializableSet3.stream();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableStream8);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet61 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList62 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet61);
        java.util.SortedSet<java.io.Serializable> serializableSet63 = java.util.Collections.unmodifiableSortedSet(serializableSet61);
        java.util.TreeSet<java.io.Serializable> serializableSet64 = new java.util.TreeSet<java.io.Serializable>(serializableSet63);
        java.io.Serializable serializable65 = serializableSet64.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator66 = serializableSet64.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration67 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList69 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet68);
        java.util.SortedSet<java.io.Serializable> serializableSet70 = java.util.Collections.unmodifiableSortedSet(serializableSet68);
        java.util.TreeSet<java.io.Serializable> serializableSet71 = new java.util.TreeSet<java.io.Serializable>(serializableSet70);
        java.io.Serializable serializable72 = serializableSet71.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet74 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet76 = serializableSet71.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator77 = serializableSet71.spliterator();
        boolean boolean78 = serializableSet64.addAll((java.util.Collection<java.io.Serializable>) serializableSet71);
        java.util.SortedSet<java.io.Serializable> serializableSet79 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet64);
        boolean boolean80 = serializableList51.retainAll((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet81 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList82 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet81);
        java.util.SortedSet<java.io.Serializable> serializableSet83 = java.util.Collections.unmodifiableSortedSet(serializableSet81);
        java.util.TreeSet<java.io.Serializable> serializableSet84 = new java.util.TreeSet<java.io.Serializable>(serializableSet83);
        java.io.Serializable serializable85 = serializableSet84.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator86 = serializableSet84.comparator();
        boolean boolean87 = serializableSet84.isEmpty();
        serializableSet84.clear();
        java.util.TreeSet<java.io.Serializable> serializableSet89 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet84);
        java.util.NavigableSet<java.io.Serializable> serializableSet90 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet84);
        boolean boolean91 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableSet64, (java.util.Collection<java.io.Serializable>) serializableSet84);
        java.lang.Class<java.io.Serializable> serializableClass92 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.io.Serializable> serializableSet93 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet84, serializableClass92);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableSet61);
        org.junit.Assert.assertNotNull(serializableIterableList62);
        org.junit.Assert.assertNotNull(serializableSet63);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertNull(wildcardComparator66);
        org.junit.Assert.assertNotNull(serializableEnumeration67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertNotNull(serializableIterableList69);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertNull(serializable72);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertNotNull(serializableSpliterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(serializableSet81);
        org.junit.Assert.assertNotNull(serializableIterableList82);
        org.junit.Assert.assertNotNull(serializableSet83);
        org.junit.Assert.assertNull(serializable85);
        org.junit.Assert.assertNull(wildcardComparator86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(serializableSet90);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator8 = serializableSet3.spliterator();
        int int9 = serializableSet3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable10 = serializableSet3.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.Iterator<java.lang.String> strItor10 = strSet3.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList12 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet(serializableSet11);
        java.util.TreeSet<java.io.Serializable> serializableSet14 = new java.util.TreeSet<java.io.Serializable>(serializableSet13);
        java.io.Serializable serializable15 = serializableSet14.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet14.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet14);
        java.util.stream.Stream[][] streamArray18 = new java.util.stream.Stream[][] {};
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet14, streamArray18);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator20 = serializableSet14.comparator();
        boolean boolean21 = strSet3.equals((java.lang.Object) serializableSet14);
        java.util.NavigableSet<java.io.Serializable> serializableSet22 = serializableSet14.descendingSet();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNotNull(serializableIterableList12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNotNull(streamArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardComparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(serializableSet22);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (short) 1);
        java.lang.Object obj2 = strSet1.clone();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet1.spliterator();
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(strSpliterator3);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        strSet1.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet3 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList4 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet5 = java.util.Collections.unmodifiableSortedSet(serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet6 = new java.util.TreeSet<java.io.Serializable>(serializableSet5);
        java.io.Serializable serializable7 = serializableSet6.pollFirst();
        java.io.Serializable serializable9 = serializableSet6.ceiling((java.io.Serializable) 0.0d);
        java.io.Serializable serializable10 = serializableSet6.pollLast();
        boolean boolean11 = strSet1.remove((java.lang.Object) serializable10);
        strSet1.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList14 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet13);
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.unmodifiableSortedSet(serializableSet13);
        java.util.TreeSet<java.io.Serializable> serializableSet16 = new java.util.TreeSet<java.io.Serializable>(serializableSet15);
        java.io.Serializable serializable17 = serializableSet16.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator18 = serializableSet16.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet19 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet16);
        java.util.stream.Stream[][] streamArray20 = new java.util.stream.Stream[][] {};
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, streamArray20);
        boolean boolean22 = strSet1.contains((java.lang.Object) boolean21);
        strSet1.clear();
        java.util.Iterator<java.lang.String> strItor24 = strSet1.iterator();
        org.junit.Assert.assertNotNull(serializableSet3);
        org.junit.Assert.assertNotNull(serializableIterableList4);
        org.junit.Assert.assertNotNull(serializableSet5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(serializableIterableList14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNull(wildcardComparator18);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNotNull(streamArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strItor24);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.Collection<java.io.Serializable> serializableCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.ArrayList<java.io.Serializable> serializableList11 = new java.util.ArrayList<java.io.Serializable>(100);
        boolean boolean12 = serializableSet3.retainAll((java.util.Collection<java.io.Serializable>) serializableList11);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator13 = serializableSet3.spliterator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator13);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.Iterator<java.lang.String> strItor10 = strSet3.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList12 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet(serializableSet11);
        java.util.TreeSet<java.io.Serializable> serializableSet14 = new java.util.TreeSet<java.io.Serializable>(serializableSet13);
        java.io.Serializable serializable15 = serializableSet14.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet14.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet14);
        java.util.stream.Stream[][] streamArray18 = new java.util.stream.Stream[][] {};
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet14, streamArray18);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator20 = serializableSet14.comparator();
        boolean boolean21 = strSet3.equals((java.lang.Object) serializableSet14);
        java.util.SortedMap<java.util.Enumeration<java.util.HashSet<java.lang.String>>, java.util.Iterator<java.io.Serializable>> strSetEnumerationMap22 = java.util.Collections.emptySortedMap();
        java.util.SortedMap<java.util.Enumeration<java.util.HashSet<java.lang.String>>, java.util.Iterator<java.io.Serializable>> strSetEnumerationMap23 = java.util.Collections.synchronizedSortedMap(strSetEnumerationMap22);
        boolean boolean24 = strSet3.remove((java.lang.Object) strSetEnumerationMap23);
        boolean boolean26 = strSet3.add("[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNotNull(serializableIterableList12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNotNull(streamArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardComparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strSetEnumerationMap22);
        org.junit.Assert.assertNotNull(strSetEnumerationMap23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator1 = java.util.Collections.reverseOrder(charSequenceComparator0);
        java.util.TreeSet<java.lang.CharSequence> charSequenceSet2 = new java.util.TreeSet<java.lang.CharSequence>(charSequenceComparator0);
        java.util.TreeSet<java.lang.CharSequence> charSequenceSet3 = new java.util.TreeSet<java.lang.CharSequence>(charSequenceComparator0);
        org.junit.Assert.assertNotNull(charSequenceComparator0);
        org.junit.Assert.assertNotNull(charSequenceComparator1);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        // The following exception was thrown during execution in test generation
        try {
            java.util.HashSet<java.lang.String> strSet2 = new java.util.HashSet<java.lang.String>((int) (byte) 10, (float) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal load factor: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        java.util.NavigableSet<java.io.Serializable> serializableSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.io.Serializable> serializableSet1 = java.util.Collections.synchronizedNavigableSet(serializableSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator56 = serializableList51.spliterator();
        serializableList51.clear();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        boolean boolean64 = strSet61.equals((java.lang.Object) false);
        int int65 = strSet61.size();
        java.util.SortedSet<java.io.Serializable> serializableSet66 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList67 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet66);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.unmodifiableSortedSet(serializableSet66);
        boolean boolean69 = strSet61.removeAll((java.util.Collection<java.io.Serializable>) serializableSet66);
        int int70 = serializableList51.lastIndexOf((java.lang.Object) strSet61);
        boolean boolean72 = strSet61.equals((java.lang.Object) (byte) 1);
        boolean boolean74 = strSet61.add("[]");
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(serializableSet66);
        org.junit.Assert.assertNotNull(serializableIterableList67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        boolean boolean15 = serializableSet13.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet13.comparator();
        boolean boolean17 = strSet3.remove((java.lang.Object) serializableSet13);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.Random random62 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random62);
        serializableList51.trimToSize();
        java.util.Random random65 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random65);
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.List<java.io.Serializable> serializableList68 = java.util.Collections.synchronizedList((java.util.List<java.io.Serializable>) serializableList67);
        java.util.Collection<java.io.Serializable> serializableCollection69 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList67);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
        org.junit.Assert.assertNotNull(serializableList68);
        org.junit.Assert.assertNotNull(serializableCollection69);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        java.util.Collection<java.io.Serializable> serializableCollection0 = null;
        java.lang.Class<java.io.Serializable> serializableClass1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.Serializable> serializableCollection2 = java.util.Collections.checkedCollection(serializableCollection0, serializableClass1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: c");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (short) 1);
        java.util.Map<java.util.SortedMap<java.util.Enumeration<java.util.HashSet<java.lang.String>>, java.util.Iterator<java.io.Serializable>>, java.lang.Comparable<java.lang.String>> setEnumerationMapMap2 = java.util.Collections.emptyMap();
        boolean boolean3 = strSet1.remove((java.lang.Object) setEnumerationMapMap2);
        org.junit.Assert.assertNotNull(setEnumerationMapMap2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.io.Serializable serializable7 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet9 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        serializableSet3.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList12 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet(serializableSet11);
        java.util.TreeSet<java.io.Serializable> serializableSet14 = new java.util.TreeSet<java.io.Serializable>(serializableSet13);
        java.io.Serializable serializable15 = serializableSet14.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet14.comparator();
        serializableSet14.clear();
        java.util.Iterator<java.io.Serializable> serializableItor18 = serializableSet14.descendingIterator();
        java.io.Serializable serializable19 = serializableSet3.ceiling((java.io.Serializable) serializableSet14);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.Enumeration<java.io.Serializable> serializableEnumeration21 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet20);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNotNull(serializableIterableList12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertNotNull(serializableItor18);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertNotNull(serializableEnumeration21);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        java.util.Enumeration<java.lang.Object[]> objArrayEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(objArrayEnumeration0);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.util.HashSet<java.lang.String> strSet12 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj13 = strSet12.clone();
        java.io.Serializable serializable14 = serializableSet10.lower((java.io.Serializable) strSet12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean21 = strSet18.equals((java.lang.Object) false);
        boolean boolean22 = strSet18.isEmpty();
        boolean boolean24 = strSet18.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet25 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList26 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet25);
        java.util.SortedSet<java.io.Serializable> serializableSet27 = java.util.Collections.unmodifiableSortedSet(serializableSet25);
        java.util.TreeSet<java.io.Serializable> serializableSet28 = new java.util.TreeSet<java.io.Serializable>(serializableSet27);
        boolean boolean30 = serializableSet28.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator31 = serializableSet28.comparator();
        boolean boolean32 = strSet18.remove((java.lang.Object) serializableSet28);
        boolean boolean33 = strSet12.remove((java.lang.Object) serializableSet28);
        java.util.NavigableSet<java.io.Serializable> serializableSet34 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet28);
        java.lang.Object obj35 = serializableSet28.clone();
        boolean boolean36 = serializableSet3.addAll((java.util.Collection<java.io.Serializable>) serializableSet28);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable37 = serializableSet28.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serializableSet25);
        org.junit.Assert.assertNotNull(serializableIterableList26);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardComparator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serializableSet34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        java.util.ArrayList<java.util.RandomAccess> randomAccessList0 = new java.util.ArrayList<java.util.RandomAccess>();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable serializable6 = serializableSet3.ceiling((java.io.Serializable) 0.0d);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration8 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        boolean boolean10 = serializableSet3.remove((java.lang.Object) (byte) 100);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList12 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet(serializableSet11);
        java.util.TreeSet<java.io.Serializable> serializableSet14 = new java.util.TreeSet<java.io.Serializable>(serializableSet13);
        java.util.HashSet<java.lang.String> strSet16 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj17 = strSet16.clone();
        java.io.Serializable serializable18 = serializableSet14.lower((java.io.Serializable) strSet16);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet22 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet22, strArray21);
        boolean boolean25 = strSet22.equals((java.lang.Object) false);
        boolean boolean26 = strSet22.isEmpty();
        boolean boolean28 = strSet22.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet29 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList30 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet29);
        java.util.SortedSet<java.io.Serializable> serializableSet31 = java.util.Collections.unmodifiableSortedSet(serializableSet29);
        java.util.TreeSet<java.io.Serializable> serializableSet32 = new java.util.TreeSet<java.io.Serializable>(serializableSet31);
        boolean boolean34 = serializableSet32.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator35 = serializableSet32.comparator();
        boolean boolean36 = strSet22.remove((java.lang.Object) serializableSet32);
        boolean boolean37 = strSet16.remove((java.lang.Object) serializableSet32);
        java.util.Iterator<java.io.Serializable> serializableItor38 = serializableSet32.iterator();
        java.io.Serializable serializable39 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.io.Serializable> serializableSet40 = serializableSet3.subSet((java.io.Serializable) serializableSet32, serializable39);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class java.util.TreeSet cannot be cast to class java.lang.Comparable (java.util.TreeSet and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(serializableEnumeration8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNotNull(serializableIterableList12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "[]");
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(serializableSet29);
        org.junit.Assert.assertNotNull(serializableIterableList30);
        org.junit.Assert.assertNotNull(serializableSet31);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(wildcardComparator35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(serializableItor38);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.util.NavigableSet<java.lang.Class<?>> wildcardClassSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(wildcardClassSet0);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet61 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList62 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet61);
        java.util.SortedSet<java.io.Serializable> serializableSet63 = java.util.Collections.unmodifiableSortedSet(serializableSet61);
        java.util.TreeSet<java.io.Serializable> serializableSet64 = new java.util.TreeSet<java.io.Serializable>(serializableSet63);
        java.io.Serializable serializable65 = serializableSet64.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator66 = serializableSet64.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration67 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList69 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet68);
        java.util.SortedSet<java.io.Serializable> serializableSet70 = java.util.Collections.unmodifiableSortedSet(serializableSet68);
        java.util.TreeSet<java.io.Serializable> serializableSet71 = new java.util.TreeSet<java.io.Serializable>(serializableSet70);
        java.io.Serializable serializable72 = serializableSet71.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet74 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet76 = serializableSet71.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator77 = serializableSet71.spliterator();
        boolean boolean78 = serializableSet64.addAll((java.util.Collection<java.io.Serializable>) serializableSet71);
        java.util.SortedSet<java.io.Serializable> serializableSet79 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet64);
        boolean boolean80 = serializableList51.retainAll((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.Collection<java.io.Serializable> serializableCollection81 = java.util.Collections.unmodifiableCollection((java.util.Collection<java.io.Serializable>) serializableSet64);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableSet61);
        org.junit.Assert.assertNotNull(serializableIterableList62);
        org.junit.Assert.assertNotNull(serializableSet63);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertNull(wildcardComparator66);
        org.junit.Assert.assertNotNull(serializableEnumeration67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertNotNull(serializableIterableList69);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertNull(serializable72);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertNotNull(serializableSpliterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(serializableCollection81);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.Iterator<java.lang.String> strItor10 = strSet3.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList12 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet(serializableSet11);
        java.util.TreeSet<java.io.Serializable> serializableSet14 = new java.util.TreeSet<java.io.Serializable>(serializableSet13);
        java.io.Serializable serializable15 = serializableSet14.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet14.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet14);
        java.util.stream.Stream[][] streamArray18 = new java.util.stream.Stream[][] {};
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet14, streamArray18);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator20 = serializableSet14.comparator();
        boolean boolean21 = strSet3.equals((java.lang.Object) serializableSet14);
        java.lang.Object obj22 = strSet3.clone();
        boolean boolean23 = strSet3.isEmpty();
        boolean boolean24 = strSet3.isEmpty();
        java.util.ArrayList<java.io.Serializable> serializableList26 = new java.util.ArrayList<java.io.Serializable>((int) (byte) 0);
        boolean boolean27 = strSet3.equals((java.lang.Object) serializableList26);
        int int28 = strSet3.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strItor10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNotNull(serializableIterableList12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNotNull(streamArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(wildcardComparator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((int) (short) 100);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList55 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList55, serializableArray54);
        java.util.Collection<java.io.Serializable> serializableCollection57 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList55);
        java.lang.Object[] objArray58 = serializableList55.toArray();
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet63 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        boolean boolean66 = strSet63.equals((java.lang.Object) false);
        int int67 = strSet63.size();
        java.io.Serializable serializable68 = serializableList55.set((int) '#', (java.io.Serializable) strSet63);
        java.util.SortedSet<java.io.Serializable> serializableSet69 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList70 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet69);
        java.util.SortedSet<java.io.Serializable> serializableSet71 = java.util.Collections.unmodifiableSortedSet(serializableSet69);
        java.util.TreeSet<java.io.Serializable> serializableSet72 = new java.util.TreeSet<java.io.Serializable>(serializableSet71);
        boolean boolean74 = serializableSet72.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable75 = serializableSet72.pollLast();
        java.util.SortedSet<java.io.Serializable> serializableSet76 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet72);
        boolean boolean77 = serializableList55.addAll((java.util.Collection<java.io.Serializable>) serializableSet72);
        java.io.Serializable serializable78 = serializableSet12.higher((java.io.Serializable) serializableList55);
        java.util.NavigableSet<java.io.Serializable> serializableSet79 = serializableSet12.descendingSet();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(serializableArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(serializableCollection57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray58), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertEquals("'" + serializable68 + "' != '" + (byte) -1 + "'", serializable68, (byte) -1);
        org.junit.Assert.assertNotNull(serializableSet69);
        org.junit.Assert.assertNotNull(serializableIterableList70);
        org.junit.Assert.assertNotNull(serializableSet71);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(serializable75);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNull(serializable78);
        org.junit.Assert.assertNotNull(serializableSet79);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = serializableList8.toArray((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.util.Random random14 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList8, random14);
        java.io.Serializable serializable16 = serializableSet3.ceiling((java.io.Serializable) random14);
        java.util.Collection<java.io.Serializable> serializableCollection17 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet19 = serializableSet3.tailSet((java.io.Serializable) 0.0f);
        java.lang.Class<java.io.Serializable> serializableClass20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.io.Serializable> serializableSet21 = java.util.Collections.checkedSet((java.util.Set<java.io.Serializable>) serializableSet19, serializableClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertNotNull(serializableSet19);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.Random random62 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random62);
        serializableList51.ensureCapacity((int) '4');
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = serializableList8.toArray((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.util.Random random14 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList8, random14);
        java.io.Serializable serializable16 = serializableSet3.ceiling((java.io.Serializable) random14);
        java.util.Collection<java.io.Serializable> serializableCollection17 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        int int18 = serializableSet3.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNotNull(serializableCollection17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        serializableSet3.clear();
        java.lang.Object obj8 = serializableSet3.clone();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean16 = strSet13.equals((java.lang.Object) false);
        boolean boolean17 = strSet13.isEmpty();
        boolean boolean19 = strSet13.equals((java.lang.Object) 10L);
        java.util.Iterator<java.lang.String> strItor20 = strSet13.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet21 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList22 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet21);
        java.util.SortedSet<java.io.Serializable> serializableSet23 = java.util.Collections.unmodifiableSortedSet(serializableSet21);
        java.util.TreeSet<java.io.Serializable> serializableSet24 = new java.util.TreeSet<java.io.Serializable>(serializableSet23);
        java.io.Serializable serializable25 = serializableSet24.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator26 = serializableSet24.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet27 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet24);
        java.util.stream.Stream[][] streamArray28 = new java.util.stream.Stream[][] {};
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet24, streamArray28);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator30 = serializableSet24.comparator();
        boolean boolean31 = strSet13.equals((java.lang.Object) serializableSet24);
        java.lang.Object obj32 = strSet13.clone();
        java.util.List<java.util.LinkedHashSet<java.lang.String>> strSetList33 = java.util.Collections.nCopies(35, strSet13);
        java.io.Serializable serializable34 = serializableSet3.higher((java.io.Serializable) strSet13);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNotNull(serializableIterableList22);
        org.junit.Assert.assertNotNull(serializableSet23);
        org.junit.Assert.assertNull(serializable25);
        org.junit.Assert.assertNull(wildcardComparator26);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertNotNull(streamArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardComparator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertEquals(obj32.toString(), "[hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj32), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj32), "[hi!]");
        org.junit.Assert.assertNotNull(strSetList33);
        org.junit.Assert.assertNull(serializable34);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet61 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList62 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet61);
        java.util.SortedSet<java.io.Serializable> serializableSet63 = java.util.Collections.unmodifiableSortedSet(serializableSet61);
        java.util.TreeSet<java.io.Serializable> serializableSet64 = new java.util.TreeSet<java.io.Serializable>(serializableSet63);
        java.io.Serializable serializable65 = serializableSet64.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator66 = serializableSet64.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration67 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet64);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList69 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet68);
        java.util.SortedSet<java.io.Serializable> serializableSet70 = java.util.Collections.unmodifiableSortedSet(serializableSet68);
        java.util.TreeSet<java.io.Serializable> serializableSet71 = new java.util.TreeSet<java.io.Serializable>(serializableSet70);
        java.io.Serializable serializable72 = serializableSet71.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet74 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet76 = serializableSet71.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator77 = serializableSet71.spliterator();
        boolean boolean78 = serializableSet64.addAll((java.util.Collection<java.io.Serializable>) serializableSet71);
        java.util.SortedSet<java.io.Serializable> serializableSet79 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet64);
        boolean boolean80 = serializableList51.retainAll((java.util.Collection<java.io.Serializable>) serializableSet64);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.io.Serializable> serializableList83 = serializableList51.subList((int) (byte) 1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromIndex(1) > toIndex(0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableSet61);
        org.junit.Assert.assertNotNull(serializableIterableList62);
        org.junit.Assert.assertNotNull(serializableSet63);
        org.junit.Assert.assertNull(serializable65);
        org.junit.Assert.assertNull(wildcardComparator66);
        org.junit.Assert.assertNotNull(serializableEnumeration67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertNotNull(serializableIterableList69);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertNull(serializable72);
        org.junit.Assert.assertNotNull(serializableSet76);
        org.junit.Assert.assertNotNull(serializableSpliterator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(serializableSet79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        java.util.Set<java.lang.Iterable<java.io.Serializable>> serializableIterableSet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(serializableIterableSet0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.equals((java.lang.Object) false);
        int int50 = strSet46.size();
        java.io.Serializable serializable51 = serializableList38.set((int) '#', (java.io.Serializable) strSet46);
        java.util.Collections.rotate((java.util.List<java.io.Serializable>) serializableList38, (int) (byte) 1);
        java.util.ListIterator<java.io.Serializable> serializableItor54 = serializableList38.listIterator();
        serializableList38.trimToSize();
        java.util.ArrayList<java.io.Serializable> serializableList57 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray62 = serializableList57.toArray((java.lang.Comparable<java.lang.String>[]) strArray61);
        java.util.ListIterator<java.io.Serializable> serializableItor63 = serializableList57.listIterator();
        boolean boolean64 = serializableList38.add((java.io.Serializable) serializableList57);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) -1 + "'", serializable51, (byte) -1);
        org.junit.Assert.assertNotNull(serializableItor54);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(strComparableArray62);
        org.junit.Assert.assertNotNull(serializableItor63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        int int7 = strSet3.size();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList9 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet8);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.unmodifiableSortedSet(serializableSet8);
        boolean boolean11 = strSet3.removeAll((java.util.Collection<java.io.Serializable>) serializableSet8);
        java.util.Iterator<java.lang.String> strItor12 = strSet3.iterator();
        strSet3.clear();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableIterableList9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strItor12);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.Random random62 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random62);
        serializableList51.trimToSize();
        java.lang.Object[] objArray65 = serializableList51.toArray();
        java.util.List<java.lang.Cloneable> cloneableList66 = java.util.Collections.emptyList();
        int int67 = serializableList51.lastIndexOf((java.lang.Object) cloneableList66);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(cloneableList66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        java.util.HashSet<java.lang.reflect.AnnotatedElement> annotatedElementSet1 = new java.util.HashSet<java.lang.reflect.AnnotatedElement>((int) (byte) 100);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.equals((java.lang.Object) false);
        int int50 = strSet46.size();
        java.io.Serializable serializable51 = serializableList38.set((int) '#', (java.io.Serializable) strSet46);
        java.util.Collections.rotate((java.util.List<java.io.Serializable>) serializableList38, (int) (byte) 1);
        java.util.ListIterator<java.io.Serializable> serializableItor54 = serializableList38.listIterator();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator55 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator56 = java.util.Collections.reverseOrder(charSequenceComparator55);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator57 = java.util.Collections.reverseOrder(charSequenceComparator55);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator58 = java.util.Collections.reverseOrder(charSequenceComparator57);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator59 = java.util.Collections.reverseOrder(charSequenceComparator58);
        java.util.TreeSet<java.lang.CharSequence> charSequenceSet60 = new java.util.TreeSet<java.lang.CharSequence>(charSequenceComparator59);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator61 = java.util.Collections.reverseOrder(charSequenceComparator59);
        boolean boolean62 = serializableList38.contains((java.lang.Object) charSequenceComparator61);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) -1 + "'", serializable51, (byte) -1);
        org.junit.Assert.assertNotNull(serializableItor54);
        org.junit.Assert.assertNotNull(charSequenceComparator55);
        org.junit.Assert.assertNotNull(charSequenceComparator56);
        org.junit.Assert.assertNotNull(charSequenceComparator57);
        org.junit.Assert.assertNotNull(charSequenceComparator58);
        org.junit.Assert.assertNotNull(charSequenceComparator59);
        org.junit.Assert.assertNotNull(charSequenceComparator61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj2 = null;
        boolean boolean3 = strSet1.contains(obj2);
        int int4 = strSet1.size();
        boolean boolean5 = strSet1.isEmpty();
        strSet1.clear();
        boolean boolean8 = strSet1.add("");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator56 = serializableList51.spliterator();
        serializableList51.clear();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        boolean boolean64 = strSet61.equals((java.lang.Object) false);
        int int65 = strSet61.size();
        java.util.SortedSet<java.io.Serializable> serializableSet66 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList67 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet66);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.unmodifiableSortedSet(serializableSet66);
        boolean boolean69 = strSet61.removeAll((java.util.Collection<java.io.Serializable>) serializableSet66);
        int int70 = serializableList51.lastIndexOf((java.lang.Object) strSet61);
        boolean boolean72 = strSet61.add("[]");
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(serializableSet66);
        org.junit.Assert.assertNotNull(serializableIterableList67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable serializable6 = serializableSet3.ceiling((java.io.Serializable) 0.0d);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L);
        java.util.ArrayList<java.io.Serializable> serializableList10 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet9);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        boolean boolean17 = strSet14.equals((java.lang.Object) false);
        boolean boolean18 = strSet14.isEmpty();
        boolean boolean20 = strSet14.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet21 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList22 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet21);
        java.util.SortedSet<java.io.Serializable> serializableSet23 = java.util.Collections.unmodifiableSortedSet(serializableSet21);
        java.util.TreeSet<java.io.Serializable> serializableSet24 = new java.util.TreeSet<java.io.Serializable>(serializableSet23);
        boolean boolean26 = serializableSet24.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator27 = serializableSet24.comparator();
        boolean boolean28 = strSet14.remove((java.lang.Object) serializableSet24);
        java.util.NavigableSet<java.io.Serializable> serializableSet29 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet24);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator30 = serializableSet24.comparator();
        boolean boolean31 = serializableList10.removeAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNotNull(serializableIterableList22);
        org.junit.Assert.assertNotNull(serializableSet23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardComparator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(serializableSet29);
        org.junit.Assert.assertNull(wildcardComparator30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        java.util.HashSet<java.util.stream.Stream<java.io.Serializable>> serializableStreamSet1 = new java.util.HashSet<java.util.stream.Stream<java.io.Serializable>>(10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        java.util.NavigableSet<java.util.AbstractCollection<java.io.Serializable>> serializableCollectionSet0 = java.util.Collections.emptyNavigableSet();
        org.junit.Assert.assertNotNull(serializableCollectionSet0);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList57 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList57, serializableArray56);
        java.util.Collection<java.io.Serializable> serializableCollection59 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList57);
        java.io.Serializable[] serializableArray84 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList57, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList85 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList85, serializableArray84);
        serializableList85.ensureCapacity(100);
        java.lang.Object[] objArray89 = serializableList85.toArray();
        boolean boolean91 = serializableList85.remove((java.lang.Object) (byte) 0);
        java.util.NavigableSet<java.io.Serializable> serializableSet93 = serializableSet3.tailSet((java.io.Serializable) boolean91, true);
        java.util.Set<java.io.Serializable> serializableSet94 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream95 = serializableSet94.parallelStream();
        java.lang.Class<java.io.Serializable> serializableClass96 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.io.Serializable> serializableSet97 = java.util.Collections.checkedSet(serializableSet94, serializableClass96);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(serializableArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(serializableCollection59);
        org.junit.Assert.assertNotNull(serializableArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(serializableSet93);
        org.junit.Assert.assertNotNull(serializableSet94);
        org.junit.Assert.assertNotNull(serializableStream95);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList39 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList39, serializableArray38);
        java.util.Collection<java.io.Serializable> serializableCollection41 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList39);
        java.lang.Object[] objArray42 = serializableList39.toArray();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList43 = java.util.Collections.nCopies(0, (java.util.List<java.io.Serializable>) serializableList39);
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList39);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        boolean boolean51 = strSet48.equals((java.lang.Object) false);
        java.io.Serializable[] serializableArray87 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList88 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList88, serializableArray87);
        java.lang.Object obj90 = null;
        boolean boolean91 = serializableList88.equals(obj90);
        java.util.Collection<java.io.Serializable> serializableCollection92 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList88);
        boolean boolean93 = strSet48.contains((java.lang.Object) serializableList88);
        java.io.Serializable serializable95 = serializableList88.get((int) (byte) 10);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet96 = java.util.Collections.singleton((java.util.Collection<java.io.Serializable>) serializableList88);
        boolean boolean97 = serializableList39.removeAll((java.util.Collection<java.io.Serializable>) serializableList88);
        java.lang.Object obj98 = serializableList88.clone();
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(serializableCollection41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableListList43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(serializableArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(serializableCollection92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + serializable95 + "' != '" + 100 + "'", serializable95, 100);
        org.junit.Assert.assertNotNull(serializableCollectionSet96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertNotNull(obj98);
        org.junit.Assert.assertEquals(obj98.toString(), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj98), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj98), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.util.Collection<java.io.Serializable> serializableCollection62 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList60);
        java.io.Serializable[] serializableArray87 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList60, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList88 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList88, serializableArray87);
        serializableList88.ensureCapacity(100);
        java.lang.Object[] objArray92 = serializableList88.toArray();
        boolean boolean94 = serializableList88.remove((java.lang.Object) (byte) 0);
        java.io.Serializable serializable95 = serializableSet3.higher((java.io.Serializable) (byte) 0);
        java.util.Iterator<java.io.Serializable> serializableItor96 = serializableSet3.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet97 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator98 = serializableSet3.comparator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableCollection62);
        org.junit.Assert.assertNotNull(serializableArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(serializable95);
        org.junit.Assert.assertNotNull(serializableItor96);
        org.junit.Assert.assertNotNull(serializableSet97);
        org.junit.Assert.assertNull(wildcardComparator98);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (short) 1);
        java.lang.Object obj2 = strSet1.clone();
        boolean boolean4 = strSet1.add("[]");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.Random random62 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random62);
        java.util.ArrayList<java.io.Serializable> serializableList65 = new java.util.ArrayList<java.io.Serializable>((int) '4');
        java.util.Collections.copy((java.util.List<java.io.Serializable>) serializableList51, (java.util.List<java.io.Serializable>) serializableList65);
        java.lang.Class<java.io.Serializable> serializableClass67 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.Serializable> serializableCollection68 = java.util.Collections.checkedCollection((java.util.Collection<java.io.Serializable>) serializableList51, serializableClass67);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator41 = serializableList38.spliterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator42 = serializableList38.spliterator();
        java.util.List<java.io.Serializable> serializableList45 = serializableList38.subList(0, (int) ' ');
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(serializableSpliterator41);
        org.junit.Assert.assertNotNull(serializableSpliterator42);
        org.junit.Assert.assertNotNull(serializableList45);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        java.util.NavigableMap<java.util.AbstractList<java.io.Serializable>, java.lang.Comparable<java.lang.String>> serializableListMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(serializableListMap0);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator56 = serializableList51.spliterator();
        serializableList51.clear();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        boolean boolean64 = strSet61.equals((java.lang.Object) false);
        int int65 = strSet61.size();
        java.util.SortedSet<java.io.Serializable> serializableSet66 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList67 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet66);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.unmodifiableSortedSet(serializableSet66);
        boolean boolean69 = strSet61.removeAll((java.util.Collection<java.io.Serializable>) serializableSet66);
        int int70 = serializableList51.lastIndexOf((java.lang.Object) strSet61);
        boolean boolean72 = strSet61.equals((java.lang.Object) (byte) 1);
        java.util.Iterator<java.lang.String> strItor73 = strSet61.iterator();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(serializableSet66);
        org.junit.Assert.assertNotNull(serializableIterableList67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strItor73);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration6 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator16 = serializableSet10.spliterator();
        boolean boolean17 = serializableSet3.addAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.io.Serializable serializable19 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableEnumeration6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializableSet20);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap1 = java.util.Collections.synchronizedNavigableMap(strSetMap0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap0 = java.util.Collections.emptyNavigableMap();
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap1 = java.util.Collections.synchronizedNavigableMap(strSetMap0);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap2 = java.util.Collections.synchronizedNavigableMap(strSetMap1);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap3 = java.util.Collections.synchronizedNavigableMap(strSetMap2);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap4 = java.util.Collections.synchronizedNavigableMap(strSetMap2);
        java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap5 = java.util.Collections.synchronizedNavigableMap(strSetMap2);
        java.lang.Class<java.util.AbstractSet<java.lang.String>> strSetClass6 = null;
        java.lang.Class<java.util.AbstractList<java.io.Serializable>> serializableListClass7 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableMap<java.util.AbstractSet<java.lang.String>, java.util.AbstractList<java.io.Serializable>> strSetMap8 = java.util.Collections.checkedNavigableMap(strSetMap5, strSetClass6, serializableListClass7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSetMap0);
        org.junit.Assert.assertNotNull(strSetMap1);
        org.junit.Assert.assertNotNull(strSetMap2);
        org.junit.Assert.assertNotNull(strSetMap3);
        org.junit.Assert.assertNotNull(strSetMap4);
        org.junit.Assert.assertNotNull(strSetMap5);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.Random random62 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random62);
        serializableList51.trimToSize();
        java.lang.Object[] objArray65 = serializableList51.toArray();
        java.util.ArrayList<java.io.Serializable> serializableList68 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray72 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray73 = serializableList68.toArray((java.lang.Comparable<java.lang.String>[]) strArray72);
        java.util.Iterator<java.io.Serializable> serializableItor74 = serializableList68.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet75 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList76 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet75);
        java.util.SortedSet<java.io.Serializable> serializableSet77 = java.util.Collections.unmodifiableSortedSet(serializableSet75);
        java.util.TreeSet<java.io.Serializable> serializableSet78 = new java.util.TreeSet<java.io.Serializable>(serializableSet77);
        java.util.Iterator<java.io.Serializable> serializableItor79 = serializableSet78.iterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator80 = serializableSet78.spliterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet81 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet78);
        boolean boolean82 = serializableList68.addAll((java.util.Collection<java.io.Serializable>) serializableSet81);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean83 = serializableList51.addAll((int) (byte) -1, (java.util.Collection<java.io.Serializable>) serializableSet81);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: -1, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[]");
        org.junit.Assert.assertNotNull(strArray72);
        org.junit.Assert.assertNotNull(strComparableArray73);
        org.junit.Assert.assertNotNull(serializableItor74);
        org.junit.Assert.assertNotNull(serializableSet75);
        org.junit.Assert.assertNotNull(serializableIterableList76);
        org.junit.Assert.assertNotNull(serializableSet77);
        org.junit.Assert.assertNotNull(serializableItor79);
        org.junit.Assert.assertNotNull(serializableSpliterator80);
        org.junit.Assert.assertNotNull(serializableSet81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.NavigableSet<java.io.Serializable> serializableSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        serializableSet3.clear();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet7);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        java.util.Set<java.util.stream.Stream[][]> streamArraySet0 = java.util.Collections.emptySet();
        org.junit.Assert.assertNotNull(streamArraySet0);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet6 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.tailSet((java.io.Serializable) '4', true);
        java.util.ArrayList<java.io.Serializable> serializableList9 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet8);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList62 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList62, serializableArray61);
        java.util.Collection<java.io.Serializable> serializableCollection64 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList62);
        java.io.Serializable[] serializableArray89 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList62, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList90 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean91 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList90, serializableArray89);
        serializableList90.ensureCapacity(100);
        java.util.stream.Stream<java.io.Serializable> serializableStream94 = serializableList90.stream();
        boolean boolean95 = serializableList90.isEmpty();
        java.util.Collection<java.io.Serializable> serializableCollection96 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList90);
        boolean boolean97 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableList9, serializableCollection96);
        int int98 = serializableList9.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(serializableCollection64);
        org.junit.Assert.assertNotNull(serializableArray89);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(serializableStream94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(serializableCollection96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator56 = serializableList51.spliterator();
        serializableList51.clear();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet61 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet61, strArray60);
        boolean boolean64 = strSet61.equals((java.lang.Object) false);
        int int65 = strSet61.size();
        java.util.SortedSet<java.io.Serializable> serializableSet66 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList67 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet66);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.unmodifiableSortedSet(serializableSet66);
        boolean boolean69 = strSet61.removeAll((java.util.Collection<java.io.Serializable>) serializableSet66);
        int int70 = serializableList51.lastIndexOf((java.lang.Object) strSet61);
        java.lang.Object obj71 = strSet61.clone();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator56);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertNotNull(serializableSet66);
        org.junit.Assert.assertNotNull(serializableIterableList67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(obj71);
        org.junit.Assert.assertEquals(obj71.toString(), "[hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj71), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj71), "[hi!]");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration6 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.NavigableSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L, true);
        java.io.Serializable serializable10 = serializableSet3.pollFirst();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableEnumeration6);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable10);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        java.io.Serializable[] serializableArray38 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList39 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList39, serializableArray38);
        java.util.Collection<java.io.Serializable> serializableCollection41 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList39);
        java.lang.Object[] objArray42 = serializableList39.toArray();
        java.util.List<java.util.List<java.io.Serializable>> serializableListList43 = java.util.Collections.nCopies(0, (java.util.List<java.io.Serializable>) serializableList39);
        java.util.ArrayList<java.io.Serializable> serializableList44 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList39);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet48 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet48, strArray47);
        boolean boolean51 = strSet48.equals((java.lang.Object) false);
        java.io.Serializable[] serializableArray87 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList88 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList88, serializableArray87);
        java.lang.Object obj90 = null;
        boolean boolean91 = serializableList88.equals(obj90);
        java.util.Collection<java.io.Serializable> serializableCollection92 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList88);
        boolean boolean93 = strSet48.contains((java.lang.Object) serializableList88);
        java.io.Serializable serializable95 = serializableList88.get((int) (byte) 10);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet96 = java.util.Collections.singleton((java.util.Collection<java.io.Serializable>) serializableList88);
        boolean boolean97 = serializableList39.removeAll((java.util.Collection<java.io.Serializable>) serializableList88);
        boolean boolean98 = serializableList88.isEmpty();
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(serializableCollection41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableListList43);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(serializableArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(serializableCollection92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertEquals("'" + serializable95 + "' != '" + 100 + "'", serializable95, 100);
        org.junit.Assert.assertNotNull(serializableCollectionSet96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + true + "'", boolean97 == true);
        org.junit.Assert.assertTrue("'" + boolean98 + "' != '" + false + "'", boolean98 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        boolean boolean8 = strSet5.isEmpty();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        strSet1.clear();
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet1.spliterator();
        java.util.SortedSet<java.io.Serializable> serializableSet4 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList5 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet4);
        java.util.SortedSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableSortedSet(serializableSet4);
        java.util.TreeSet<java.io.Serializable> serializableSet7 = new java.util.TreeSet<java.io.Serializable>(serializableSet6);
        java.io.Serializable serializable8 = serializableSet7.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator9 = serializableSet7.comparator();
        boolean boolean10 = strSet1.equals((java.lang.Object) serializableSet7);
        java.lang.Class<java.io.Serializable> serializableClass11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.io.Serializable> serializableSet12 = java.util.Collections.checkedSet((java.util.Set<java.io.Serializable>) serializableSet7, serializableClass11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSpliterator3);
        org.junit.Assert.assertNotNull(serializableSet4);
        org.junit.Assert.assertNotNull(serializableIterableList5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNull(wildcardComparator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((int) (byte) 0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList3 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet2);
        java.util.SortedSet<java.io.Serializable> serializableSet4 = java.util.Collections.unmodifiableSortedSet(serializableSet2);
        java.util.TreeSet<java.io.Serializable> serializableSet5 = new java.util.TreeSet<java.io.Serializable>(serializableSet4);
        java.io.Serializable serializable6 = serializableSet5.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet8 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet10 = serializableSet5.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = serializableSet5.headSet((java.io.Serializable) (short) 0);
        boolean boolean13 = serializableList1.retainAll((java.util.Collection<java.io.Serializable>) serializableSet5);
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList16 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet15);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableSortedSet(serializableSet15);
        boolean boolean18 = strSet14.removeAll((java.util.Collection<java.io.Serializable>) serializableSet17);
        java.util.ArrayList<java.io.Serializable> serializableList19 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet17);
        java.lang.Object[] objArray20 = serializableList19.toArray();
        java.util.Set<java.lang.Object[]> objArraySet21 = java.util.Collections.singleton(objArray20);
        java.io.Serializable serializable22 = serializableSet5.higher((java.io.Serializable) objArray20);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableIterableList3);
        org.junit.Assert.assertNotNull(serializableSet4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableIterableList16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[]");
        org.junit.Assert.assertNotNull(objArraySet21);
        org.junit.Assert.assertNull(serializable22);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.lang.Object[] objArray17 = serializableSet12.toArray();
        java.util.Set<java.io.Serializable> serializableSet18 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet12);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
        org.junit.Assert.assertNotNull(serializableSet18);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        java.util.ArrayList<java.util.Iterator<java.io.Serializable>> serializableItorList0 = new java.util.ArrayList<java.util.Iterator<java.io.Serializable>>();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        boolean boolean16 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableSet3, (java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.Iterator<java.io.Serializable> serializableItor17 = serializableSet10.descendingIterator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(serializableItor17);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.ListIterator<java.io.Serializable> serializableItor85 = serializableList80.listIterator(0);
        serializableList80.clear();
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableItor85);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.lang.String[] strArray1 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet2 = new java.util.HashSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        java.lang.Object obj4 = null;
        boolean boolean5 = strSet2.remove(obj4);
        java.util.SortedSet<java.io.Serializable> serializableSet6 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList7 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet6);
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.unmodifiableSortedSet(serializableSet6);
        java.util.TreeSet<java.io.Serializable> serializableSet9 = new java.util.TreeSet<java.io.Serializable>(serializableSet8);
        boolean boolean11 = serializableSet9.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable12 = serializableSet9.pollLast();
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet9);
        boolean boolean14 = strSet2.remove((java.lang.Object) serializableSet9);
        int int15 = strSet2.size();
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList54 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList54, serializableArray53);
        java.util.Collection<java.io.Serializable> serializableCollection56 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList54);
        java.lang.Object obj57 = serializableList54.clone();
        java.util.Iterator<java.io.Serializable> serializableItor58 = serializableList54.iterator();
        java.util.ArrayList<java.util.Enumeration<java.util.HashSet<java.lang.String>>> strSetEnumerationList60 = new java.util.ArrayList<java.util.Enumeration<java.util.HashSet<java.lang.String>>>((int) (short) 100);
        boolean boolean61 = serializableList54.equals((java.lang.Object) strSetEnumerationList60);
        java.lang.Object[] objArray62 = serializableList54.toArray();
        boolean boolean63 = strSet2.removeAll((java.util.Collection<java.io.Serializable>) serializableList54);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(serializableIterableList7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(serializableArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(serializableCollection56);
        org.junit.Assert.assertNotNull(obj57);
        org.junit.Assert.assertEquals(obj57.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj57), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj57), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor58);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray62), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        java.util.ArrayList<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList0 = new java.util.ArrayList<java.lang.Iterable<java.io.Serializable>[]>();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        java.util.Iterator<java.util.TreeSet<java.io.Serializable>> serializableSetItor0 = java.util.Collections.emptyIterator();
        org.junit.Assert.assertNotNull(serializableSetItor0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.util.Enumeration<java.lang.reflect.AnnotatedElement> annotatedElementEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(annotatedElementEnumeration0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        java.lang.Object obj38 = null;
        boolean boolean39 = serializableList36.equals(obj38);
        java.lang.Object obj40 = serializableList36.clone();
        java.util.stream.Stream<java.io.Serializable> serializableStream41 = serializableList36.parallelStream();
        int int42 = serializableList36.size();
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList36);
        java.util.ArrayList<java.io.Serializable> serializableList45 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray49 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray50 = serializableList45.toArray((java.lang.Comparable<java.lang.String>[]) strArray49);
        java.util.Iterator<java.io.Serializable> serializableItor51 = serializableList45.iterator();
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList45);
        serializableList52.clear();
        int int54 = java.util.Collections.lastIndexOfSubList((java.util.List<java.io.Serializable>) serializableList36, (java.util.List<java.io.Serializable>) serializableList52);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertNotNull(serializableStream41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 35 + "'", int42 == 35);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(strComparableArray50);
        org.junit.Assert.assertNotNull(serializableItor51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 35 + "'", int54 == 35);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        boolean boolean5 = serializableSet3.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator6 = serializableSet3.comparator();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList9 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet8);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.unmodifiableSortedSet(serializableSet8);
        java.util.TreeSet<java.io.Serializable> serializableSet11 = new java.util.TreeSet<java.io.Serializable>(serializableSet10);
        java.io.Serializable serializable12 = serializableSet11.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator13 = serializableSet11.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration14 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet11);
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList16 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet15);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = java.util.Collections.unmodifiableSortedSet(serializableSet15);
        java.util.TreeSet<java.io.Serializable> serializableSet18 = new java.util.TreeSet<java.io.Serializable>(serializableSet17);
        java.io.Serializable serializable19 = serializableSet18.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet21 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet23 = serializableSet18.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator24 = serializableSet18.spliterator();
        boolean boolean25 = serializableSet11.addAll((java.util.Collection<java.io.Serializable>) serializableSet18);
        java.io.Serializable[] serializableArray61 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList62 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList62, serializableArray61);
        java.lang.Object obj64 = null;
        boolean boolean65 = serializableList62.equals(obj64);
        java.lang.Object obj66 = serializableList62.clone();
        java.util.stream.Stream<java.io.Serializable> serializableStream67 = serializableList62.parallelStream();
        java.io.Serializable serializable68 = serializableSet18.floor((java.io.Serializable) serializableList62);
        java.io.Serializable serializable69 = serializableSet3.floor((java.io.Serializable) serializableSet18);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableIterableList9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNull(serializable12);
        org.junit.Assert.assertNull(wildcardComparator13);
        org.junit.Assert.assertNotNull(serializableEnumeration14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableIterableList16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializableSet23);
        org.junit.Assert.assertNotNull(serializableSpliterator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(serializableArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(obj66);
        org.junit.Assert.assertEquals(obj66.toString(), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj66), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj66), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertNotNull(serializableStream67);
        org.junit.Assert.assertNull(serializable68);
        org.junit.Assert.assertNull(serializable69);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableList1.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList9 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet8);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.unmodifiableSortedSet(serializableSet8);
        java.util.TreeSet<java.io.Serializable> serializableSet11 = new java.util.TreeSet<java.io.Serializable>(serializableSet10);
        java.util.HashSet<java.lang.String> strSet13 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj14 = strSet13.clone();
        java.io.Serializable serializable15 = serializableSet11.lower((java.io.Serializable) strSet13);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        boolean boolean22 = strSet19.equals((java.lang.Object) false);
        boolean boolean23 = strSet19.isEmpty();
        boolean boolean25 = strSet19.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet26 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList27 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet26);
        java.util.SortedSet<java.io.Serializable> serializableSet28 = java.util.Collections.unmodifiableSortedSet(serializableSet26);
        java.util.TreeSet<java.io.Serializable> serializableSet29 = new java.util.TreeSet<java.io.Serializable>(serializableSet28);
        boolean boolean31 = serializableSet29.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator32 = serializableSet29.comparator();
        boolean boolean33 = strSet19.remove((java.lang.Object) serializableSet29);
        boolean boolean34 = strSet13.remove((java.lang.Object) serializableSet29);
        java.util.NavigableSet<java.io.Serializable> serializableSet35 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet29);
        boolean boolean36 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableList1, (java.util.Collection<java.io.Serializable>) serializableSet29);
        java.util.SortedSet<java.io.Serializable> serializableSet37 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList38 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet37);
        java.util.SortedSet<java.io.Serializable> serializableSet39 = java.util.Collections.unmodifiableSortedSet(serializableSet37);
        java.util.TreeSet<java.io.Serializable> serializableSet40 = new java.util.TreeSet<java.io.Serializable>(serializableSet39);
        java.io.Serializable serializable41 = serializableSet40.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator42 = serializableSet40.comparator();
        serializableSet40.clear();
        java.util.Iterator<java.io.Serializable> serializableItor44 = serializableSet40.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet45 = serializableSet40.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection46 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet40);
        java.util.SortedSet<java.io.Serializable> serializableSet47 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList48 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet47);
        java.util.SortedSet<java.io.Serializable> serializableSet49 = java.util.Collections.unmodifiableSortedSet(serializableSet47);
        java.util.TreeSet<java.io.Serializable> serializableSet50 = new java.util.TreeSet<java.io.Serializable>(serializableSet49);
        java.io.Serializable serializable51 = serializableSet50.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator52 = serializableSet50.comparator();
        int int53 = serializableSet50.size();
        java.io.Serializable serializable54 = serializableSet40.lower((java.io.Serializable) int53);
        boolean boolean55 = serializableSet40.isEmpty();
        java.util.ArrayList<java.io.Serializable> serializableList57 = new java.util.ArrayList<java.io.Serializable>((int) (byte) 0);
        java.util.SortedSet<java.io.Serializable> serializableSet58 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList59 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet58);
        java.util.SortedSet<java.io.Serializable> serializableSet60 = java.util.Collections.unmodifiableSortedSet(serializableSet58);
        java.util.TreeSet<java.io.Serializable> serializableSet61 = new java.util.TreeSet<java.io.Serializable>(serializableSet60);
        java.io.Serializable serializable62 = serializableSet61.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet64 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet66 = serializableSet61.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet68 = serializableSet61.headSet((java.io.Serializable) (short) 0);
        boolean boolean69 = serializableList57.retainAll((java.util.Collection<java.io.Serializable>) serializableSet61);
        boolean boolean70 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList1, (java.io.Serializable) serializableSet40, (java.io.Serializable) boolean69);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableIterableList9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(serializableSet26);
        org.junit.Assert.assertNotNull(serializableIterableList27);
        org.junit.Assert.assertNotNull(serializableSet28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardComparator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(serializableSet37);
        org.junit.Assert.assertNotNull(serializableIterableList38);
        org.junit.Assert.assertNotNull(serializableSet39);
        org.junit.Assert.assertNull(serializable41);
        org.junit.Assert.assertNull(wildcardComparator42);
        org.junit.Assert.assertNotNull(serializableItor44);
        org.junit.Assert.assertNotNull(serializableSet45);
        org.junit.Assert.assertNotNull(serializableCollection46);
        org.junit.Assert.assertNotNull(serializableSet47);
        org.junit.Assert.assertNotNull(serializableIterableList48);
        org.junit.Assert.assertNotNull(serializableSet49);
        org.junit.Assert.assertNull(serializable51);
        org.junit.Assert.assertNull(wildcardComparator52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNull(serializable54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(serializableSet58);
        org.junit.Assert.assertNotNull(serializableIterableList59);
        org.junit.Assert.assertNotNull(serializableSet60);
        org.junit.Assert.assertNull(serializable62);
        org.junit.Assert.assertNotNull(serializableSet66);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.NavigableSet<java.io.Serializable> serializableSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator8 = serializableSet3.comparator();
        java.lang.Object obj9 = serializableSet3.clone();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNull(wildcardComparator8);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        java.util.NavigableSet<java.io.Serializable> serializableSet10 = serializableSet3.headSet((java.io.Serializable) 100.0d, false);
        java.util.TreeSet<java.io.Serializable> serializableSet11 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet10);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet10);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        boolean boolean15 = serializableSet13.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet13.comparator();
        boolean boolean17 = strSet3.remove((java.lang.Object) serializableSet13);
        boolean boolean18 = strSet3.isEmpty();
        java.util.SortedMap<java.lang.reflect.GenericDeclaration, java.util.SortedMap<java.util.Enumeration<java.util.HashSet<java.lang.String>>, java.util.Iterator<java.io.Serializable>>> genericDeclarationMap19 = java.util.Collections.emptySortedMap();
        boolean boolean20 = strSet3.contains((java.lang.Object) genericDeclarationMap19);
        boolean boolean21 = strSet3.isEmpty();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(genericDeclarationMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable serializable6 = serializableSet3.ceiling((java.io.Serializable) 0.0d);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L);
        java.lang.Object obj10 = serializableSet3.clone();
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableSet3.stream();
        java.util.Iterator<java.io.Serializable> serializableItor12 = serializableSet3.descendingIterator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNotNull(serializableItor12);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.NavigableSet<java.io.Serializable> serializableSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.Enumeration<java.io.Serializable> serializableEnumeration8 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.Collection<java.io.Serializable> serializableCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableEnumeration8);
        org.junit.Assert.assertNotNull(serializableCollection9);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.util.HashSet<java.lang.String> strSet12 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj13 = strSet12.clone();
        java.io.Serializable serializable14 = serializableSet10.lower((java.io.Serializable) strSet12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean21 = strSet18.equals((java.lang.Object) false);
        boolean boolean22 = strSet18.isEmpty();
        boolean boolean24 = strSet18.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet25 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList26 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet25);
        java.util.SortedSet<java.io.Serializable> serializableSet27 = java.util.Collections.unmodifiableSortedSet(serializableSet25);
        java.util.TreeSet<java.io.Serializable> serializableSet28 = new java.util.TreeSet<java.io.Serializable>(serializableSet27);
        boolean boolean30 = serializableSet28.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator31 = serializableSet28.comparator();
        boolean boolean32 = strSet18.remove((java.lang.Object) serializableSet28);
        boolean boolean33 = strSet12.remove((java.lang.Object) serializableSet28);
        java.util.NavigableSet<java.io.Serializable> serializableSet34 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet28);
        java.lang.Object obj35 = serializableSet28.clone();
        boolean boolean36 = serializableSet3.addAll((java.util.Collection<java.io.Serializable>) serializableSet28);
        java.util.NavigableSet<java.io.Serializable> serializableSet39 = serializableSet3.headSet((java.io.Serializable) 0, true);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serializableSet25);
        org.junit.Assert.assertNotNull(serializableIterableList26);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardComparator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(serializableSet34);
        org.junit.Assert.assertNotNull(obj35);
        org.junit.Assert.assertEquals(obj35.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj35), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj35), "[]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(serializableSet39);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable serializable6 = serializableSet3.ceiling((java.io.Serializable) 0.0d);
        java.lang.Object obj7 = serializableSet3.clone();
        java.io.Serializable[] serializableArray48 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList49 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList49, serializableArray48);
        java.util.Collection<java.io.Serializable> serializableCollection51 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList49);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] { 'a', 10, 100, serializableList49, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList59 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList59, serializableArray58);
        boolean boolean63 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList59, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap66 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int67 = serializableList59.lastIndexOf((java.lang.Object) (short) 1);
        java.util.Enumeration<java.io.Serializable> serializableEnumeration68 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList59);
        java.io.Serializable serializable69 = serializableSet3.floor((java.io.Serializable) serializableList59);
        java.util.Collections.rotate((java.util.List<java.io.Serializable>) serializableList59, 0);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertEquals(obj7.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "[]");
        org.junit.Assert.assertNotNull(serializableArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(serializableCollection51);
        org.junit.Assert.assertNotNull(serializableArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(serializableMap66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration68);
        org.junit.Assert.assertNull(serializable69);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.lang.String str62 = serializableList51.toString();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "[]" + "'", str62, "[]");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Iterator<java.io.Serializable> serializableItor6 = serializableSet3.descendingIterator();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet9 = new java.util.HashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.Object obj11 = null;
        boolean boolean12 = strSet9.remove(obj11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList14 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet13);
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.unmodifiableSortedSet(serializableSet13);
        java.util.TreeSet<java.io.Serializable> serializableSet16 = new java.util.TreeSet<java.io.Serializable>(serializableSet15);
        boolean boolean18 = serializableSet16.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable19 = serializableSet16.pollLast();
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet16);
        boolean boolean21 = strSet9.remove((java.lang.Object) serializableSet16);
        boolean boolean22 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet16);
        java.util.Iterator<java.io.Serializable> serializableItor23 = serializableSet16.iterator();
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.lang.Object obj62 = null;
        boolean boolean63 = serializableList60.equals(obj62);
        java.util.stream.Stream<java.io.Serializable> serializableStream64 = serializableList60.stream();
        java.io.Serializable serializable66 = serializableList60.remove(1);
        boolean boolean67 = serializableSet16.retainAll((java.util.Collection<java.io.Serializable>) serializableList60);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(serializableIterableList14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(serializableItor23);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(serializableStream64);
        org.junit.Assert.assertEquals("'" + serializable66 + "' != '" + (-1) + "'", serializable66, (-1));
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        serializableSet3.clear();
        java.lang.Object obj8 = serializableSet3.clone();
        java.io.Serializable serializable9 = serializableSet3.pollLast();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        java.io.Serializable serializable13 = serializableSet12.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator14 = serializableSet12.comparator();
        boolean boolean15 = serializableSet12.isEmpty();
        java.io.Serializable[] serializableArray56 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList57 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList57, serializableArray56);
        java.util.Collection<java.io.Serializable> serializableCollection59 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList57);
        java.io.Serializable[] serializableArray66 = new java.io.Serializable[] { 'a', 10, 100, serializableList57, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList67, serializableArray66);
        boolean boolean71 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList67, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap74 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int75 = serializableList67.lastIndexOf((java.lang.Object) (short) 1);
        serializableList67.clear();
        java.util.Random random77 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList67, random77);
        java.io.Serializable serializable79 = serializableSet12.lower((java.io.Serializable) random77);
        java.util.Set<java.io.Serializable> serializableSet80 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet12);
        java.lang.Object obj81 = serializableSet12.clone();
        java.util.NavigableSet<java.io.Serializable> serializableSet82 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet12);
        int int83 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableSet8, (java.lang.Object) serializableSet82);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertNull(serializable13);
        org.junit.Assert.assertNull(wildcardComparator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(serializableArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(serializableCollection59);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(serializableMap74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNull(serializable79);
        org.junit.Assert.assertNotNull(serializableSet80);
        org.junit.Assert.assertNotNull(obj81);
        org.junit.Assert.assertEquals(obj81.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj81), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj81), "[]");
        org.junit.Assert.assertNotNull(serializableSet82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        java.io.Serializable serializable14 = serializableSet13.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator15 = serializableSet13.comparator();
        int int16 = serializableSet13.size();
        java.io.Serializable serializable17 = serializableSet3.lower((java.io.Serializable) int16);
        boolean boolean18 = serializableSet3.isEmpty();
        java.lang.Object obj19 = serializableSet3.clone();
        java.lang.Class<java.io.Serializable> serializableClass20 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.io.Serializable> serializableSet21 = java.util.Collections.checkedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3, serializableClass20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(wildcardComparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertEquals(obj19.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj19), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj19), "[]");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable serializable6 = serializableSet3.ceiling((java.io.Serializable) 0.0d);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L);
        java.util.ArrayList<java.io.Serializable> serializableList10 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.ListIterator<java.io.Serializable> serializableItor12 = serializableList10.listIterator(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 10, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(serializableSet9);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        java.util.Enumeration<java.util.stream.BaseStream<java.io.Serializable, java.util.stream.Stream<java.io.Serializable>>> serializableBaseStreamEnumeration0 = java.util.Collections.emptyEnumeration();
        org.junit.Assert.assertNotNull(serializableBaseStreamEnumeration0);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.util.SortedMap<java.io.Serializable, java.lang.Comparable<java.lang.String>> serializableMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(serializableMap0);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        java.util.ArrayList<java.io.Serializable> serializableList2 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray7 = serializableList2.toArray((java.lang.Comparable<java.lang.String>[]) strArray6);
        java.util.Iterator<java.io.Serializable> serializableItor8 = serializableList2.iterator();
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] {};
        java.util.Collections.fill((java.util.List<java.io.Serializable>) serializableList2, typeArray9);
        java.util.List<java.lang.reflect.Type[]> typeArrayList11 = java.util.Collections.nCopies(37, typeArray9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = null;
        java.util.Map<java.lang.reflect.Type[], java.util.TreeSet<java.io.Serializable>> typeArrayMap13 = java.util.Collections.singletonMap(typeArray9, serializableSet12);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strComparableArray7);
        org.junit.Assert.assertNotNull(serializableItor8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(typeArrayList11);
        org.junit.Assert.assertNotNull(typeArrayMap13);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator17 = serializableSet12.spliterator();
        serializableSet12.clear();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator17);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator12 = serializableSet10.comparator();
        int int13 = serializableSet10.size();
        java.util.SortedSet<java.io.Serializable> serializableSet14 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList15 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet14);
        java.util.SortedSet<java.io.Serializable> serializableSet16 = java.util.Collections.unmodifiableSortedSet(serializableSet14);
        java.util.TreeSet<java.io.Serializable> serializableSet17 = new java.util.TreeSet<java.io.Serializable>(serializableSet16);
        java.io.Serializable serializable18 = serializableSet17.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet20 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet22 = serializableSet17.tailSet((java.io.Serializable) '4', true);
        boolean boolean23 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableSet10, (java.util.Collection<java.io.Serializable>) serializableSet17);
        java.util.NavigableSet<java.io.Serializable> serializableSet24 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet17);
        boolean boolean25 = strSet3.removeAll((java.util.Collection<java.io.Serializable>) serializableSet24);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(wildcardComparator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(serializableSet14);
        org.junit.Assert.assertNotNull(serializableIterableList15);
        org.junit.Assert.assertNotNull(serializableSet16);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNotNull(serializableSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(serializableSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        java.io.Serializable serializable14 = serializableSet13.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator15 = serializableSet13.comparator();
        int int16 = serializableSet13.size();
        java.io.Serializable serializable17 = serializableSet3.lower((java.io.Serializable) int16);
        boolean boolean18 = serializableSet3.isEmpty();
        java.io.Serializable serializable19 = serializableSet3.pollFirst();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNull(wildcardComparator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(serializable19);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.ListIterator<java.io.Serializable> serializableItor56 = serializableList51.listIterator();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet60 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet60, strArray59);
        boolean boolean63 = strSet60.equals((java.lang.Object) false);
        boolean boolean64 = strSet60.isEmpty();
        boolean boolean66 = strSet60.equals((java.lang.Object) 10L);
        java.util.Iterator<java.lang.String> strItor67 = strSet60.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet68 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList69 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet68);
        java.util.SortedSet<java.io.Serializable> serializableSet70 = java.util.Collections.unmodifiableSortedSet(serializableSet68);
        java.util.TreeSet<java.io.Serializable> serializableSet71 = new java.util.TreeSet<java.io.Serializable>(serializableSet70);
        java.io.Serializable serializable72 = serializableSet71.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator73 = serializableSet71.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet74 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet71);
        java.util.stream.Stream[][] streamArray75 = new java.util.stream.Stream[][] {};
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet71, streamArray75);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator77 = serializableSet71.comparator();
        boolean boolean78 = strSet60.equals((java.lang.Object) serializableSet71);
        java.lang.Object obj79 = strSet60.clone();
        boolean boolean80 = strSet60.isEmpty();
        boolean boolean81 = strSet60.isEmpty();
        java.util.ArrayList<java.io.Serializable> serializableList83 = new java.util.ArrayList<java.io.Serializable>((int) (byte) 0);
        boolean boolean84 = strSet60.equals((java.lang.Object) serializableList83);
        int int85 = serializableList51.indexOf((java.lang.Object) boolean84);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableItor56);
        org.junit.Assert.assertNotNull(strArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strItor67);
        org.junit.Assert.assertNotNull(serializableSet68);
        org.junit.Assert.assertNotNull(serializableIterableList69);
        org.junit.Assert.assertNotNull(serializableSet70);
        org.junit.Assert.assertNull(serializable72);
        org.junit.Assert.assertNull(wildcardComparator73);
        org.junit.Assert.assertNotNull(serializableSet74);
        org.junit.Assert.assertNotNull(streamArray75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(wildcardComparator77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(obj79);
        org.junit.Assert.assertEquals(obj79.toString(), "[hi!]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj79), "[hi!]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj79), "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 9 + "'", int85 == 9);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableList1.iterator();
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] {};
        java.util.Collections.fill((java.util.List<java.io.Serializable>) serializableList1, typeArray8);
        java.util.Iterator<java.io.Serializable> serializableItor10 = serializableList1.iterator();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(serializableItor10);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        boolean boolean5 = serializableSet3.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator6 = serializableSet3.comparator();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.HashSet<java.lang.Comparable<java.lang.String>> strComparableSet8 = new java.util.HashSet<java.lang.Comparable<java.lang.String>>();
        java.io.Serializable serializable9 = serializableSet3.ceiling((java.io.Serializable) strComparableSet8);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNull(serializable9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object obj41 = serializableList38.clone();
        java.util.Iterator<java.io.Serializable> serializableItor42 = serializableList38.iterator();
        serializableList38.clear();
        java.util.HashSet<java.lang.String> strSet45 = new java.util.HashSet<java.lang.String>(10);
        boolean boolean46 = serializableList38.remove((java.lang.Object) 10);
        java.lang.Object obj47 = serializableList38.clone();
        java.util.List<java.io.Serializable> serializableList48 = java.util.Collections.synchronizedList((java.util.List<java.io.Serializable>) serializableList38);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(obj41);
        org.junit.Assert.assertEquals(obj41.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(obj47);
        org.junit.Assert.assertEquals(obj47.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj47), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj47), "[]");
        org.junit.Assert.assertNotNull(serializableList48);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Iterator<java.io.Serializable> serializableItor6 = serializableSet3.descendingIterator();
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable7 = serializableSet3.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor6);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>(34);
        boolean boolean2 = strSet1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet3 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.Collection<java.io.Serializable> serializableCollection4 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableSet3);
        org.junit.Assert.assertNotNull(serializableCollection4);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.Collection<java.io.Serializable> serializableCollection9 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.io.Serializable[] serializableArray45 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList46 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList46, serializableArray45);
        java.lang.Object obj48 = null;
        boolean boolean49 = serializableList46.equals(obj48);
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList46);
        java.io.Serializable serializable51 = serializableSet3.lower((java.io.Serializable) serializableList46);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator52 = serializableSet3.spliterator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableCollection9);
        org.junit.Assert.assertNotNull(serializableArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(serializable51);
        org.junit.Assert.assertNotNull(serializableSpliterator52);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        java.util.HashSet<java.lang.String> strSet2 = new java.util.HashSet<java.lang.String>(35, (float) 39);
        java.util.Spliterator<java.lang.String> strSpliterator3 = strSet2.spliterator();
        org.junit.Assert.assertNotNull(strSpliterator3);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.NavigableSet<java.io.Serializable> serializableSet7 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator8 = serializableSet3.comparator();
        int int9 = serializableSet3.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNull(wildcardComparator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.util.SortedSet<java.io.Serializable> serializableSet42 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList43 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet42);
        java.util.SortedSet<java.io.Serializable> serializableSet44 = java.util.Collections.unmodifiableSortedSet(serializableSet42);
        java.util.TreeSet<java.io.Serializable> serializableSet45 = new java.util.TreeSet<java.io.Serializable>(serializableSet44);
        java.util.Iterator<java.io.Serializable> serializableItor46 = serializableSet45.iterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator47 = serializableSet45.spliterator();
        boolean boolean48 = serializableList38.retainAll((java.util.Collection<java.io.Serializable>) serializableSet45);
        serializableList38.trimToSize();
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableSet42);
        org.junit.Assert.assertNotNull(serializableIterableList43);
        org.junit.Assert.assertNotNull(serializableSet44);
        org.junit.Assert.assertNotNull(serializableItor46);
        org.junit.Assert.assertNotNull(serializableSpliterator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.stream.Stream<java.io.Serializable> serializableStream84 = serializableList80.stream();
        boolean boolean85 = serializableList80.isEmpty();
        java.util.Collection<java.io.Serializable> serializableCollection86 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList80);
        java.util.Map map87 = java.util.Collections.EMPTY_MAP;
        int int88 = serializableList80.lastIndexOf((java.lang.Object) map87);
        java.util.HashSet<java.lang.String> strSet91 = new java.util.HashSet<java.lang.String>(10);
        java.io.Serializable serializable92 = serializableList80.set(34, (java.io.Serializable) 10);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableStream84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(serializableCollection86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
        org.junit.Assert.assertEquals("'" + serializable92 + "' != '" + (byte) 0 + "'", serializable92, (byte) 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = serializableList8.toArray((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.util.Random random14 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList8, random14);
        java.io.Serializable serializable16 = serializableSet3.ceiling((java.io.Serializable) random14);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator17 = serializableSet3.spliterator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNotNull(serializableSpliterator17);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap58 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int59 = serializableList51.lastIndexOf((java.lang.Object) (short) 1);
        serializableList51.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration61 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList51);
        java.util.Random random62 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random62);
        serializableList51.trimToSize();
        java.util.Random random65 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList51, random65);
        java.util.ArrayList<java.io.Serializable> serializableList67 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList51);
        serializableList67.clear();
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableMap58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration61);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        java.util.NavigableMap<java.util.stream.Stream<java.io.Serializable>, java.lang.String[]> serializableStreamMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(serializableStreamMap0);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet6 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = serializableSet3.headSet((java.io.Serializable) (short) 0);
        int int11 = serializableSet3.size();
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList13 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet12);
        java.util.SortedSet<java.io.Serializable> serializableSet14 = java.util.Collections.unmodifiableSortedSet(serializableSet12);
        java.util.TreeSet<java.io.Serializable> serializableSet15 = new java.util.TreeSet<java.io.Serializable>(serializableSet14);
        java.io.Serializable serializable16 = serializableSet15.pollFirst();
        java.io.Serializable serializable18 = serializableSet15.ceiling((java.io.Serializable) 0.0d);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator19 = serializableSet15.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet21 = serializableSet15.tailSet((java.io.Serializable) 100L);
        java.lang.Object obj22 = serializableSet15.clone();
        java.util.NavigableSet<java.io.Serializable> serializableSet23 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet15);
        boolean boolean24 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet23);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertNotNull(serializableIterableList13);
        org.junit.Assert.assertNotNull(serializableSet14);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNull(serializable18);
        org.junit.Assert.assertNull(wildcardComparator19);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNotNull(obj22);
        org.junit.Assert.assertEquals(obj22.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj22), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj22), "[]");
        org.junit.Assert.assertNotNull(serializableSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet6 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = serializableSet3.headSet((java.io.Serializable) (short) 0);
        int int11 = serializableSet3.size();
        java.io.Serializable serializable12 = serializableSet3.pollFirst();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNull(serializable12);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.io.Serializable serializable7 = serializableSet3.pollFirst();
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.descendingSet();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet8);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet9);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        java.util.List<java.lang.Iterable<java.io.Serializable>[]> serializableIterableArrayList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(serializableIterableArrayList0);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.util.TreeSet<java.io.Serializable> serializableSet8 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream9 = serializableSet3.parallelStream();
        java.util.Iterator<java.io.Serializable> serializableItor10 = serializableSet3.iterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet11 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        int int12 = serializableSet3.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableStream9);
        org.junit.Assert.assertNotNull(serializableItor10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        boolean boolean5 = serializableSet3.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator6 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = serializableSet10.headSet((java.io.Serializable) (short) 0);
        int int18 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableSet3, (java.lang.Object) serializableSet17);
        java.util.Set<java.io.Serializable> serializableSet19 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableSet3.stream();
        java.util.Set<java.io.Serializable> serializableSet21 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet3);
        java.lang.Object[] objArray22 = serializableSet3.toArray();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[]");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        boolean boolean15 = serializableSet13.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet13.comparator();
        boolean boolean17 = strSet3.remove((java.lang.Object) serializableSet13);
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableSet13.stream();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableStream18);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((int) (byte) 0);
        java.io.Serializable[] serializableArray39 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList40 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList40, serializableArray39);
        java.util.Collection<java.io.Serializable> serializableCollection42 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList40);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator43 = serializableList40.spliterator();
        serializableList40.ensureCapacity((int) (byte) 100);
        boolean boolean46 = serializableList1.equals((java.lang.Object) serializableList40);
        org.junit.Assert.assertNotNull(serializableArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(serializableCollection42);
        org.junit.Assert.assertNotNull(serializableSpliterator43);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        java.util.Enumeration<java.util.HashSet<java.lang.String>> strSetEnumeration0 = java.util.Collections.emptyEnumeration();
        java.util.Set<java.util.Enumeration<java.util.HashSet<java.lang.String>>> strSetEnumerationSet1 = java.util.Collections.singleton(strSetEnumeration0);
        java.util.ArrayList<java.util.HashSet<java.lang.String>> strSetList2 = java.util.Collections.list(strSetEnumeration0);
        java.util.ArrayList<java.util.HashSet<java.lang.String>> strSetList3 = java.util.Collections.list(strSetEnumeration0);
        org.junit.Assert.assertNotNull(strSetEnumeration0);
        org.junit.Assert.assertNotNull(strSetEnumerationSet1);
        org.junit.Assert.assertNotNull(strSetList2);
        org.junit.Assert.assertNotNull(strSetList3);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.util.ListIterator<java.io.Serializable> serializableItor42 = serializableList38.listIterator();
        java.io.Serializable serializable44 = serializableList38.get((int) ' ');
        java.io.Serializable[] serializableArray82 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList83 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean84 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList83, serializableArray82);
        java.util.Collection<java.io.Serializable> serializableCollection85 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList83);
        java.lang.Object obj86 = serializableList83.clone();
        java.util.Iterator<java.io.Serializable> serializableItor87 = serializableList83.iterator();
        serializableList83.clear();
        java.util.HashSet<java.lang.String> strSet90 = new java.util.HashSet<java.lang.String>(10);
        boolean boolean91 = serializableList83.remove((java.lang.Object) 10);
        java.lang.String[] strArray92 = new java.lang.String[] {};
        java.lang.String[] strArray93 = serializableList83.toArray(strArray92);
        int int94 = java.util.Collections.indexOfSubList((java.util.List<java.io.Serializable>) serializableList38, (java.util.List<java.io.Serializable>) serializableList83);
        java.util.Iterator<java.io.Serializable> serializableItor95 = serializableList83.iterator();
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor42);
        org.junit.Assert.assertEquals("'" + serializable44 + "' != '" + 1.0d + "'", serializable44, 1.0d);
        org.junit.Assert.assertNotNull(serializableArray82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(serializableCollection85);
        org.junit.Assert.assertNotNull(obj86);
        org.junit.Assert.assertEquals(obj86.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj86), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj86), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor87);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 0 + "'", int94 == 0);
        org.junit.Assert.assertNotNull(serializableItor95);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList3 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet2);
        java.util.SortedSet<java.io.Serializable> serializableSet4 = java.util.Collections.unmodifiableSortedSet(serializableSet2);
        java.util.TreeSet<java.io.Serializable> serializableSet5 = new java.util.TreeSet<java.io.Serializable>(serializableSet4);
        java.io.Serializable serializable6 = serializableSet5.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet5.comparator();
        int int8 = serializableSet5.size();
        boolean boolean9 = strSet1.remove((java.lang.Object) serializableSet5);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean16 = strSet13.equals((java.lang.Object) false);
        boolean boolean17 = strSet13.isEmpty();
        boolean boolean19 = strSet13.equals((java.lang.Object) 10L);
        java.io.Serializable serializable20 = serializableSet5.lower((java.io.Serializable) 10L);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableIterableList3);
        org.junit.Assert.assertNotNull(serializableSet4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(serializable20);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator12 = serializableSet10.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet14 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList15 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet14);
        java.util.SortedSet<java.io.Serializable> serializableSet16 = java.util.Collections.unmodifiableSortedSet(serializableSet14);
        java.util.TreeSet<java.io.Serializable> serializableSet17 = new java.util.TreeSet<java.io.Serializable>(serializableSet16);
        java.util.HashSet<java.lang.String> strSet19 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj20 = strSet19.clone();
        java.io.Serializable serializable21 = serializableSet17.lower((java.io.Serializable) strSet19);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean28 = strSet25.equals((java.lang.Object) false);
        boolean boolean29 = strSet25.isEmpty();
        boolean boolean31 = strSet25.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet32 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList33 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet32);
        java.util.SortedSet<java.io.Serializable> serializableSet34 = java.util.Collections.unmodifiableSortedSet(serializableSet32);
        java.util.TreeSet<java.io.Serializable> serializableSet35 = new java.util.TreeSet<java.io.Serializable>(serializableSet34);
        boolean boolean37 = serializableSet35.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator38 = serializableSet35.comparator();
        boolean boolean39 = strSet25.remove((java.lang.Object) serializableSet35);
        boolean boolean40 = strSet19.remove((java.lang.Object) serializableSet35);
        boolean boolean41 = serializableSet10.remove((java.lang.Object) boolean40);
        java.lang.reflect.Type[] typeArray42 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray43 = serializableSet10.toArray(typeArray42);
        boolean boolean44 = serializableList1.retainAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet45 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList46 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet45);
        java.util.SortedSet<java.io.Serializable> serializableSet47 = java.util.Collections.unmodifiableSortedSet(serializableSet45);
        boolean boolean48 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableList1, (java.util.Collection<java.io.Serializable>) serializableSet47);
        java.util.SortedSet<java.io.Serializable> serializableSet49 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList50 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet49);
        java.util.SortedSet<java.io.Serializable> serializableSet51 = java.util.Collections.unmodifiableSortedSet(serializableSet49);
        java.util.Set<java.io.Serializable> serializableSet52 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet51);
        boolean boolean53 = serializableList1.addAll((java.util.Collection<java.io.Serializable>) serializableSet52);
        java.util.ListIterator<java.io.Serializable> serializableItor54 = serializableList1.listIterator();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(wildcardComparator12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(serializableSet14);
        org.junit.Assert.assertNotNull(serializableIterableList15);
        org.junit.Assert.assertNotNull(serializableSet16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(serializableSet32);
        org.junit.Assert.assertNotNull(serializableIterableList33);
        org.junit.Assert.assertNotNull(serializableSet34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardComparator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(serializableSet45);
        org.junit.Assert.assertNotNull(serializableIterableList46);
        org.junit.Assert.assertNotNull(serializableSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(serializableSet49);
        org.junit.Assert.assertNotNull(serializableIterableList50);
        org.junit.Assert.assertNotNull(serializableSet51);
        org.junit.Assert.assertNotNull(serializableSet52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(serializableItor54);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.util.TreeSet<java.io.Serializable> serializableSet17 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream18 = serializableSet17.stream();
        serializableSet17.clear();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(serializableStream18);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        java.util.List<java.lang.String> strList0 = java.util.Collections.emptyList();
        org.junit.Assert.assertNotNull(strList0);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Iterator<java.io.Serializable> serializableItor6 = serializableSet3.descendingIterator();
        java.lang.String[] strArray8 = new java.lang.String[] { "" };
        java.util.HashSet<java.lang.String> strSet9 = new java.util.HashSet<java.lang.String>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet9, strArray8);
        java.lang.Object obj11 = null;
        boolean boolean12 = strSet9.remove(obj11);
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList14 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet13);
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.unmodifiableSortedSet(serializableSet13);
        java.util.TreeSet<java.io.Serializable> serializableSet16 = new java.util.TreeSet<java.io.Serializable>(serializableSet15);
        boolean boolean18 = serializableSet16.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable19 = serializableSet16.pollLast();
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet16);
        boolean boolean21 = strSet9.remove((java.lang.Object) serializableSet16);
        boolean boolean22 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet16);
        boolean boolean23 = serializableSet3.isEmpty();
        java.util.ArrayList<java.io.Serializable> serializableList25 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray29 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray30 = serializableList25.toArray((java.lang.Comparable<java.lang.String>[]) strArray29);
        // The following exception was thrown during execution in test generation
        try {
            java.util.NavigableSet<java.io.Serializable> serializableSet32 = serializableSet3.headSet((java.io.Serializable) strComparableArray30, false);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: class [Ljava.lang.String; cannot be cast to class java.lang.Comparable ([Ljava.lang.String; and java.lang.Comparable are in module java.base of loader 'bootstrap')");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(serializableIterableList14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strArray29);
        org.junit.Assert.assertNotNull(strComparableArray30);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration6 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator16 = serializableSet10.spliterator();
        boolean boolean17 = serializableSet3.addAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.io.Serializable[] serializableArray58 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList59 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList59, serializableArray58);
        java.util.Collection<java.io.Serializable> serializableCollection61 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList59);
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { 'a', 10, 100, serializableList59, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        boolean boolean73 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList69, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        java.util.Map<java.io.Serializable, java.lang.Object> serializableMap76 = java.util.Collections.singletonMap((java.io.Serializable) (short) 1, (java.lang.Object) (short) 1);
        int int77 = serializableList69.lastIndexOf((java.lang.Object) (short) 1);
        serializableList69.clear();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration79 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList69);
        boolean boolean80 = serializableSet3.retainAll((java.util.Collection<java.io.Serializable>) serializableList69);
        java.util.NavigableSet<java.io.Serializable> serializableSet81 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableEnumeration6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(serializableCollection61);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(serializableMap76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(serializableEnumeration79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(serializableSet81);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.Iterator<java.io.Serializable> serializableItor4 = serializableSet3.iterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator5 = serializableSet3.spliterator();
        java.util.TreeSet<java.io.Serializable> serializableSet6 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet10, strArray9);
        boolean boolean13 = strSet10.equals((java.lang.Object) false);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strSet10.spliterator();
        java.util.Map<java.util.SortedSet<java.io.Serializable>, java.util.AbstractSet<java.lang.String>> serializableSetMap15 = java.util.Collections.singletonMap((java.util.SortedSet<java.io.Serializable>) serializableSet6, (java.util.AbstractSet<java.lang.String>) strSet10);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableItor4);
        org.junit.Assert.assertNotNull(serializableSpliterator5);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(serializableSetMap15);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.ArrayList<java.io.Serializable> serializableList8 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray12 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray13 = serializableList8.toArray((java.lang.Comparable<java.lang.String>[]) strArray12);
        java.util.Random random14 = null;
        java.util.Collections.shuffle((java.util.List<java.io.Serializable>) serializableList8, random14);
        java.io.Serializable serializable16 = serializableSet3.ceiling((java.io.Serializable) random14);
        java.util.Iterator<java.io.Serializable> serializableItor17 = serializableSet3.iterator();
        java.lang.Object[] objArray18 = serializableSet3.toArray();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strComparableArray13);
        org.junit.Assert.assertNull(serializable16);
        org.junit.Assert.assertNotNull(serializableItor17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        java.util.NavigableMap<java.util.LinkedHashSet<java.lang.String>, java.lang.Comparable<java.lang.String>[]> strSetMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(strSetMap0);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.io.Serializable serializable6 = serializableSet3.ceiling((java.io.Serializable) 0.0d);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = serializableSet3.tailSet((java.io.Serializable) 100L);
        java.util.Collection<java.io.Serializable> serializableCollection10 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet9);
        java.lang.Class<?> wildcardClass11 = serializableSet9.getClass();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableCollection10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        boolean boolean15 = serializableSet13.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet13.comparator();
        boolean boolean17 = strSet3.remove((java.lang.Object) serializableSet13);
        java.util.NavigableSet<java.io.Serializable> serializableSet18 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet13);
        java.util.SortedSet<java.io.Serializable> serializableSet19 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet13);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable20 = serializableSet13.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNotNull(serializableSet19);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator0 = java.util.Collections.reverseOrder();
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator1 = java.util.Collections.reverseOrder(charSequenceComparator0);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator2 = java.util.Collections.reverseOrder(charSequenceComparator0);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator3 = java.util.Collections.reverseOrder(charSequenceComparator2);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator4 = java.util.Collections.reverseOrder(charSequenceComparator2);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator5 = java.util.Collections.reverseOrder(charSequenceComparator2);
        org.junit.Assert.assertNotNull(charSequenceComparator0);
        org.junit.Assert.assertNotNull(charSequenceComparator1);
        org.junit.Assert.assertNotNull(charSequenceComparator2);
        org.junit.Assert.assertNotNull(charSequenceComparator3);
        org.junit.Assert.assertNotNull(charSequenceComparator4);
        org.junit.Assert.assertNotNull(charSequenceComparator5);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        int int10 = strSet3.size();
        boolean boolean12 = strSet3.add("");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 1);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList3 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet2);
        java.util.SortedSet<java.io.Serializable> serializableSet4 = java.util.Collections.unmodifiableSortedSet(serializableSet2);
        java.util.TreeSet<java.io.Serializable> serializableSet5 = new java.util.TreeSet<java.io.Serializable>(serializableSet4);
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj8 = strSet7.clone();
        java.io.Serializable serializable9 = serializableSet5.lower((java.io.Serializable) strSet7);
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet13, strArray12);
        boolean boolean16 = strSet13.equals((java.lang.Object) false);
        boolean boolean17 = strSet13.isEmpty();
        boolean boolean19 = strSet13.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList21 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet20);
        java.util.SortedSet<java.io.Serializable> serializableSet22 = java.util.Collections.unmodifiableSortedSet(serializableSet20);
        java.util.TreeSet<java.io.Serializable> serializableSet23 = new java.util.TreeSet<java.io.Serializable>(serializableSet22);
        boolean boolean25 = serializableSet23.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator26 = serializableSet23.comparator();
        boolean boolean27 = strSet13.remove((java.lang.Object) serializableSet23);
        boolean boolean28 = strSet7.remove((java.lang.Object) serializableSet23);
        java.util.NavigableSet<java.io.Serializable> serializableSet29 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet23);
        java.util.SortedSet<java.io.Serializable> serializableSet30 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet29);
        java.util.Collection<java.io.Serializable> serializableCollection31 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet29);
        boolean boolean32 = strSet1.remove((java.lang.Object) serializableCollection31);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableIterableList3);
        org.junit.Assert.assertNotNull(serializableSet4);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "[]");
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertNotNull(serializableIterableList21);
        org.junit.Assert.assertNotNull(serializableSet22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(wildcardComparator26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(serializableSet29);
        org.junit.Assert.assertNotNull(serializableSet30);
        org.junit.Assert.assertNotNull(serializableCollection31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        java.util.NavigableMap<java.util.Comparator<java.lang.CharSequence>, java.lang.Object> charSequenceComparatorMap0 = java.util.Collections.emptyNavigableMap();
        org.junit.Assert.assertNotNull(charSequenceComparatorMap0);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet6 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = serializableSet3.headSet((java.io.Serializable) (short) 0);
        int int11 = serializableSet3.size();
        java.util.Spliterator[] spliteratorArray13 = new java.util.Spliterator[0];
        @SuppressWarnings("unchecked")
        java.util.Spliterator<java.io.Serializable>[] serializableSpliteratorArray14 = (java.util.Spliterator<java.io.Serializable>[]) spliteratorArray13;
        boolean boolean15 = false; // flaky: java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet3, serializableSpliteratorArray14);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(spliteratorArray13);
        org.junit.Assert.assertNotNull(serializableSpliteratorArray14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.util.Collection<java.io.Serializable> serializableCollection62 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList60);
        java.io.Serializable[] serializableArray87 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList60, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList88 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList88, serializableArray87);
        serializableList88.ensureCapacity(100);
        java.lang.Object[] objArray92 = serializableList88.toArray();
        boolean boolean94 = serializableList88.remove((java.lang.Object) (byte) 0);
        java.io.Serializable serializable95 = serializableSet3.higher((java.io.Serializable) (byte) 0);
        java.util.Iterator<java.io.Serializable> serializableItor96 = serializableSet3.descendingIterator();
        java.lang.Class<java.io.Serializable> serializableClass97 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collection<java.io.Serializable> serializableCollection98 = java.util.Collections.checkedCollection((java.util.Collection<java.io.Serializable>) serializableSet3, serializableClass97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: type");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableCollection62);
        org.junit.Assert.assertNotNull(serializableArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(serializable95);
        org.junit.Assert.assertNotNull(serializableItor96);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        serializableList51.add(10, (java.io.Serializable) '#');
        java.util.SortedSet<java.io.Serializable> serializableSet59 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList60 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet59);
        java.util.SortedSet<java.io.Serializable> serializableSet61 = java.util.Collections.unmodifiableSortedSet(serializableSet59);
        java.util.TreeSet<java.io.Serializable> serializableSet62 = new java.util.TreeSet<java.io.Serializable>(serializableSet61);
        java.io.Serializable serializable63 = serializableSet62.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator64 = serializableSet62.comparator();
        boolean boolean65 = serializableSet62.isEmpty();
        serializableSet62.clear();
        java.io.Serializable serializable67 = serializableSet62.pollFirst();
        java.util.Collection<java.io.Serializable> serializableCollection68 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet62);
        java.util.ArrayList<java.io.Serializable> serializableList70 = new java.util.ArrayList<java.io.Serializable>(100);
        boolean boolean71 = serializableSet62.retainAll((java.util.Collection<java.io.Serializable>) serializableList70);
        int int72 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableList51, (java.lang.Object) serializableSet62);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSet59);
        org.junit.Assert.assertNotNull(serializableIterableList60);
        org.junit.Assert.assertNotNull(serializableSet61);
        org.junit.Assert.assertNull(serializable63);
        org.junit.Assert.assertNull(wildcardComparator64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(serializable67);
        org.junit.Assert.assertNotNull(serializableCollection68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.descendingSet();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator9 = serializableSet3.comparator();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNull(wildcardComparator9);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        java.lang.Object obj38 = null;
        boolean boolean39 = serializableList36.equals(obj38);
        java.io.Serializable serializable40 = null;
        java.util.HashSet<java.lang.String> strSet42 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        int int43 = strSet42.size();
        java.util.Enumeration<java.util.AbstractSet<java.lang.String>> strSetEnumeration44 = java.util.Collections.emptyEnumeration();
        boolean boolean45 = strSet42.remove((java.lang.Object) strSetEnumeration44);
        boolean boolean46 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList36, serializable40, (java.io.Serializable) boolean45);
        serializableList36.ensureCapacity(10);
        java.util.Enumeration<java.io.Serializable> serializableEnumeration49 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableList36);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strSetEnumeration44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serializableEnumeration49);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator12 = serializableSet10.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet13 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet14 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList15 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet14);
        java.util.SortedSet<java.io.Serializable> serializableSet16 = java.util.Collections.unmodifiableSortedSet(serializableSet14);
        java.util.TreeSet<java.io.Serializable> serializableSet17 = new java.util.TreeSet<java.io.Serializable>(serializableSet16);
        java.util.HashSet<java.lang.String> strSet19 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj20 = strSet19.clone();
        java.io.Serializable serializable21 = serializableSet17.lower((java.io.Serializable) strSet19);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet25 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet25, strArray24);
        boolean boolean28 = strSet25.equals((java.lang.Object) false);
        boolean boolean29 = strSet25.isEmpty();
        boolean boolean31 = strSet25.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet32 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList33 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet32);
        java.util.SortedSet<java.io.Serializable> serializableSet34 = java.util.Collections.unmodifiableSortedSet(serializableSet32);
        java.util.TreeSet<java.io.Serializable> serializableSet35 = new java.util.TreeSet<java.io.Serializable>(serializableSet34);
        boolean boolean37 = serializableSet35.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator38 = serializableSet35.comparator();
        boolean boolean39 = strSet25.remove((java.lang.Object) serializableSet35);
        boolean boolean40 = strSet19.remove((java.lang.Object) serializableSet35);
        boolean boolean41 = serializableSet10.remove((java.lang.Object) boolean40);
        java.lang.reflect.Type[] typeArray42 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray43 = serializableSet10.toArray(typeArray42);
        boolean boolean44 = serializableList1.retainAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet45 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList46 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet45);
        java.util.SortedSet<java.io.Serializable> serializableSet47 = java.util.Collections.unmodifiableSortedSet(serializableSet45);
        boolean boolean48 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableList1, (java.util.Collection<java.io.Serializable>) serializableSet47);
        serializableList1.clear();
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator50 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList1.replaceAll(serializableUnaryOperator50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(wildcardComparator12);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(serializableSet14);
        org.junit.Assert.assertNotNull(serializableIterableList15);
        org.junit.Assert.assertNotNull(serializableSet16);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(serializableSet32);
        org.junit.Assert.assertNotNull(serializableIterableList33);
        org.junit.Assert.assertNotNull(serializableSet34);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(wildcardComparator38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(serializableSet45);
        org.junit.Assert.assertNotNull(serializableIterableList46);
        org.junit.Assert.assertNotNull(serializableSet47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        java.util.HashSet<java.lang.Iterable<java.io.Serializable>> serializableIterableSet1 = new java.util.HashSet<java.lang.Iterable<java.io.Serializable>>((int) (short) 0);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        java.io.Serializable[] serializableArray35 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList36 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList36, serializableArray35);
        java.lang.Object obj38 = null;
        boolean boolean39 = serializableList36.equals(obj38);
        java.util.stream.Stream<java.io.Serializable> serializableStream40 = serializableList36.stream();
        java.util.List<java.io.Serializable> serializableList41 = java.util.Collections.synchronizedList((java.util.List<java.io.Serializable>) serializableList36);
        serializableList36.trimToSize();
        java.lang.Object[] objArray43 = serializableList36.toArray();
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList36);
        org.junit.Assert.assertNotNull(serializableArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(serializableStream40);
        org.junit.Assert.assertNotNull(serializableList41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[false, -1, a, -1.0, hi!, #, 4, 4, #, 10, 100, 1.0, -1, 0, 4, -1.0, -1.0, a, a, 10, hi!, -1, 0.0, 1.0, -1.0, 0.0, 100, 10.0, 4, 1, -1, -1, 100, 0, true]");
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet6 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.util.HashSet<java.lang.String> strSet12 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj13 = strSet12.clone();
        java.io.Serializable serializable14 = serializableSet10.lower((java.io.Serializable) strSet12);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean21 = strSet18.equals((java.lang.Object) false);
        boolean boolean22 = strSet18.isEmpty();
        boolean boolean24 = strSet18.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet25 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList26 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet25);
        java.util.SortedSet<java.io.Serializable> serializableSet27 = java.util.Collections.unmodifiableSortedSet(serializableSet25);
        java.util.TreeSet<java.io.Serializable> serializableSet28 = new java.util.TreeSet<java.io.Serializable>(serializableSet27);
        boolean boolean30 = serializableSet28.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator31 = serializableSet28.comparator();
        boolean boolean32 = strSet18.remove((java.lang.Object) serializableSet28);
        boolean boolean33 = strSet12.remove((java.lang.Object) serializableSet28);
        boolean boolean34 = serializableSet3.remove((java.lang.Object) boolean33);
        java.lang.reflect.Type[] typeArray35 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray36 = serializableSet3.toArray(typeArray35);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable37 = serializableSet3.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(obj13);
        org.junit.Assert.assertEquals(obj13.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj13), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj13), "[]");
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(serializableSet25);
        org.junit.Assert.assertNotNull(serializableIterableList26);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(wildcardComparator31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertNotNull(typeArray36);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet3 = java.util.Collections.synchronizedSortedSet(serializableSet0);
        java.util.Set<java.io.Serializable> serializableSet4 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet0);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet4);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        boolean boolean15 = serializableSet13.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet13.comparator();
        boolean boolean17 = strSet3.remove((java.lang.Object) serializableSet13);
        java.util.NavigableSet<java.io.Serializable> serializableSet18 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet13);
        java.util.Comparator<? super java.io.Serializable> wildcardComparator19 = serializableSet13.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet20 = serializableSet13.descendingSet();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNull(wildcardComparator19);
        org.junit.Assert.assertNotNull(serializableSet20);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        strSet1.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet3 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList4 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet5 = java.util.Collections.unmodifiableSortedSet(serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet6 = new java.util.TreeSet<java.io.Serializable>(serializableSet5);
        java.io.Serializable serializable7 = serializableSet6.pollFirst();
        java.io.Serializable serializable9 = serializableSet6.ceiling((java.io.Serializable) 0.0d);
        java.io.Serializable serializable10 = serializableSet6.pollLast();
        boolean boolean11 = strSet1.remove((java.lang.Object) serializable10);
        strSet1.clear();
        java.util.SortedSet<java.io.Serializable> serializableSet13 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList14 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet13);
        java.util.SortedSet<java.io.Serializable> serializableSet15 = java.util.Collections.unmodifiableSortedSet(serializableSet13);
        java.util.TreeSet<java.io.Serializable> serializableSet16 = new java.util.TreeSet<java.io.Serializable>(serializableSet15);
        java.io.Serializable serializable17 = serializableSet16.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator18 = serializableSet16.comparator();
        java.util.NavigableSet<java.io.Serializable> serializableSet19 = java.util.Collections.unmodifiableNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet16);
        java.util.stream.Stream[][] streamArray20 = new java.util.stream.Stream[][] {};
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet16, streamArray20);
        boolean boolean22 = strSet1.contains((java.lang.Object) boolean21);
        java.util.Spliterator<java.lang.String> strSpliterator23 = strSet1.spliterator();
        java.util.Collection<java.io.Serializable> serializableCollection24 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = strSet1.removeAll(serializableCollection24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet3);
        org.junit.Assert.assertNotNull(serializableIterableList4);
        org.junit.Assert.assertNotNull(serializableSet5);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(serializableSet13);
        org.junit.Assert.assertNotNull(serializableIterableList14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNull(serializable17);
        org.junit.Assert.assertNull(wildcardComparator18);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNotNull(streamArray20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strSpliterator23);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.util.Collection<java.io.Serializable> serializableCollection2 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList1);
        java.util.SortedSet<java.io.Serializable> serializableSet3 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList4 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet5 = java.util.Collections.unmodifiableSortedSet(serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet6 = new java.util.TreeSet<java.io.Serializable>(serializableSet5);
        boolean boolean8 = serializableSet6.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator9 = serializableSet6.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        java.io.Serializable serializable14 = serializableSet13.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet16 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet18 = serializableSet13.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = serializableSet13.headSet((java.io.Serializable) (short) 0);
        int int21 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableSet6, (java.lang.Object) serializableSet20);
        java.util.Set<java.io.Serializable> serializableSet22 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet6);
        boolean boolean23 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableList1, (java.util.Collection<java.io.Serializable>) serializableSet6);
        int int24 = serializableSet6.size();
        org.junit.Assert.assertNotNull(serializableCollection2);
        org.junit.Assert.assertNotNull(serializableSet3);
        org.junit.Assert.assertNotNull(serializableIterableList4);
        org.junit.Assert.assertNotNull(serializableSet5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(wildcardComparator9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertNull(serializable14);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(serializableSet22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>(100);
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "hi!" };
        java.lang.Comparable<java.lang.String>[] strComparableArray6 = serializableList1.toArray((java.lang.Comparable<java.lang.String>[]) strArray5);
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableList1.iterator();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList9 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet8);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.unmodifiableSortedSet(serializableSet8);
        java.util.TreeSet<java.io.Serializable> serializableSet11 = new java.util.TreeSet<java.io.Serializable>(serializableSet10);
        java.util.HashSet<java.lang.String> strSet13 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj14 = strSet13.clone();
        java.io.Serializable serializable15 = serializableSet11.lower((java.io.Serializable) strSet13);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        boolean boolean22 = strSet19.equals((java.lang.Object) false);
        boolean boolean23 = strSet19.isEmpty();
        boolean boolean25 = strSet19.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet26 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList27 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet26);
        java.util.SortedSet<java.io.Serializable> serializableSet28 = java.util.Collections.unmodifiableSortedSet(serializableSet26);
        java.util.TreeSet<java.io.Serializable> serializableSet29 = new java.util.TreeSet<java.io.Serializable>(serializableSet28);
        boolean boolean31 = serializableSet29.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator32 = serializableSet29.comparator();
        boolean boolean33 = strSet19.remove((java.lang.Object) serializableSet29);
        boolean boolean34 = strSet13.remove((java.lang.Object) serializableSet29);
        java.util.NavigableSet<java.io.Serializable> serializableSet35 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet29);
        boolean boolean36 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableList1, (java.util.Collection<java.io.Serializable>) serializableSet29);
        java.lang.String str37 = serializableList1.toString();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strComparableArray6);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableIterableList9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(obj14);
        org.junit.Assert.assertEquals(obj14.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj14), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj14), "[]");
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(serializableSet26);
        org.junit.Assert.assertNotNull(serializableIterableList27);
        org.junit.Assert.assertNotNull(serializableSet28);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(wildcardComparator32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(serializableSet35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "[]" + "'", str37, "[]");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.HashSet<java.lang.String> strSet7 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj8 = null;
        boolean boolean9 = strSet7.contains(obj8);
        java.lang.Object obj10 = strSet7.clone();
        boolean boolean12 = strSet7.add("");
        java.io.Serializable serializable13 = serializableSet3.higher((java.io.Serializable) strSet7);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(obj10);
        org.junit.Assert.assertEquals(obj10.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj10), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj10), "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNull(serializable13);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        java.util.ArrayList<java.lang.String> strList0 = new java.util.ArrayList<java.lang.String>();
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        boolean boolean5 = serializableSet3.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator6 = serializableSet3.comparator();
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = serializableSet10.headSet((java.io.Serializable) (short) 0);
        int int18 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableSet3, (java.lang.Object) serializableSet17);
        java.util.Set<java.io.Serializable> serializableSet19 = java.util.Collections.synchronizedSet((java.util.Set<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream20 = serializableSet3.stream();
        java.util.HashSet<java.lang.String> strSet22 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.util.NavigableSet<java.io.Serializable> serializableSet24 = serializableSet3.tailSet((java.io.Serializable) (byte) 100, false);
        java.io.Serializable serializable25 = serializableSet3.pollFirst();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardComparator6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNotNull(serializableStream20);
        org.junit.Assert.assertNotNull(serializableSet24);
        org.junit.Assert.assertNull(serializable25);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.io.Serializable serializable7 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet9 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.io.Serializable serializable10 = serializableSet3.pollLast();
        int int11 = serializableSet3.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.io.Serializable serializable8 = serializableSet3.pollFirst();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList10 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet9);
        java.util.SortedSet<java.io.Serializable> serializableSet11 = java.util.Collections.unmodifiableSortedSet(serializableSet9);
        java.util.TreeSet<java.io.Serializable> serializableSet12 = new java.util.TreeSet<java.io.Serializable>(serializableSet11);
        boolean boolean14 = serializableSet12.remove((java.lang.Object) (-1.0f));
        java.io.Serializable serializable15 = serializableSet12.pollLast();
        boolean boolean16 = serializableSet3.containsAll((java.util.Collection<java.io.Serializable>) serializableSet12);
        java.lang.Object[][] objArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableSet12, objArray17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(serializable8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNotNull(serializableIterableList10);
        org.junit.Assert.assertNotNull(serializableSet11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        serializableSet3.clear();
        java.util.Iterator<java.io.Serializable> serializableItor7 = serializableSet3.descendingIterator();
        java.io.Serializable[] serializableArray59 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList60, serializableArray59);
        java.util.Collection<java.io.Serializable> serializableCollection62 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList60);
        java.io.Serializable[] serializableArray87 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList60, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList88 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList88, serializableArray87);
        serializableList88.ensureCapacity(100);
        java.lang.Object[] objArray92 = serializableList88.toArray();
        boolean boolean94 = serializableList88.remove((java.lang.Object) (byte) 0);
        java.io.Serializable serializable95 = serializableSet3.higher((java.io.Serializable) (byte) 0);
        java.lang.Object obj96 = serializableSet3.clone();
        java.util.NavigableSet<java.io.Serializable> serializableSet97 = serializableSet3.descendingSet();
        java.util.TreeSet<java.io.Serializable> serializableSet98 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable serializable99 = serializableSet98.last();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableItor7);
        org.junit.Assert.assertNotNull(serializableArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(serializableCollection62);
        org.junit.Assert.assertNotNull(serializableArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[1, 0, 0, -1, hi!, 100.0, 0, , -1, 1, #, 1, 0, 10.0, [10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1], false, -1.0, #, hi!, -1, 10.0, 100, hi!, 100, 10, 1, 1, 1, 100, 100, 0.0, 4, 0.0, 10, 0, 100, -1, 0.0, 10.0]");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + true + "'", boolean94 == true);
        org.junit.Assert.assertNull(serializable95);
        org.junit.Assert.assertNotNull(obj96);
        org.junit.Assert.assertEquals(obj96.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj96), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj96), "[]");
        org.junit.Assert.assertNotNull(serializableSet97);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        java.util.Collection<java.io.Serializable> serializableCollection0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration<java.io.Serializable> serializableEnumeration1 = java.util.Collections.enumeration(serializableCollection0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.util.TreeSet<java.io.Serializable> serializableSet8 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        serializableSet8.clear();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        java.util.SortedMap<java.util.Comparator<java.lang.CharSequence>, java.util.ListIterator<java.io.Serializable>> charSequenceComparatorMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(charSequenceComparatorMap0);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        boolean boolean6 = serializableSet3.isEmpty();
        serializableSet3.clear();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator8 = serializableSet3.spliterator();
        java.io.Serializable serializable9 = serializableSet3.pollLast();
        java.util.NavigableSet<java.io.Serializable> serializableSet10 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet3);
        java.util.stream.Stream<java.io.Serializable> serializableStream11 = serializableSet3.parallelStream();
        java.io.Serializable serializable12 = serializableSet3.pollFirst();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableSpliterator8);
        org.junit.Assert.assertNull(serializable9);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableStream11);
        org.junit.Assert.assertNull(serializable12);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        java.util.HashSet<java.util.RandomAccess> randomAccessSet2 = new java.util.HashSet<java.util.RandomAccess>(1, (float) 34);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.io.Serializable serializable7 = serializableSet3.pollFirst();
        java.util.NavigableSet<java.io.Serializable> serializableSet8 = serializableSet3.descendingSet();
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertNotNull(serializableSet9);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        java.util.ArrayList<java.util.AbstractCollection<java.io.Serializable>> serializableCollectionList1 = new java.util.ArrayList<java.util.AbstractCollection<java.io.Serializable>>(0);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.ArrayList<java.io.Serializable> serializableList4 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet2);
        java.util.TreeSet<java.lang.String> strSet5 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.io.Serializable> serializableSet6 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList7 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet6);
        java.util.SortedSet<java.io.Serializable> serializableSet8 = java.util.Collections.unmodifiableSortedSet(serializableSet6);
        boolean boolean9 = strSet5.removeAll((java.util.Collection<java.io.Serializable>) serializableSet8);
        java.util.ArrayList<java.io.Serializable> serializableList10 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableSet8);
        java.util.Collections.copy((java.util.List<java.io.Serializable>) serializableList4, (java.util.List<java.io.Serializable>) serializableList10);
        serializableList4.trimToSize();
        java.util.HashSet<java.lang.String> strSet15 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        strSet15.clear();
        java.util.Spliterator<java.lang.String> strSpliterator17 = strSet15.spliterator();
        boolean boolean19 = strSet15.add("hi!");
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList21 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet20);
        java.util.SortedSet<java.io.Serializable> serializableSet22 = java.util.Collections.unmodifiableSortedSet(serializableSet20);
        java.util.TreeSet<java.io.Serializable> serializableSet23 = new java.util.TreeSet<java.io.Serializable>(serializableSet22);
        java.io.Serializable serializable24 = serializableSet23.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator25 = serializableSet23.comparator();
        serializableSet23.clear();
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableSet23.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet28 = serializableSet23.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection29 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet23);
        java.util.SortedSet<java.io.Serializable> serializableSet30 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList31 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet30);
        java.util.SortedSet<java.io.Serializable> serializableSet32 = java.util.Collections.unmodifiableSortedSet(serializableSet30);
        java.util.TreeSet<java.io.Serializable> serializableSet33 = new java.util.TreeSet<java.io.Serializable>(serializableSet32);
        java.io.Serializable serializable34 = serializableSet33.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator35 = serializableSet33.comparator();
        int int36 = serializableSet33.size();
        java.io.Serializable serializable37 = serializableSet23.lower((java.io.Serializable) int36);
        boolean boolean38 = strSet15.removeAll((java.util.Collection<java.io.Serializable>) serializableSet23);
        serializableList4.add((int) (byte) 0, (java.io.Serializable) serializableSet23);
        boolean boolean40 = serializableList4.isEmpty();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableSet6);
        org.junit.Assert.assertNotNull(serializableIterableList7);
        org.junit.Assert.assertNotNull(serializableSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertNotNull(serializableIterableList21);
        org.junit.Assert.assertNotNull(serializableSet22);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertNull(wildcardComparator25);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(serializableSet28);
        org.junit.Assert.assertNotNull(serializableCollection29);
        org.junit.Assert.assertNotNull(serializableSet30);
        org.junit.Assert.assertNotNull(serializableIterableList31);
        org.junit.Assert.assertNotNull(serializableSet32);
        org.junit.Assert.assertNull(serializable34);
        org.junit.Assert.assertNull(wildcardComparator35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNull(serializable37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.lang.String str6 = serializableSet3.toString();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 1);
        boolean boolean2 = strSet1.isEmpty();
        java.util.Iterator<java.lang.String> strItor3 = strSet1.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strItor3);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet46 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        boolean boolean49 = strSet46.equals((java.lang.Object) false);
        int int50 = strSet46.size();
        java.io.Serializable serializable51 = serializableList38.set((int) '#', (java.io.Serializable) strSet46);
        java.util.Collections.rotate((java.util.List<java.io.Serializable>) serializableList38, (int) (byte) 1);
        java.util.Collections.rotate((java.util.List<java.io.Serializable>) serializableList38, (int) (byte) 1);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
        org.junit.Assert.assertEquals("'" + serializable51 + "' != '" + (byte) -1 + "'", serializable51, (byte) -1);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        serializableList51.ensureCapacity((int) (short) -1);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator58 = serializableList51.spliterator();
        java.util.List<java.io.Serializable> serializableList61 = serializableList51.subList((int) (short) 1, 2);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator58);
        org.junit.Assert.assertNotNull(serializableList61);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        java.util.Enumeration<java.io.Serializable> serializableEnumeration6 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator16 = serializableSet10.spliterator();
        boolean boolean17 = serializableSet3.addAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.synchronizedSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet3);
        java.io.Serializable serializable19 = serializableSet3.pollFirst();
        java.lang.Object obj20 = serializableSet3.clone();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertNotNull(serializableEnumeration6);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNull(serializable19);
        org.junit.Assert.assertNotNull(obj20);
        org.junit.Assert.assertEquals(obj20.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "[]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        serializableList80.trimToSize();
        java.util.List<java.util.AbstractCollection<java.io.Serializable>> serializableCollectionList85 = java.util.Collections.singletonList((java.util.AbstractCollection<java.io.Serializable>) serializableList80);
        java.io.Serializable serializable87 = serializableList80.remove((int) (byte) 0);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableCollectionList85);
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + (byte) 1 + "'", serializable87, (byte) 1);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        java.util.SortedMap<java.util.stream.Stream[], java.util.stream.Stream[][]> streamArrayMap0 = java.util.Collections.emptySortedMap();
        org.junit.Assert.assertNotNull(streamArrayMap0);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        boolean boolean9 = strSet3.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet10 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList11 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet12 = java.util.Collections.unmodifiableSortedSet(serializableSet10);
        java.util.TreeSet<java.io.Serializable> serializableSet13 = new java.util.TreeSet<java.io.Serializable>(serializableSet12);
        boolean boolean15 = serializableSet13.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator16 = serializableSet13.comparator();
        boolean boolean17 = strSet3.remove((java.lang.Object) serializableSet13);
        boolean boolean18 = strSet3.isEmpty();
        java.util.Map<java.util.AbstractCollection<java.io.Serializable>, java.lang.CharSequence> serializableCollectionMap19 = java.util.Collections.emptyMap();
        boolean boolean20 = strSet3.remove((java.lang.Object) serializableCollectionMap19);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableSet10);
        org.junit.Assert.assertNotNull(serializableIterableList11);
        org.junit.Assert.assertNotNull(serializableSet12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardComparator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(serializableCollectionMap19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj2 = null;
        boolean boolean3 = strSet1.contains(obj2);
        boolean boolean5 = strSet1.add("[]");
        boolean boolean6 = strSet1.isEmpty();
        boolean boolean7 = strSet1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        java.io.Serializable[] serializableArray40 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList41 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList41, serializableArray40);
        java.util.Collection<java.io.Serializable> serializableCollection43 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList41);
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] { 'a', 10, 100, serializableList41, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList51 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList51, serializableArray50);
        boolean boolean55 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList51, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        serializableList51.ensureCapacity((int) (short) -1);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator58 = serializableList51.spliterator();
        java.util.Spliterator<java.io.Serializable> serializableSpliterator59 = serializableList51.spliterator();
        java.util.ArrayList<java.io.Serializable> serializableList60 = new java.util.ArrayList<java.io.Serializable>((java.util.Collection<java.io.Serializable>) serializableList51);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(serializableCollection43);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(serializableSpliterator58);
        org.junit.Assert.assertNotNull(serializableSpliterator59);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList52 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList52, serializableArray51);
        java.util.Collection<java.io.Serializable> serializableCollection54 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList52);
        java.io.Serializable[] serializableArray79 = new java.io.Serializable[] { (byte) 1, (byte) 0, (byte) 0, (short) -1, "hi!", 100.0d, 0L, "", (-1L), (byte) 1, '#', 1L, 0L, 10.0d, serializableList52, false, (-1.0d), '#', "hi!", (short) -1, 10.0f, 100, "hi!", 100L, (byte) 10, (byte) 1, 1L, (byte) 1, 100L, (byte) 100, 0.0d, '4', 0.0d, (byte) 10, (byte) 0, 100, (short) -1, 0.0f, 10.0f };
        java.util.ArrayList<java.io.Serializable> serializableList80 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList80, serializableArray79);
        serializableList80.ensureCapacity(100);
        java.util.stream.Stream<java.io.Serializable> serializableStream84 = serializableList80.stream();
        boolean boolean85 = serializableList80.isEmpty();
        java.util.Collection<java.io.Serializable> serializableCollection86 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList80);
        java.util.Map map87 = java.util.Collections.EMPTY_MAP;
        int int88 = serializableList80.lastIndexOf((java.lang.Object) map87);
        java.util.function.UnaryOperator<java.io.Serializable> serializableUnaryOperator89 = null;
        // The following exception was thrown during execution in test generation
        try {
            serializableList80.replaceAll(serializableUnaryOperator89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(serializableCollection54);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(serializableStream84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(serializableCollection86);
        org.junit.Assert.assertNotNull(map87);
        org.junit.Assert.assertTrue("'" + int88 + "' != '" + (-1) + "'", int88 == (-1));
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        java.util.Spliterator<java.io.Serializable> serializableSpliterator0 = null;
        java.util.HashSet<java.lang.String> strSet2 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        strSet2.clear();
        java.util.Spliterator<java.lang.String> strSpliterator4 = strSet2.spliterator();
        boolean boolean6 = strSet2.add("hi!");
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator12 = serializableSet10.comparator();
        serializableSet10.clear();
        java.util.Iterator<java.io.Serializable> serializableItor14 = serializableSet10.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection16 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList18 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet17);
        java.util.SortedSet<java.io.Serializable> serializableSet19 = java.util.Collections.unmodifiableSortedSet(serializableSet17);
        java.util.TreeSet<java.io.Serializable> serializableSet20 = new java.util.TreeSet<java.io.Serializable>(serializableSet19);
        java.io.Serializable serializable21 = serializableSet20.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator22 = serializableSet20.comparator();
        int int23 = serializableSet20.size();
        java.io.Serializable serializable24 = serializableSet10.lower((java.io.Serializable) int23);
        boolean boolean25 = strSet2.removeAll((java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.Map<java.util.Spliterator<java.io.Serializable>, java.util.AbstractSet<java.lang.String>> serializableSpliteratorMap26 = java.util.Collections.singletonMap(serializableSpliterator0, (java.util.AbstractSet<java.lang.String>) strSet2);
        org.junit.Assert.assertNotNull(strSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNull(wildcardComparator12);
        org.junit.Assert.assertNotNull(serializableItor14);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertNotNull(serializableCollection16);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNotNull(serializableIterableList18);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNull(wildcardComparator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNull(serializable24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(serializableSpliteratorMap26);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        boolean boolean14 = strSet11.equals((java.lang.Object) false);
        boolean boolean15 = strSet11.isEmpty();
        boolean boolean17 = strSet11.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList19 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet18);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet(serializableSet18);
        java.util.TreeSet<java.io.Serializable> serializableSet21 = new java.util.TreeSet<java.io.Serializable>(serializableSet20);
        boolean boolean23 = serializableSet21.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator24 = serializableSet21.comparator();
        boolean boolean25 = strSet11.remove((java.lang.Object) serializableSet21);
        boolean boolean26 = strSet5.remove((java.lang.Object) serializableSet21);
        java.util.NavigableSet<java.io.Serializable> serializableSet27 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet21);
        java.util.NavigableSet<java.io.Serializable> serializableSet28 = serializableSet21.descendingSet();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNotNull(serializableIterableList19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardComparator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertNotNull(serializableSet28);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        boolean boolean14 = strSet11.equals((java.lang.Object) false);
        boolean boolean15 = strSet11.isEmpty();
        boolean boolean17 = strSet11.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList19 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet18);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet(serializableSet18);
        java.util.TreeSet<java.io.Serializable> serializableSet21 = new java.util.TreeSet<java.io.Serializable>(serializableSet20);
        boolean boolean23 = serializableSet21.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator24 = serializableSet21.comparator();
        boolean boolean25 = strSet11.remove((java.lang.Object) serializableSet21);
        boolean boolean26 = strSet5.remove((java.lang.Object) serializableSet21);
        java.util.NavigableSet<java.io.Serializable> serializableSet27 = java.util.Collections.synchronizedNavigableSet((java.util.NavigableSet<java.io.Serializable>) serializableSet21);
        java.util.stream.Stream<java.io.Serializable> serializableStream28 = serializableSet21.parallelStream();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNotNull(serializableIterableList19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardComparator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableSet27);
        org.junit.Assert.assertNotNull(serializableStream28);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        boolean boolean7 = strSet3.isEmpty();
        strSet3.clear();
        strSet3.clear();
        java.io.Serializable[] serializableArray47 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList48 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList48, serializableArray47);
        java.util.Collection<java.io.Serializable> serializableCollection50 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList48);
        java.lang.Object obj51 = serializableList48.clone();
        java.util.Iterator<java.io.Serializable> serializableItor52 = serializableList48.iterator();
        java.util.ArrayList<java.util.Enumeration<java.util.HashSet<java.lang.String>>> strSetEnumerationList54 = new java.util.ArrayList<java.util.Enumeration<java.util.HashSet<java.lang.String>>>((int) (short) 100);
        boolean boolean55 = serializableList48.equals((java.lang.Object) strSetEnumerationList54);
        boolean boolean56 = strSet3.remove((java.lang.Object) boolean55);
        boolean boolean57 = strSet3.isEmpty();
        int int58 = strSet3.size();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(serializableArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(serializableCollection50);
        org.junit.Assert.assertNotNull(obj51);
        org.junit.Assert.assertEquals(obj51.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj51), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj51), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableItor52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        java.util.ArrayList<java.io.Serializable> serializableList1 = new java.util.ArrayList<java.io.Serializable>((int) (short) 10);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.util.HashSet<java.lang.String> strSet5 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj6 = strSet5.clone();
        java.io.Serializable serializable7 = serializableSet3.lower((java.io.Serializable) strSet5);
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet11, strArray10);
        boolean boolean14 = strSet11.equals((java.lang.Object) false);
        boolean boolean15 = strSet11.isEmpty();
        boolean boolean17 = strSet11.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet18 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList19 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet18);
        java.util.SortedSet<java.io.Serializable> serializableSet20 = java.util.Collections.unmodifiableSortedSet(serializableSet18);
        java.util.TreeSet<java.io.Serializable> serializableSet21 = new java.util.TreeSet<java.io.Serializable>(serializableSet20);
        boolean boolean23 = serializableSet21.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator24 = serializableSet21.comparator();
        boolean boolean25 = strSet11.remove((java.lang.Object) serializableSet21);
        boolean boolean26 = strSet5.remove((java.lang.Object) serializableSet21);
        java.util.Iterator<java.io.Serializable> serializableItor27 = serializableSet21.iterator();
        java.io.Serializable[] serializableArray68 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList69 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList69, serializableArray68);
        java.util.Collection<java.io.Serializable> serializableCollection71 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList69);
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] { 'a', 10, 100, serializableList69, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList79 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList79, serializableArray78);
        boolean boolean83 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList79, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        serializableList79.ensureCapacity((int) (short) -1);
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList79);
        java.io.Serializable serializable87 = serializableSet21.floor((java.io.Serializable) serializableList79);
        java.util.NavigableSet<java.io.Serializable> serializableSet88 = serializableSet21.descendingSet();
        int int89 = serializableSet21.size();
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "[]");
        org.junit.Assert.assertNull(serializable7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(serializableSet18);
        org.junit.Assert.assertNotNull(serializableIterableList19);
        org.junit.Assert.assertNotNull(serializableSet20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(wildcardComparator24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(serializableItor27);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(serializableCollection71);
        org.junit.Assert.assertNotNull(serializableArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNull(serializable87);
        org.junit.Assert.assertNotNull(serializableSet88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 0 + "'", int89 == 0);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.SortedSet<java.io.Serializable> serializableSet1 = java.util.Collections.synchronizedSortedSet(serializableSet0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (short) 1);
        java.lang.Object obj2 = strSet1.clone();
        java.util.SortedSet<java.io.Serializable> serializableSet3 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList4 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet3);
        java.util.SortedSet<java.io.Serializable> serializableSet5 = java.util.Collections.unmodifiableSortedSet(serializableSet3);
        java.util.TreeSet<java.io.Serializable> serializableSet6 = new java.util.TreeSet<java.io.Serializable>(serializableSet5);
        java.util.HashSet<java.lang.String> strSet8 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.lang.Object obj9 = strSet8.clone();
        java.io.Serializable serializable10 = serializableSet6.lower((java.io.Serializable) strSet8);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet14 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        boolean boolean17 = strSet14.equals((java.lang.Object) false);
        boolean boolean18 = strSet14.isEmpty();
        boolean boolean20 = strSet14.equals((java.lang.Object) 10L);
        java.util.SortedSet<java.io.Serializable> serializableSet21 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList22 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet21);
        java.util.SortedSet<java.io.Serializable> serializableSet23 = java.util.Collections.unmodifiableSortedSet(serializableSet21);
        java.util.TreeSet<java.io.Serializable> serializableSet24 = new java.util.TreeSet<java.io.Serializable>(serializableSet23);
        boolean boolean26 = serializableSet24.remove((java.lang.Object) (-1.0f));
        java.util.Comparator<? super java.io.Serializable> wildcardComparator27 = serializableSet24.comparator();
        boolean boolean28 = strSet14.remove((java.lang.Object) serializableSet24);
        boolean boolean29 = strSet8.remove((java.lang.Object) serializableSet24);
        java.util.Iterator<java.io.Serializable> serializableItor30 = serializableSet24.iterator();
        java.io.Serializable[] serializableArray71 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList72 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList72, serializableArray71);
        java.util.Collection<java.io.Serializable> serializableCollection74 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList72);
        java.io.Serializable[] serializableArray81 = new java.io.Serializable[] { 'a', 10, 100, serializableList72, 100L, (short) 0, true, (byte) 1, ' ', false };
        java.util.ArrayList<java.io.Serializable> serializableList82 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList82, serializableArray81);
        boolean boolean86 = java.util.Collections.replaceAll((java.util.List<java.io.Serializable>) serializableList82, (java.io.Serializable) 100.0d, (java.io.Serializable) 0.0d);
        serializableList82.ensureCapacity((int) (short) -1);
        java.util.Collections.reverse((java.util.List<java.io.Serializable>) serializableList82);
        java.io.Serializable serializable90 = serializableSet24.floor((java.io.Serializable) serializableList82);
        java.util.NavigableSet<java.io.Serializable> serializableSet91 = serializableSet24.descendingSet();
        boolean boolean92 = strSet1.remove((java.lang.Object) serializableSet24);
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "[]");
        org.junit.Assert.assertNotNull(serializableSet3);
        org.junit.Assert.assertNotNull(serializableIterableList4);
        org.junit.Assert.assertNotNull(serializableSet5);
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "[]");
        org.junit.Assert.assertNull(serializable10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(serializableSet21);
        org.junit.Assert.assertNotNull(serializableIterableList22);
        org.junit.Assert.assertNotNull(serializableSet23);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(wildcardComparator27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(serializableItor30);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(serializableCollection74);
        org.junit.Assert.assertNotNull(serializableArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(serializable90);
        org.junit.Assert.assertNotNull(serializableSet91);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        java.io.Serializable[] serializableArray37 = new java.io.Serializable[] { (byte) 10, 1, (byte) 1, (-1.0d), 100.0d, (short) 100, 10.0f, 1L, 100, (-1.0f), ' ', ' ', 0.0d, ' ', 1, 'a', 1.0d, 100.0f, '#', 10.0f, (byte) -1, (byte) 1, (short) 0, 10L, (byte) 10, (-1L), 10L, (byte) -1, 'a', 10L, 10L, "hi!", 1.0d, ' ', false, (byte) -1, (short) 1 };
        java.util.ArrayList<java.io.Serializable> serializableList38 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList38, serializableArray37);
        java.util.Collection<java.io.Serializable> serializableCollection40 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList38);
        java.lang.Object[] objArray41 = serializableList38.toArray();
        java.lang.Object obj42 = serializableList38.clone();
        java.util.List<java.io.Serializable> serializableList45 = serializableList38.subList(0, 34);
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator46 = null;
        java.util.Comparator<java.lang.CharSequence> charSequenceComparator47 = java.util.Collections.reverseOrder(charSequenceComparator46);
        boolean boolean48 = serializableList38.remove((java.lang.Object) charSequenceComparator47);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(serializableCollection40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray41), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(obj42);
        org.junit.Assert.assertEquals(obj42.toString(), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj42), "[10, 1, 1, -1.0, 100.0, 100, 10.0, 1, 100, -1.0,  ,  , 0.0,  , 1, a, 1.0, 100.0, #, 10.0, -1, 1, 0, 10, 10, -1, 10, -1, a, 10, 10, hi!, 1.0,  , false, -1, 1]");
        org.junit.Assert.assertNotNull(serializableList45);
        org.junit.Assert.assertNotNull(charSequenceComparator47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        java.util.SortedSet<java.io.Serializable> serializableSet0 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList1 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet0);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.unmodifiableSortedSet(serializableSet0);
        java.util.TreeSet<java.io.Serializable> serializableSet3 = new java.util.TreeSet<java.io.Serializable>(serializableSet2);
        java.io.Serializable serializable4 = serializableSet3.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator5 = serializableSet3.comparator();
        int int6 = serializableSet3.size();
        java.util.SortedSet<java.io.Serializable> serializableSet7 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList8 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet7);
        java.util.SortedSet<java.io.Serializable> serializableSet9 = java.util.Collections.unmodifiableSortedSet(serializableSet7);
        java.util.TreeSet<java.io.Serializable> serializableSet10 = new java.util.TreeSet<java.io.Serializable>(serializableSet9);
        java.io.Serializable serializable11 = serializableSet10.pollFirst();
        java.util.HashSet<java.util.ListIterator<java.io.Serializable>> serializableItorSet13 = new java.util.HashSet<java.util.ListIterator<java.io.Serializable>>((int) '4');
        java.util.NavigableSet<java.io.Serializable> serializableSet15 = serializableSet10.tailSet((java.io.Serializable) '4', true);
        boolean boolean16 = java.util.Collections.disjoint((java.util.Collection<java.io.Serializable>) serializableSet3, (java.util.Collection<java.io.Serializable>) serializableSet10);
        java.util.SortedSet<java.io.Serializable> serializableSet17 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList18 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet17);
        java.util.SortedSet<java.io.Serializable> serializableSet19 = java.util.Collections.unmodifiableSortedSet(serializableSet17);
        java.util.TreeSet<java.io.Serializable> serializableSet20 = new java.util.TreeSet<java.io.Serializable>(serializableSet19);
        java.io.Serializable serializable21 = serializableSet20.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator22 = serializableSet20.comparator();
        serializableSet20.clear();
        java.util.Iterator<java.io.Serializable> serializableItor24 = serializableSet20.descendingIterator();
        java.util.NavigableSet<java.io.Serializable> serializableSet25 = serializableSet20.descendingSet();
        java.util.Collection<java.io.Serializable> serializableCollection26 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableSet20);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator27 = serializableSet20.spliterator();
        java.util.TreeSet<java.io.Serializable> serializableSet28 = new java.util.TreeSet<java.io.Serializable>((java.util.SortedSet<java.io.Serializable>) serializableSet20);
        int int29 = java.util.Collections.frequency((java.util.Collection<java.io.Serializable>) serializableSet10, (java.lang.Object) serializableSet20);
        org.junit.Assert.assertNotNull(serializableSet0);
        org.junit.Assert.assertNotNull(serializableIterableList1);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNull(serializable4);
        org.junit.Assert.assertNull(wildcardComparator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(serializableSet7);
        org.junit.Assert.assertNotNull(serializableIterableList8);
        org.junit.Assert.assertNotNull(serializableSet9);
        org.junit.Assert.assertNull(serializable11);
        org.junit.Assert.assertNotNull(serializableSet15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(serializableSet17);
        org.junit.Assert.assertNotNull(serializableIterableList18);
        org.junit.Assert.assertNotNull(serializableSet19);
        org.junit.Assert.assertNull(serializable21);
        org.junit.Assert.assertNull(wildcardComparator22);
        org.junit.Assert.assertNotNull(serializableItor24);
        org.junit.Assert.assertNotNull(serializableSet25);
        org.junit.Assert.assertNotNull(serializableCollection26);
        org.junit.Assert.assertNotNull(serializableSpliterator27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        java.util.Comparator<java.lang.Object[]> objArrayComparator0 = java.util.Collections.reverseOrder();
        org.junit.Assert.assertNotNull(objArrayComparator0);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet3 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet3, strArray2);
        boolean boolean6 = strSet3.equals((java.lang.Object) false);
        java.io.Serializable[] serializableArray42 = new java.io.Serializable[] { false, (-1), 'a', (-1.0f), "hi!", '#', '4', '4', '#', (byte) 10, 100, 1.0f, (byte) -1, (short) 0, '4', (-1.0d), (-1.0d), 'a', 'a', (short) 10, "hi!", (byte) -1, 0.0d, 1.0f, (-1.0d), 0.0d, 100L, 10.0f, '4', 1L, (-1), (-1L), 100, 0L, true };
        java.util.ArrayList<java.io.Serializable> serializableList43 = new java.util.ArrayList<java.io.Serializable>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.io.Serializable>) serializableList43, serializableArray42);
        java.lang.Object obj45 = null;
        boolean boolean46 = serializableList43.equals(obj45);
        java.util.Collection<java.io.Serializable> serializableCollection47 = java.util.Collections.synchronizedCollection((java.util.Collection<java.io.Serializable>) serializableList43);
        boolean boolean48 = strSet3.contains((java.lang.Object) serializableList43);
        java.io.Serializable serializable50 = serializableList43.get((int) (byte) 10);
        java.util.Set<java.util.Collection<java.io.Serializable>> serializableCollectionSet51 = java.util.Collections.singleton((java.util.Collection<java.io.Serializable>) serializableList43);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections.swap((java.util.List<java.io.Serializable>) serializableList43, (int) (short) -1, 37);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index -1 out of bounds for length 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(serializableArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(serializableCollection47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + serializable50 + "' != '" + 100 + "'", serializable50, 100);
        org.junit.Assert.assertNotNull(serializableCollectionSet51);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        java.util.SortedSet<java.io.Serializable> serializableSet2 = java.util.Collections.emptySortedSet();
        java.util.List<java.lang.Iterable<java.io.Serializable>> serializableIterableList3 = java.util.Collections.singletonList((java.lang.Iterable<java.io.Serializable>) serializableSet2);
        java.util.SortedSet<java.io.Serializable> serializableSet4 = java.util.Collections.unmodifiableSortedSet(serializableSet2);
        java.util.TreeSet<java.io.Serializable> serializableSet5 = new java.util.TreeSet<java.io.Serializable>(serializableSet4);
        java.io.Serializable serializable6 = serializableSet5.pollFirst();
        java.util.Comparator<? super java.io.Serializable> wildcardComparator7 = serializableSet5.comparator();
        int int8 = serializableSet5.size();
        boolean boolean9 = strSet1.remove((java.lang.Object) serializableSet5);
        java.util.Enumeration<java.io.Serializable> serializableEnumeration10 = java.util.Collections.enumeration((java.util.Collection<java.io.Serializable>) serializableSet5);
        java.util.Spliterator<java.io.Serializable> serializableSpliterator11 = serializableSet5.spliterator();
        java.util.HashSet<java.lang.String> strSet13 = new java.util.HashSet<java.lang.String>(34);
        int int14 = strSet13.size();
        java.io.Serializable serializable15 = serializableSet5.ceiling((java.io.Serializable) int14);
        java.util.SortedSet<java.io.Serializable> serializableSet16 = java.util.Collections.unmodifiableSortedSet((java.util.SortedSet<java.io.Serializable>) serializableSet5);
        org.junit.Assert.assertNotNull(serializableSet2);
        org.junit.Assert.assertNotNull(serializableIterableList3);
        org.junit.Assert.assertNotNull(serializableSet4);
        org.junit.Assert.assertNull(serializable6);
        org.junit.Assert.assertNull(wildcardComparator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(serializableEnumeration10);
        org.junit.Assert.assertNotNull(serializableSpliterator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNull(serializable15);
        org.junit.Assert.assertNotNull(serializableSet16);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        java.util.HashSet<java.lang.String> strSet1 = new java.util.HashSet<java.lang.String>((int) (byte) 100);
        strSet1.clear();
        int int3 = strSet1.size();
        java.lang.Object obj4 = strSet1.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "[]");
    }
}

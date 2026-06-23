import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ValidationUtilsRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0001");
        java.lang.String str2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull("hi!", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0002");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (-1), 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between -1 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0003");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.Object[] objArray5 = new java.lang.Object[] { "hi!", 1.0d, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray6 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray0, "hi!", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[hi!, 1.0,  ]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[hi!, 1.0,  ]");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0004");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0005");
        dev.langchain4j.internal.ValidationUtils.ensureTrue(true, "hi!");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0006");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) '4', (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0007");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0008");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) ' ', (double) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 32.0 and 1.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0009");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureTrue(false, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0010");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (short) -1, (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between -1 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0011");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 100L, (long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 35, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0012");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) 10, (double) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10.0 and 1.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0013");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray3 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object obj8 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray7);
        java.lang.Object[][] objArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray3, "hi!", objArray7);
        java.lang.constant.Constable[] constableArray14 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray14, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) (byte) 10, (java.lang.Object) objArray9, "", (java.lang.Object[]) constableArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(constableArray14);
        org.junit.Assert.assertNotNull(constableArray16);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0014");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) '#', (double) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 35.0 and -1.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0015");
        double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 10.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0016");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 100, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0017");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) 0.0f, (java.lang.Object) 'a', "", (java.lang.Object[]) charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0018");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) (byte) 100, (double) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100.0 and -1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0019");
        java.io.Serializable serializable2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable) '#', "hi!");
        org.junit.Assert.assertEquals("'" + serializable2 + "' != '" + '#' + "'", serializable2, '#');
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0020");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZeroIfNotNull((java.lang.Integer) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be greater than zero, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0021");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) 'a', (int) (short) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 97 and 100, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0022");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray18, "");
        java.lang.Class<?> wildcardClass21 = charSequenceArray18.getClass();
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray26, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constantDescArray14, (java.lang.Object) charSequenceArray18, "hi!", (java.lang.Object[]) charSequenceArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray28);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0023");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) (-1L), (double) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0024");
        dev.langchain4j.internal.ValidationUtils.ensureTrue(true, "");
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0025");
        double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 1.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0026");
        java.lang.constant.ConstantDesc constantDesc2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) 0, "");
        org.junit.Assert.assertEquals("'" + constantDesc2 + "' != '" + 0 + "'", constantDesc2, 0);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0027");
        java.lang.constant.Constable[] constableArray6 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray7 = new java.lang.constant.Constable[][] { constableArray6 };
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.Object obj12 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray11);
        java.lang.constant.Constable[][] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray7, "hi!", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) (short) -1, (java.lang.Object) (byte) 10, "hi!", objArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 'a' + "'", obj12, 'a');
        org.junit.Assert.assertNotNull(constableArray13);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0028");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) '4', (double) 100L, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0029");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.Object obj6 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray5);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) 0.0d, (java.lang.Object) 10.0d, "", objArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0030");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray20, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) "", (java.lang.Object) 0.0f, "hi!", (java.lang.Object[]) charSequenceArray20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0031");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) (byte) -1, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between -1 and 1, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0032");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, 10L, (long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 35, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0033");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be greater than zero, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0034");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (short) -1, (long) (short) 10, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0035");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 100L, 10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 10, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0036");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 100.0d, 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 0.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0037");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureTrue(false, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0038");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (byte) 10, 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 0, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0039");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) 0, 0L, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0040");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.constant.ConstantDesc[] constantDescArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "hi!");
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray20.getClass();
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField31 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass23, "", (java.lang.Object[]) constableArray28);
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray37 = new java.lang.constant.Constable[][] { constableArray36 };
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.Object obj42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray41);
        java.lang.constant.Constable[][] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray37, "hi!", objArray41);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) "hi!", (java.lang.Object) wildcardClass23, "", (java.lang.Object[]) constableArray37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(wildcardClassOfField31);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertNotNull(constableArray43);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0041");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be greater than zero, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0042");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be greater than zero, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0043");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] {};
        java.lang.Object obj10 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray9);
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray15, "");
        java.lang.Object[] objArray18 = new java.lang.Object[] { objArray9, 1, "" };
        java.lang.Object[][] objArray19 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.lang.Object obj23 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray28, "");
        java.lang.Object[] objArray31 = new java.lang.Object[] { objArray22, 1, "" };
        java.lang.Object[][] objArray32 = new java.lang.Object[][] { objArray22 };
        java.lang.Object[][][] objArray33 = new java.lang.Object[][][] { objArray19, objArray32 };
        java.lang.Object[][][] objArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray33, "hi!");
        java.lang.Class<?> wildcardClass36 = objArray33.getClass();
        java.lang.constant.ConstantDesc[] constantDescArray43 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray48, "");
        java.lang.constant.ConstantDesc[] constantDescArray51 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray43, "", (java.lang.Object[]) constableArray48);
        java.lang.Class<?> wildcardClass52 = constantDescArray43.getClass();
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray58 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray56, "");
        java.lang.Class<?> wildcardClass59 = charSequenceArray56.getClass();
        java.lang.constant.Constable[] constableArray64 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray64, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField67 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass59, "", (java.lang.Object[]) constableArray64);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray71, "");
        java.lang.Class<?> wildcardClass74 = charSequenceArray71.getClass();
        java.lang.constant.Constable[] constableArray79 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray81 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray79, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField82 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass74, "", (java.lang.Object[]) constableArray79);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray83 = new java.lang.invoke.TypeDescriptor[] { wildcardClass6, wildcardClass36, wildcardClass52, wildcardClass59, wildcardClass74 };
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeDescriptorArray83, "");
        java.lang.Object[] objArray90 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray91 = new java.lang.Object[][] { objArray90 };
        java.lang.Object[] objArray95 = new java.lang.Object[] {};
        java.lang.Object obj96 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray95);
        java.lang.Object[][] objArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray91, "hi!", objArray95);
        java.lang.Comparable<java.lang.String> strComparable98 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) objArray97);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray99 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeDescriptorArray85, "", (java.lang.Object[]) objArray97);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertArrayEquals(objArray9, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj10 + "' != '" + 'a' + "'", obj10, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(constantDescArray43);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constantDescArray51);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constableArray66);
        org.junit.Assert.assertNotNull(wildcardClassOfField67);
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(constableArray79);
        org.junit.Assert.assertNotNull(constableArray81);
        org.junit.Assert.assertNotNull(wildcardClassOfField82);
        org.junit.Assert.assertNotNull(typeDescriptorArray83);
        org.junit.Assert.assertNotNull(typeDescriptorArray85);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray90), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray90), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertArrayEquals(objArray95, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj96 + "' != '" + 'a' + "'", obj96, 'a');
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertEquals("'" + strComparable98 + "' != '" + "hi!" + "'", strComparable98, "hi!");
        org.junit.Assert.assertNotNull(typeDescriptorArray99);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0044");
        java.lang.constant.Constable[] constableArray6 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray7 = new java.lang.constant.Constable[][] { constableArray6 };
        java.lang.Object[] objArray11 = new java.lang.Object[] {};
        java.lang.Object obj12 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray11);
        java.lang.constant.Constable[][] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray7, "hi!", objArray11);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) (short) -1, (java.lang.Object) '#', "", (java.lang.Object[]) constableArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray7);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertArrayEquals(objArray11, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + 'a' + "'", obj12, 'a');
        org.junit.Assert.assertNotNull(constableArray13);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0045");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 0, (double) (short) 0, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0046");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 0.0d, (double) (-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and -1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0047");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (byte) 1, (long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and -1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0048");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (short) 10, (long) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0049");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) 'a', (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 97 and 10, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0050");
        java.lang.Object[] objArray2 = null;
        java.lang.String str3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull("", "", objArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0051");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 100, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0052");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 1, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0053");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 100, (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 100, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0054");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 10, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0055");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 10, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0056");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (byte) 1, (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0057");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) (byte) 0, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 1, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0058");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be greater than zero, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0059");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, 0L, 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0060");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (short) -1, 0L, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0061");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 100, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0062");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Class<?> wildcardClass9 = charSequenceArray6.getClass();
        java.lang.Object[] objArray12 = new java.lang.Object[] {};
        java.lang.Object obj13 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray12);
        java.lang.CharSequence[] charSequenceArray18 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray18, "");
        java.lang.Object[] objArray21 = new java.lang.Object[] { objArray12, 1, "" };
        java.lang.Object[][] objArray22 = new java.lang.Object[][] { objArray12 };
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.lang.Object obj26 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray25);
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.Object[] objArray34 = new java.lang.Object[] { objArray25, 1, "" };
        java.lang.Object[][] objArray35 = new java.lang.Object[][] { objArray25 };
        java.lang.Object[][][] objArray36 = new java.lang.Object[][][] { objArray22, objArray35 };
        java.lang.Object[][][] objArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray36, "hi!");
        java.lang.Class<?> wildcardClass39 = objArray36.getClass();
        java.lang.constant.ConstantDesc[] constantDescArray46 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray51 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray51, "");
        java.lang.constant.ConstantDesc[] constantDescArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray46, "", (java.lang.Object[]) constableArray51);
        java.lang.Class<?> wildcardClass55 = constantDescArray46.getClass();
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray59, "");
        java.lang.Class<?> wildcardClass62 = charSequenceArray59.getClass();
        java.lang.constant.Constable[] constableArray67 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray67, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass62, "", (java.lang.Object[]) constableArray67);
        java.lang.CharSequence[] charSequenceArray74 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray74, "");
        java.lang.Class<?> wildcardClass77 = charSequenceArray74.getClass();
        java.lang.constant.Constable[] constableArray82 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray84 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray82, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField85 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass77, "", (java.lang.Object[]) constableArray82);
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray86 = new java.lang.invoke.TypeDescriptor[] { wildcardClass9, wildcardClass39, wildcardClass55, wildcardClass62, wildcardClass77 };
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeDescriptorArray86, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) 10.0f, (java.lang.Object) ' ', "", (java.lang.Object[]) typeDescriptorArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertArrayEquals(objArray12, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + 'a' + "'", obj13, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertNotNull(constableArray51);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNotNull(constantDescArray54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(wildcardClassOfField70);
        org.junit.Assert.assertNotNull(charSequenceArray74);
        org.junit.Assert.assertNotNull(charSequenceArray76);
        org.junit.Assert.assertNotNull(wildcardClass77);
        org.junit.Assert.assertNotNull(constableArray82);
        org.junit.Assert.assertNotNull(constableArray84);
        org.junit.Assert.assertNotNull(wildcardClassOfField85);
        org.junit.Assert.assertNotNull(typeDescriptorArray86);
        org.junit.Assert.assertNotNull(typeDescriptorArray88);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0063");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 0, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0064");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must not be negative, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0065");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (short) 100, (double) 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 0.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0066");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 1, (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and -1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0067");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 100L, (long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 100, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0068");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZeroIfNotNull((java.lang.Integer) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be greater than zero, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0069");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (byte) 0, 100, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0070");
        double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 1.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 1.0d + "'", double2 == 1.0d);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0071");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (-1), (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between -1 and 97, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0072");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 0, (double) ' ', "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0073");
        double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 10.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 10.0d + "'", double2 == 10.0d);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0074");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.constant.Constable[][] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray10, "");
        java.lang.Class<?> wildcardClass21 = constableArray20.getClass();
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0075");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray7.getClass();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.reflect.Type[] typeArray13 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass10, wildcardClass12 };
        java.lang.reflect.Type[] typeArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray13, "");
        java.lang.constant.ConstantDesc[] constantDescArray23 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.constant.ConstantDesc[] constantDescArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray23, "", (java.lang.Object[]) constableArray28);
        java.lang.reflect.Type[] typeArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray13, "hi!", (java.lang.Object[]) constableArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[] genericDeclarationArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray0, "", (java.lang.Object[]) typeArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(constantDescArray23);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constantDescArray31);
        org.junit.Assert.assertNotNull(typeArray32);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0076");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 1, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 0, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0077");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 100.0d, 10.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100.0 and 10.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0078");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZeroIfNotNull((java.lang.Integer) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be greater than zero, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0079");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (short) 10, (double) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and 1.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0080");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0081");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be greater than zero, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0082");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 100, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 100, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0083");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        java.lang.reflect.Type type31 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass29, "");
        java.lang.Object[] objArray34 = new java.lang.Object[] {};
        java.lang.Object obj35 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray34);
        java.lang.Object[] objArray40 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray41 = new java.lang.Object[][] { objArray40 };
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        java.lang.Object obj46 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray45);
        java.lang.Object[][] objArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray41, "hi!", objArray45);
        java.lang.Comparable<java.lang.String> strComparable48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) objArray47);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) type31, (java.lang.Object) objArray34, "hi!", (java.lang.Object[]) objArray47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertArrayEquals(objArray34, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj35 + "' != '" + 'a' + "'", obj35, 'a');
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertArrayEquals(objArray45, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 'a' + "'", obj46, 'a');
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals("'" + strComparable48 + "' != '" + "hi!" + "'", strComparable48, "hi!");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0084");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 10.0f, (double) 100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and 100.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0085");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 10, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0086");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray1 };
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object obj7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray6);
        java.lang.Object[][] objArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray2, "hi!", objArray6);
        java.lang.Class<?> wildcardClass9 = objArray2.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0087");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (short) -1, (long) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0088");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be greater than zero, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0089");
        java.lang.Object obj0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(obj0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0090");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) (-1.0d), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be greater than zero, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0091");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration10 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass8, "");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclaration10);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0092");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Object[][][] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray28, "");
        java.lang.Class<?> wildcardClass31 = objArray28.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0093");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (byte) 100, (long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0094");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Integer) 100, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0095");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 100, 10.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100.0 and 10.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0096");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (-1), (double) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0097");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 1, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0098");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.Class<?> wildcardClass15 = constantDescArray6.getClass();
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray23, "");
        java.lang.constant.Constable constable26 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.Constable) (short) 100, "hi!", (java.lang.Object[]) charSequenceArray23);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constantDescArray6, (java.lang.Object) 0L, "hi!", (java.lang.Object[]) charSequenceArray23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertEquals("'" + constable26 + "' != '" + (short) 100 + "'", constable26, (short) 100);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0099");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray1 };
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object obj7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray6);
        java.lang.Object[][] objArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray2, "hi!", objArray6);
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray21, "");
        java.lang.constant.ConstantDesc[] constantDescArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "", (java.lang.Object[]) constableArray21);
        java.lang.constant.ConstantDesc[] constantDescArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray16, "");
        java.io.Serializable[] serializableArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray2, "", (java.lang.Object[]) constantDescArray28);
        java.lang.constant.Constable[] constableArray35 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray35, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) "", (java.lang.Object) ' ', "", (java.lang.Object[]) constableArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0100");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) 0, (double) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0.0 and 1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0101");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) (short) 100, (double) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0102");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Class<?> wildcardClass9 = charSequenceArray6.getClass();
        java.lang.constant.Constable[] constableArray14 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray14, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass9, "", (java.lang.Object[]) constableArray14);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) '#', (java.lang.Object) 0.0d, "", (java.lang.Object[]) constableArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(constableArray14);
        org.junit.Assert.assertNotNull(constableArray16);
        org.junit.Assert.assertNotNull(wildcardClassOfField17);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0103");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray6, "hi!");
        java.lang.String[] strArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray8, "");
        java.lang.Class<?> wildcardClass11 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0104");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (-1L), (long) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0105");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 10, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0106");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, 0L, (long) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0107");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (-1), (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between -1 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0108");
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.Object[][] objArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray4, "hi!", objArray8);
        java.lang.Comparable<java.lang.String> strComparable11 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) objArray10);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Class<?> wildcardClass13 = obj12.getClass();
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray17, "");
        java.lang.Class<?> wildcardClass20 = charSequenceArray17.getClass();
        java.lang.Object obj21 = new java.lang.Object();
        java.lang.Class<?> wildcardClass22 = obj21.getClass();
        java.lang.reflect.Type[] typeArray23 = new java.lang.reflect.Type[] { wildcardClass13, wildcardClass20, wildcardClass22 };
        java.lang.reflect.Type[] typeArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray23, "");
        java.lang.constant.ConstantDesc[] constantDescArray33 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray38 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray38, "");
        java.lang.constant.ConstantDesc[] constantDescArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray33, "", (java.lang.Object[]) constableArray38);
        java.lang.reflect.Type[] typeArray42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray23, "hi!", (java.lang.Object[]) constableArray38);
        java.lang.Class<?> wildcardClass43 = constableArray38.getClass();
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray48 };
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        java.lang.Object obj54 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray53);
        java.lang.constant.Constable[][] constableArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray49, "hi!", objArray53);
        java.lang.constant.Constable[] constableArray60 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray60, "");
        java.io.Serializable[] serializableArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray55, "hi!", (java.lang.Object[]) constableArray62);
        java.lang.reflect.AnnotatedElement annotatedElement64 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass43, "hi!", (java.lang.Object[]) constableArray62);
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray70 = new java.lang.constant.Constable[][] { constableArray69 };
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        java.lang.Object obj75 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray74);
        java.lang.constant.Constable[][] constableArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray70, "hi!", objArray74);
        java.lang.constant.Constable[] constableArray81 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray83 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray81, "");
        java.io.Serializable[] serializableArray84 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray76, "hi!", (java.lang.Object[]) constableArray83);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) objArray10, (java.lang.Object) wildcardClass43, "", (java.lang.Object[]) constableArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "hi!" + "'", strComparable11, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertNotNull(constantDescArray33);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNotNull(constantDescArray41);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(wildcardClass43);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 'a' + "'", obj54, 'a');
        org.junit.Assert.assertNotNull(constableArray55);
        org.junit.Assert.assertNotNull(constableArray60);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(serializableArray63);
        org.junit.Assert.assertNotNull(annotatedElement64);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertArrayEquals(objArray74, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + 'a' + "'", obj75, 'a');
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(constableArray81);
        org.junit.Assert.assertNotNull(constableArray83);
        org.junit.Assert.assertNotNull(serializableArray84);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0109");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) 0L, (double) (byte) 10, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0110");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray13 = new java.lang.constant.Constable[][] { constableArray12 };
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object obj18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray17);
        java.lang.constant.Constable[][] constableArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray13, "hi!", objArray17);
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray24, "");
        java.io.Serializable[] serializableArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray19, "hi!", (java.lang.Object[]) constableArray26);
        java.lang.constant.Constable[][] constableArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray19, "");
        java.lang.Class<?> wildcardClass30 = constableArray29.getClass();
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Class<?> wildcardClass32 = obj31.getClass();
        java.lang.reflect.Type[] typeArray33 = new java.lang.reflect.Type[] { wildcardClass8, wildcardClass30, wildcardClass32 };
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        java.lang.Object obj38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray37);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray45 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray43, "");
        java.lang.Object[] objArray46 = new java.lang.Object[] { objArray37, 1, "" };
        java.lang.Object[][] objArray47 = new java.lang.Object[][] { objArray37 };
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        java.lang.Object obj51 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray50);
        java.lang.CharSequence[] charSequenceArray56 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray58 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray56, "");
        java.lang.Object[] objArray59 = new java.lang.Object[] { objArray50, 1, "" };
        java.lang.Object[][] objArray60 = new java.lang.Object[][] { objArray50 };
        java.lang.Object[][][] objArray61 = new java.lang.Object[][][] { objArray47, objArray60 };
        java.lang.Object[][][] objArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray61, "hi!");
        java.lang.CharSequence[] charSequenceArray70 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray70, "");
        java.io.Serializable[] serializableArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray61, "hi!", (java.lang.Object[]) charSequenceArray72);
        java.lang.reflect.Type[] typeArray74 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray33, "", (java.lang.Object[]) charSequenceArray72);
        java.lang.reflect.Type[] typeArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray33, "hi!");
        java.lang.constant.ConstantDesc constantDesc77 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) 100.0f, "", (java.lang.Object[]) typeArray33);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(serializableArray27);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertArrayEquals(objArray50, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 'a' + "'", obj51, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(charSequenceArray70);
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(serializableArray73);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertEquals("'" + constantDesc77 + "' != '" + 100.0f + "'", constantDesc77, 100.0f);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0111");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (byte) 1, (long) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0112");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (byte) 1, 10, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0113");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, 0, 10, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0114");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 1, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0115");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, 0.0d, (double) (short) 1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0116");
        java.lang.constant.Constable[] constableArray1 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray6 = new java.lang.constant.Constable[][] { constableArray1, constableArray3, constableArray5 };
        java.lang.constant.Constable[] constableArray8 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray13 = new java.lang.constant.Constable[][] { constableArray8, constableArray10, constableArray12 };
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray15, constableArray17, constableArray19 };
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray27 = new java.lang.constant.Constable[][] { constableArray22, constableArray24, constableArray26 };
        java.lang.constant.Constable[][][] constableArray28 = new java.lang.constant.Constable[][][] { constableArray6, constableArray13, constableArray20, constableArray27 };
        java.lang.constant.Constable[][][] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.Object obj34 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray39, "");
        java.lang.Object[] objArray42 = new java.lang.Object[] { objArray33, 1, "" };
        java.lang.Object[][] objArray43 = new java.lang.Object[][] { objArray33 };
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        java.lang.Object obj47 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray52, "");
        java.lang.Object[] objArray55 = new java.lang.Object[] { objArray46, 1, "" };
        java.lang.Object[][] objArray56 = new java.lang.Object[][] { objArray46 };
        java.lang.Object[][][] objArray57 = new java.lang.Object[][][] { objArray43, objArray56 };
        java.lang.Object[][][] objArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray57, "hi!");
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray59, "");
        java.io.Serializable[] serializableArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[]) objArray59, "hi!");
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        java.lang.Object obj68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray67);
        java.lang.CharSequence[] charSequenceArray73 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray73, "");
        java.lang.Object[] objArray76 = new java.lang.Object[] { objArray67, 1, "" };
        java.lang.Object[][] objArray77 = new java.lang.Object[][] { objArray67 };
        java.lang.Object[] objArray80 = new java.lang.Object[] {};
        java.lang.Object obj81 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray80);
        java.lang.CharSequence[] charSequenceArray86 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray86, "");
        java.lang.Object[] objArray89 = new java.lang.Object[] { objArray80, 1, "" };
        java.lang.Object[][] objArray90 = new java.lang.Object[][] { objArray80 };
        java.lang.Object[][][] objArray91 = new java.lang.Object[][][] { objArray77, objArray90 };
        java.lang.Object[][][] objArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray91, "hi!");
        java.io.Serializable[][] serializableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray91, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray30, (java.lang.Object) serializableArray63, "hi!", (java.lang.Object[]) serializableArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 'a' + "'", obj34, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 'a' + "'", obj47, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(serializableArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 'a' + "'", obj68, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(charSequenceArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray76), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertArrayEquals(objArray80, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 'a' + "'", obj81, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray86);
        org.junit.Assert.assertNotNull(charSequenceArray88);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertNotNull(serializableArray95);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0117");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) 1, (long) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0118");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass8, wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray21 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray26, "");
        java.lang.constant.ConstantDesc[] constantDescArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray21, "", (java.lang.Object[]) constableArray26);
        java.lang.reflect.Type[] typeArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray11, "hi!", (java.lang.Object[]) constableArray26);
        java.lang.Class<?> wildcardClass31 = constableArray26.getClass();
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray37 = new java.lang.constant.Constable[][] { constableArray36 };
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.Object obj42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray41);
        java.lang.constant.Constable[][] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray37, "hi!", objArray41);
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray48, "");
        java.io.Serializable[] serializableArray51 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray43, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement annotatedElement52 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass31, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.Class<?> wildcardClass53 = annotatedElement52.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(constantDescArray21);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertNotNull(annotatedElement52);
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0119");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (byte) 10, (long) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 100, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0120");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Class<?> wildcardClass24 = charSequenceArray21.getClass();
        java.lang.Object[] objArray27 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray28 = new java.lang.Object[][] { objArray27 };
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object obj33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray32);
        java.lang.Object[][] objArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray28, "hi!", objArray32);
        java.lang.constant.ConstantDesc[] constantDescArray42 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray47 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray47, "");
        java.lang.constant.ConstantDesc[] constantDescArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray42, "", (java.lang.Object[]) constableArray47);
        java.lang.constant.ConstantDesc[] constantDescArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray42, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray42, "");
        java.io.Serializable[] serializableArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray28, "", (java.lang.Object[]) constantDescArray54);
        java.lang.reflect.Type type56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass24, "hi!", (java.lang.Object[]) constantDescArray54);
        java.lang.Object obj57 = new java.lang.Object();
        java.lang.Class<?> wildcardClass58 = obj57.getClass();
        java.lang.CharSequence[] charSequenceArray62 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray64 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray62, "");
        java.lang.Class<?> wildcardClass65 = charSequenceArray62.getClass();
        java.lang.Object obj66 = new java.lang.Object();
        java.lang.Class<?> wildcardClass67 = obj66.getClass();
        java.lang.reflect.Type[] typeArray68 = new java.lang.reflect.Type[] { wildcardClass58, wildcardClass65, wildcardClass67 };
        java.lang.reflect.Type[] typeArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray68, "");
        java.lang.constant.ConstantDesc[] constantDescArray78 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray83 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray83, "");
        java.lang.constant.ConstantDesc[] constantDescArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray78, "", (java.lang.Object[]) constableArray83);
        java.lang.reflect.Type[] typeArray87 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray68, "hi!", (java.lang.Object[]) constableArray83);
        java.lang.Class<?> wildcardClass88 = constableArray83.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray89 = new java.lang.reflect.GenericDeclaration[] { wildcardClass24, wildcardClass88 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray91 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray89, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) charSequenceArray7, (java.lang.Object) "hi!", "hi!", (java.lang.Object[]) genericDeclarationArray89);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 'a' + "'", obj33, 'a');
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(constantDescArray42);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constantDescArray50);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertNotNull(constantDescArray54);
        org.junit.Assert.assertNotNull(serializableArray55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(wildcardClass58);
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(constantDescArray78);
        org.junit.Assert.assertNotNull(constableArray83);
        org.junit.Assert.assertNotNull(constableArray85);
        org.junit.Assert.assertNotNull(constantDescArray86);
        org.junit.Assert.assertNotNull(typeArray87);
        org.junit.Assert.assertNotNull(wildcardClass88);
        org.junit.Assert.assertNotNull(genericDeclarationArray89);
        org.junit.Assert.assertNotNull(genericDeclarationArray91);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0121");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (byte) 100, (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0122");
        // The following exception was thrown during execution in test generation
        try {
            double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be greater than zero, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0123");
        java.lang.reflect.Type[][] typeArray0 = null;
        java.lang.Object[] objArray3 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray4 = new java.lang.Object[][] { objArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.Object[][] objArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray4, "hi!", objArray8);
        java.lang.constant.ConstantDesc[] constantDescArray18 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray23, "");
        java.lang.constant.ConstantDesc[] constantDescArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray18, "", (java.lang.Object[]) constableArray23);
        java.lang.constant.ConstantDesc[] constantDescArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray18, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray18, "");
        java.io.Serializable[] serializableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray4, "", (java.lang.Object[]) constantDescArray30);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][] typeArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray0, "", (java.lang.Object[]) objArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertNotNull(serializableArray31);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0124");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (short) 10, (long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 100, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0125");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (short) 100, 1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0126");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) '#', (int) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 35 and -1, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0127");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) 1, (long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0128");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration10 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass8, "hi!");
        java.lang.reflect.GenericDeclaration genericDeclaration12 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass8, "");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(genericDeclaration12);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0129");
        java.lang.Comparable<java.lang.String> strComparable2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + strComparable2 + "' != '" + "hi!" + "'", strComparable2, "hi!");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0130");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray35, "");
        java.io.Serializable[] serializableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray26, "hi!", (java.lang.Object[]) charSequenceArray37);
        java.lang.Class<?> wildcardClass39 = objArray26.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0131");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (short) 1, (long) ' ', "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0132");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), 1.0d, (double) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 97.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0133");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 100, (-1.0d), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and -1.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0134");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) '#', (long) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 35 and 0, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0135");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 0, "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0136");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, 0, (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0 and -1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0137");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.Class<?> wildcardClass15 = wildcardClassOfField14.getClass();
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray19 };
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        java.lang.Object obj25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray24);
        java.lang.constant.Constable[][] constableArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray20, "hi!", objArray24);
        java.lang.constant.Constable[] constableArray31 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray31, "");
        java.io.Serializable[] serializableArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray26, "hi!", (java.lang.Object[]) constableArray33);
        java.lang.constant.Constable[][] constableArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray26, "");
        java.lang.String[] strArray44 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray44, "hi!");
        java.lang.String[] strArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray46, "");
        java.lang.constant.Constable[][] constableArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray36, "", (java.lang.Object[]) strArray48);
        java.lang.Object[] objArray53 = new java.lang.Object[] {};
        java.lang.Object obj54 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray53);
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray59, "");
        java.lang.Object[] objArray62 = new java.lang.Object[] { objArray53, 1, "" };
        java.lang.Object[][] objArray63 = new java.lang.Object[][] { objArray53 };
        java.lang.Object[] objArray66 = new java.lang.Object[] {};
        java.lang.Object obj67 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray66);
        java.lang.CharSequence[] charSequenceArray72 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray74 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray72, "");
        java.lang.Object[] objArray75 = new java.lang.Object[] { objArray66, 1, "" };
        java.lang.Object[][] objArray76 = new java.lang.Object[][] { objArray66 };
        java.lang.Object[][][] objArray77 = new java.lang.Object[][][] { objArray63, objArray76 };
        java.lang.Object[][][] objArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray77, "hi!");
        java.lang.Object[][][] objArray81 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray79, "");
        java.io.Serializable[] serializableArray83 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[]) objArray79, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) wildcardClass15, (java.lang.Object) constableArray49, "hi!", (java.lang.Object[]) objArray79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(serializableArray34);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertArrayEquals(strArray44, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertArrayEquals(objArray53, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj54 + "' != '" + 'a' + "'", obj54, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray62), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertArrayEquals(objArray66, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj67 + "' != '" + 'a' + "'", obj67, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(charSequenceArray74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(serializableArray83);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0138");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, 10L, (long) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0139");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray22.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass23, "");
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.Class<?> wildcardClass34 = charSequenceArray31.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] { wildcardClass27, wildcardClass34, wildcardClass36 };
        java.lang.reflect.Type[] typeArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray37, "");
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray52, "");
        java.lang.constant.ConstantDesc[] constantDescArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray47, "", (java.lang.Object[]) constableArray52);
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray37, "hi!", (java.lang.Object[]) constableArray52);
        java.lang.Class<?> wildcardClass57 = constableArray52.getClass();
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray63 = new java.lang.constant.Constable[][] { constableArray62 };
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        java.lang.Object obj68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray67);
        java.lang.constant.Constable[][] constableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray63, "hi!", objArray67);
        java.lang.constant.Constable[] constableArray74 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray74, "");
        java.io.Serializable[] serializableArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray69, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.AnnotatedElement annotatedElement78 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass57, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass23, wildcardClass57 };
        java.lang.reflect.Type[][] typeArray80 = new java.lang.reflect.Type[][] { typeArray79 };
        java.lang.reflect.Type[][] typeArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "hi!");
        java.lang.Class<?> wildcardClass83 = typeArray80.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(genericDeclaration25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 'a' + "'", obj68, 'a');
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertNotNull(annotatedElement78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(wildcardClass83);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0140");
        java.lang.constant.ConstantDesc[][] constantDescArray0 = new java.lang.constant.ConstantDesc[][] {};
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object obj5 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray4);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray10, "");
        java.lang.Object[] objArray13 = new java.lang.Object[] { objArray4, 1, "" };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray4 };
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object obj18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray17);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray23, "");
        java.lang.Object[] objArray26 = new java.lang.Object[] { objArray17, 1, "" };
        java.lang.Object[][] objArray27 = new java.lang.Object[][] { objArray17 };
        java.lang.Object[][][] objArray28 = new java.lang.Object[][][] { objArray14, objArray27 };
        java.lang.Object[][][] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray28, "hi!");
        java.lang.Object[][][] objArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray30, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.ConstantDesc[][] constantDescArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray0, "", (java.lang.Object[]) objArray32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray0);
        org.junit.Assert.assertArrayEquals(constantDescArray0, new java.lang.constant.ConstantDesc[][] {});
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 'a' + "'", obj5, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0141");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (short) -1, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0142");
        java.lang.constant.ConstantDesc constantDesc2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) 0.0f, "");
        org.junit.Assert.assertEquals("'" + constantDesc2 + "' != '" + 0.0f + "'", constantDesc2, 0.0f);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0143");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray0, new java.lang.reflect.GenericDeclaration[][] {});
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0144");
        java.lang.constant.Constable[][][] constableArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable[][][] constableArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0145");
        java.lang.Object[] objArray2 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray3 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray7 = new java.lang.Object[] {};
        java.lang.Object obj8 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray7);
        java.lang.Object[][] objArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray3, "hi!", objArray7);
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray22, "");
        java.lang.constant.ConstantDesc[] constantDescArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray17, "", (java.lang.Object[]) constableArray22);
        java.lang.constant.ConstantDesc[] constantDescArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray17, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray17, "");
        java.io.Serializable[] serializableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray3, "", (java.lang.Object[]) constantDescArray29);
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray52 = new java.lang.CharSequence[][] { charSequenceArray35, charSequenceArray39, charSequenceArray43, charSequenceArray47, charSequenceArray51 };
        java.lang.CharSequence[][] charSequenceArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray52, "");
        java.lang.CharSequence[][] charSequenceArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray54, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) "hi!", (java.lang.Object) "", "", (java.lang.Object[]) charSequenceArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertArrayEquals(objArray7, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj8 + "' != '" + 'a' + "'", obj8, 'a');
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constantDescArray25);
        org.junit.Assert.assertNotNull(constantDescArray27);
        org.junit.Assert.assertNotNull(constantDescArray29);
        org.junit.Assert.assertNotNull(serializableArray30);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray56);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0146");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 0.0d, (double) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0.0 and 1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0147");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.constant.ConstantDesc[] constantDescArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "hi!");
        java.lang.Class<?> wildcardClass17 = constantDescArray16.getClass();
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0148");
        java.lang.Object obj1 = new java.lang.Object();
        java.lang.Class<?> wildcardClass2 = obj1.getClass();
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Class<?> wildcardClass9 = charSequenceArray6.getClass();
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.reflect.Type[] typeArray12 = new java.lang.reflect.Type[] { wildcardClass2, wildcardClass9, wildcardClass11 };
        java.lang.reflect.Type[] typeArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray12, "");
        java.lang.String[] strArray22 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray22, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray22, "");
        java.lang.constant.Constable[] constableArray31 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray32 = new java.lang.constant.Constable[][] { constableArray31 };
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        java.lang.Object obj37 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray36);
        java.lang.constant.Constable[][] constableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray32, "hi!", objArray36);
        java.lang.constant.Constable[] constableArray43 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray45 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray43, "");
        java.io.Serializable[] serializableArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray38, "hi!", (java.lang.Object[]) constableArray45);
        java.lang.constant.Constable[][] constableArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray38, "");
        java.lang.Object[] objArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[]) strArray22, "", (java.lang.Object[]) constableArray48);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) 1.0d, (java.lang.Object) typeArray12, "", (java.lang.Object[]) strArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertArrayEquals(constantDescArray26, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray45);
        org.junit.Assert.assertNotNull(serializableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0149");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        java.lang.constant.Constable[] constableArray13 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray13, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass8, "", (java.lang.Object[]) constableArray13);
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray22, "");
        java.lang.Class<?> wildcardClass25 = charSequenceArray24.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration27 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass25, "");
        java.lang.Object obj28 = new java.lang.Object();
        java.lang.Class<?> wildcardClass29 = obj28.getClass();
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray33, "");
        java.lang.Class<?> wildcardClass36 = charSequenceArray33.getClass();
        java.lang.Object obj37 = new java.lang.Object();
        java.lang.Class<?> wildcardClass38 = obj37.getClass();
        java.lang.reflect.Type[] typeArray39 = new java.lang.reflect.Type[] { wildcardClass29, wildcardClass36, wildcardClass38 };
        java.lang.reflect.Type[] typeArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray39, "");
        java.lang.constant.ConstantDesc[] constantDescArray49 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray54 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray54, "");
        java.lang.constant.ConstantDesc[] constantDescArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray49, "", (java.lang.Object[]) constableArray54);
        java.lang.reflect.Type[] typeArray58 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray39, "hi!", (java.lang.Object[]) constableArray54);
        java.lang.Class<?> wildcardClass59 = constableArray54.getClass();
        java.lang.constant.Constable[] constableArray64 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray65 = new java.lang.constant.Constable[][] { constableArray64 };
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        java.lang.Object obj70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray69);
        java.lang.constant.Constable[][] constableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "hi!", objArray69);
        java.lang.constant.Constable[] constableArray76 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray76, "");
        java.io.Serializable[] serializableArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray71, "hi!", (java.lang.Object[]) constableArray78);
        java.lang.reflect.AnnotatedElement annotatedElement80 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass59, "hi!", (java.lang.Object[]) constableArray78);
        java.lang.reflect.Type[] typeArray81 = new java.lang.reflect.Type[] { wildcardClass8, wildcardClass25, wildcardClass59 };
        java.lang.reflect.Type[][] typeArray82 = new java.lang.reflect.Type[][] { typeArray81 };
        java.lang.reflect.Type[][] typeArray84 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray82, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][][] typeArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray0, "", (java.lang.Object[]) typeArray84);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(wildcardClassOfField16);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertNotNull(genericDeclaration27);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertNotNull(constantDescArray49);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constableArray56);
        org.junit.Assert.assertNotNull(constantDescArray57);
        org.junit.Assert.assertNotNull(typeArray58);
        org.junit.Assert.assertNotNull(wildcardClass59);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertArrayEquals(objArray69, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 'a' + "'", obj70, 'a');
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertNotNull(annotatedElement80);
        org.junit.Assert.assertNotNull(typeArray81);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(typeArray84);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0150");
        java.lang.reflect.Type[][][] typeArray0 = new java.lang.reflect.Type[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][][] typeArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][][] {});
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0151");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray3 };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[][][] charSequenceArray8 = new java.lang.CharSequence[][][] { charSequenceArray4, charSequenceArray7 };
        java.lang.CharSequence[][][] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][] charSequenceArray11 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray0, "", (java.lang.Object[]) charSequenceArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0152");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (byte) -1, (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0153");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) ' ', (double) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32.0 and -1.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0154");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) 1, (long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 35, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0155");
        // The following exception was thrown during execution in test generation
        try {
            int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must not be negative, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0156");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.constant.ConstantDesc[] constantDescArray81 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray86 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray86, "");
        java.lang.constant.ConstantDesc[] constantDescArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray81, "", (java.lang.Object[]) constableArray86);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray71, "hi!", (java.lang.Object[]) constantDescArray81);
        java.lang.constant.Constable[] constableArray95 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray95, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray98 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "hi!", (java.lang.Object[]) constableArray97);
        java.lang.Class<?> wildcardClass99 = genericDeclarationArray71.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(constantDescArray81);
        org.junit.Assert.assertNotNull(constableArray86);
        org.junit.Assert.assertNotNull(constableArray88);
        org.junit.Assert.assertNotNull(constantDescArray89);
        org.junit.Assert.assertNotNull(annotatedElementArray90);
        org.junit.Assert.assertNotNull(constableArray95);
        org.junit.Assert.assertNotNull(constableArray97);
        org.junit.Assert.assertNotNull(genericDeclarationArray98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0157");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Object[] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[]) objArray28, "hi!");
        java.lang.Object[][][] objArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray28, "");
        java.lang.Class<?> wildcardClass33 = objArray28.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[[]], [[]]]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0158");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) 'a', 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 97 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0159");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.String[] strArray23 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray23, "hi!");
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray30, "");
        java.lang.String[] strArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray25, "hi!", (java.lang.Object[]) constableArray32);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray11, (java.lang.Object) 1.0f, "hi!", (java.lang.Object[]) strArray25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertArrayEquals(strArray33, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0160");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 0, (int) ' ', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0 and 32, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0161");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) 0, (long) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0162");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (short) 100, 10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 10, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0163");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 10, 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0164");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (byte) -1, 0.0d, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0165");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) (byte) 0, (double) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0.0 and -1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0166");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Integer int2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZeroIfNotNull((java.lang.Integer) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be greater than zero, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0167");
        java.lang.constant.ConstantDesc[] constantDescArray5 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray18 = new java.lang.constant.ConstantDesc[][] { constantDescArray5, constantDescArray11, constantDescArray17 };
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.lang.Object obj23 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray28, "");
        java.lang.Object[] objArray31 = new java.lang.Object[] { objArray22, 1, "" };
        java.lang.Object[][] objArray32 = new java.lang.Object[][] { objArray22 };
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.lang.Object obj36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "");
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray35, 1, "" };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray35 };
        java.lang.Object[][][] objArray46 = new java.lang.Object[][][] { objArray32, objArray45 };
        java.lang.Object[][][] objArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray46, "hi!");
        java.lang.Class<?> wildcardClass49 = objArray46.getClass();
        java.lang.constant.Constable[] constableArray54 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray55 = new java.lang.constant.Constable[][] { constableArray54 };
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        java.lang.Object obj60 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray59);
        java.lang.constant.Constable[][] constableArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray55, "hi!", objArray59);
        java.lang.constant.Constable[] constableArray66 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray66, "");
        java.io.Serializable[] serializableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray61, "hi!", (java.lang.Object[]) constableArray68);
        java.lang.reflect.AnnotatedElement annotatedElement70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass49, "", (java.lang.Object[]) constableArray68);
        java.lang.constant.ConstantDesc[][] constantDescArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray18, "", (java.lang.Object[]) constableArray68);
        java.lang.Class<?> wildcardClass72 = constantDescArray18.getClass();
        org.junit.Assert.assertNotNull(constantDescArray5);
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constableArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertArrayEquals(objArray59, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 'a' + "'", obj60, 'a');
        org.junit.Assert.assertNotNull(constableArray61);
        org.junit.Assert.assertNotNull(constableArray66);
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertNotNull(annotatedElement70);
        org.junit.Assert.assertNotNull(constantDescArray71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0168");
        java.lang.Object[][][] objArray0 = null;
        java.lang.Object[] objArray4 = new java.lang.Object[] {};
        java.lang.Object obj5 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray4);
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray10, "");
        java.lang.Object[] objArray13 = new java.lang.Object[] { objArray4, 1, "" };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray4 };
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object obj18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray17);
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray23, "");
        java.lang.Object[] objArray26 = new java.lang.Object[] { objArray17, 1, "" };
        java.lang.Object[][] objArray27 = new java.lang.Object[][] { objArray17 };
        java.lang.Object[][][] objArray28 = new java.lang.Object[][][] { objArray14, objArray27 };
        java.lang.Object[][][] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray28, "hi!");
        java.lang.Object[][][] objArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray30, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][] objArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray0, "hi!", (java.lang.Object[]) objArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertArrayEquals(objArray4, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + 'a' + "'", obj5, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0169");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (-1), (long) (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between -1 and -1, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0170");
        int int2 = dev.langchain4j.internal.ValidationUtils.ensureNotNegative((java.lang.Integer) 1, "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0171");
        java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray0 = new java.lang.reflect.GenericDeclaration[][][] {};
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[][][] genericDeclarationArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(genericDeclarationArray0);
        org.junit.Assert.assertArrayEquals(genericDeclarationArray0, new java.lang.reflect.GenericDeclaration[][][] {});
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0172");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, 0, (int) (short) 1, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0173");
        java.io.Serializable[][] serializableArray0 = null;
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        java.lang.constant.Constable[] constableArray13 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray13, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass8, "", (java.lang.Object[]) constableArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.io.Serializable[][] serializableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray0, "", (java.lang.Object[]) constableArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(wildcardClassOfField16);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0174");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 1L, (long) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0175");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray3, "");
        java.lang.Class<?> wildcardClass6 = constableArray3.getClass();
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0176");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, 1.0d, (double) '#', "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0177");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) 100, (long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0178");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.constant.ConstantDesc[] constantDescArray81 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray86 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray86, "");
        java.lang.constant.ConstantDesc[] constantDescArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray81, "", (java.lang.Object[]) constableArray86);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray71, "hi!", (java.lang.Object[]) constantDescArray81);
        java.lang.Class<?> wildcardClass91 = constantDescArray81.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(constantDescArray81);
        org.junit.Assert.assertNotNull(constableArray86);
        org.junit.Assert.assertNotNull(constableArray88);
        org.junit.Assert.assertNotNull(constantDescArray89);
        org.junit.Assert.assertNotNull(annotatedElementArray90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0179");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.GenericDeclaration[][] genericDeclarationArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0180");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (short) -1, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0181");
        java.lang.Object[] objArray5 = new java.lang.Object[] {};
        java.lang.Object obj6 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray5);
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray11, "");
        java.lang.Object[] objArray14 = new java.lang.Object[] { objArray5, 1, "" };
        java.lang.Object[][] objArray15 = new java.lang.Object[][] { objArray5 };
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object obj19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray18);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray24, "");
        java.lang.Object[] objArray27 = new java.lang.Object[] { objArray18, 1, "" };
        java.lang.Object[][] objArray28 = new java.lang.Object[][] { objArray18 };
        java.lang.Object[][][] objArray29 = new java.lang.Object[][][] { objArray15, objArray28 };
        java.lang.Object[][][] objArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray29, "hi!");
        java.lang.Object[] objArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[]) objArray31, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) (short) -1, (java.lang.Object) 100, "", objArray33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertArrayEquals(objArray5, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj6 + "' != '" + 'a' + "'", obj6, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[[[]], [[]]]");
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0182");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) 10, (double) (-1.0f), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and -1.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0183");
        java.lang.constant.ConstantDesc constantDesc2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) "hi!", "hi!");
        org.junit.Assert.assertEquals("'" + constantDesc2 + "' != '" + "hi!" + "'", constantDesc2, "hi!");
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0184");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (byte) 1, (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0185");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (byte) -1, (long) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between -1 and 1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0186");
        java.lang.constant.Constable constable0 = null;
        java.lang.constant.ConstantDesc[] constantDescArray7 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[] constantDescArray13 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[] constantDescArray19 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray20 = new java.lang.constant.ConstantDesc[][] { constantDescArray7, constantDescArray13, constantDescArray19 };
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        java.lang.Object obj25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray24);
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray30, "");
        java.lang.Object[] objArray33 = new java.lang.Object[] { objArray24, 1, "" };
        java.lang.Object[][] objArray34 = new java.lang.Object[][] { objArray24 };
        java.lang.Object[] objArray37 = new java.lang.Object[] {};
        java.lang.Object obj38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray37);
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray45 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray43, "");
        java.lang.Object[] objArray46 = new java.lang.Object[] { objArray37, 1, "" };
        java.lang.Object[][] objArray47 = new java.lang.Object[][] { objArray37 };
        java.lang.Object[][][] objArray48 = new java.lang.Object[][][] { objArray34, objArray47 };
        java.lang.Object[][][] objArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray48, "hi!");
        java.lang.Class<?> wildcardClass51 = objArray48.getClass();
        java.lang.constant.Constable[] constableArray56 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray57 = new java.lang.constant.Constable[][] { constableArray56 };
        java.lang.Object[] objArray61 = new java.lang.Object[] {};
        java.lang.Object obj62 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray61);
        java.lang.constant.Constable[][] constableArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray57, "hi!", objArray61);
        java.lang.constant.Constable[] constableArray68 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray68, "");
        java.io.Serializable[] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray63, "hi!", (java.lang.Object[]) constableArray70);
        java.lang.reflect.AnnotatedElement annotatedElement72 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass51, "", (java.lang.Object[]) constableArray70);
        java.lang.constant.ConstantDesc[][] constantDescArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray20, "", (java.lang.Object[]) constableArray70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.constant.Constable constable74 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constable0, "", (java.lang.Object[]) constableArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray7);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constantDescArray19);
        org.junit.Assert.assertNotNull(constantDescArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertArrayEquals(objArray37, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 'a' + "'", obj38, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray46), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(constableArray56);
        org.junit.Assert.assertNotNull(constableArray57);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertArrayEquals(objArray61, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj62 + "' != '" + 'a' + "'", obj62, 'a');
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(annotatedElement72);
        org.junit.Assert.assertNotNull(constantDescArray73);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0187");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0188");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Object[] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[]) objArray28, "hi!");
        java.lang.Object[] objArray32 = null;
        java.io.Serializable[][] serializableArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[][]) objArray28, "hi!", objArray32);
        java.io.Serializable serializable35 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable) "hi!", "hi!");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[[[]], [[]]]");
        org.junit.Assert.assertNotNull(serializableArray33);
        org.junit.Assert.assertEquals("'" + serializable35 + "' != '" + "hi!" + "'", serializable35, "hi!");
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0189");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 0.0d, (double) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and 35.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0190");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) ' ', (double) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 32.0 and 100.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0191");
        double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 100.0d, "");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0192");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.lang.CharSequence[][][] charSequenceArray6 = new java.lang.CharSequence[][][] { charSequenceArray2, charSequenceArray5 };
        java.lang.CharSequence[][][] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Class<?> wildcardClass9 = charSequenceArray6.getClass();
        java.lang.constant.Constable[] constableArray14 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray15 = new java.lang.constant.Constable[][] { constableArray14 };
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        java.lang.Object obj20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray19);
        java.lang.constant.Constable[][] constableArray21 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "hi!", objArray19);
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray26, "");
        java.io.Serializable[] serializableArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray21, "hi!", (java.lang.Object[]) constableArray28);
        java.lang.constant.Constable[][] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray21, "");
        java.lang.String[] strArray39 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray39, "hi!");
        java.lang.String[] strArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray41, "");
        java.lang.constant.Constable[][] constableArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray31, "", (java.lang.Object[]) strArray43);
        java.lang.Class<?> wildcardClass45 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(wildcardClass9, "hi!", (java.lang.Object[]) constableArray44);
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(constableArray14);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertArrayEquals(strArray39, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertArrayEquals(strArray41, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertArrayEquals(strArray43, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0193");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.Class<?> wildcardClass4 = objArray2.getClass();
        java.lang.constant.Constable constable6 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.Constable) wildcardClass4, "");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(constable6);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0194");
        java.lang.Object[][] objArray0 = null;
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Class<?> wildcardClass3 = obj2.getClass();
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray7.getClass();
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Class<?> wildcardClass12 = obj11.getClass();
        java.lang.reflect.Type[] typeArray13 = new java.lang.reflect.Type[] { wildcardClass3, wildcardClass10, wildcardClass12 };
        java.lang.reflect.Type[] typeArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray13, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray0, "hi!", (java.lang.Object[]) typeArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0195");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray1 };
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object obj7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray6);
        java.lang.Object[][] objArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray2, "hi!", objArray6);
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray21, "");
        java.lang.constant.ConstantDesc[] constantDescArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "", (java.lang.Object[]) constableArray21);
        java.lang.constant.ConstantDesc[] constantDescArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray16, "");
        java.io.Serializable[] serializableArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray2, "", (java.lang.Object[]) constantDescArray28);
        java.lang.Class<?> wildcardClass30 = constantDescArray28.getClass();
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0196");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (-1.0f), (double) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between -1.0 and 0.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0197");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.io.Serializable[][] serializableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray26, "");
        java.lang.Class<?> wildcardClass31 = objArray26.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(serializableArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0198");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, 0, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0199");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (short) 1, (long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0200");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) 1.0f, (double) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0201");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) '4', (double) 10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52.0 and 10.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0202");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (short) 1, 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 0.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0203");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) (short) 100, (int) (short) 100, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0204");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (short) 100, (long) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 100, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0205");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement10 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass8, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(annotatedElement10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0206");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 100, (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0207");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (-1.0f), (double) 100.0f, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0208");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) '4', (double) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52.0 and -1.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0209");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (byte) 100, (double) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100.0 and 1.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0210");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (-1), 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between -1 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0211");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (-1), (int) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0212");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 1L, 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0213");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), 10L, 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 0, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0214");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Object[] objArray10 = new java.lang.Object[] {};
        java.lang.Object obj11 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray10);
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray16, "");
        java.lang.Object[] objArray19 = new java.lang.Object[] { objArray10, 1, "" };
        java.lang.Object[][] objArray20 = new java.lang.Object[][] { objArray10 };
        java.lang.Object[] objArray23 = new java.lang.Object[] {};
        java.lang.Object obj24 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray23);
        java.lang.CharSequence[] charSequenceArray29 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray29, "");
        java.lang.Object[] objArray32 = new java.lang.Object[] { objArray23, 1, "" };
        java.lang.Object[][] objArray33 = new java.lang.Object[][] { objArray23 };
        java.lang.Object[][][] objArray34 = new java.lang.Object[][][] { objArray20, objArray33 };
        java.lang.Object[][][] objArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray34, "hi!");
        java.lang.CharSequence[] charSequenceArray43 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray45 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray43, "");
        java.io.Serializable[] serializableArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray34, "hi!", (java.lang.Object[]) charSequenceArray45);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) charSequenceArray3, (java.lang.Object) 100.0d, "hi!", (java.lang.Object[]) objArray34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertArrayEquals(objArray10, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + 'a' + "'", obj11, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertArrayEquals(objArray23, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj24 + "' != '" + 'a' + "'", obj24, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray32), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(serializableArray46);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0215");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) ' ', 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32 and 100, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0216");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray5, "");
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence[]) strArray7, "");
        java.lang.CharSequence[] charSequenceArray11 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray9, "hi!");
        java.lang.Object[] objArray13 = null;
        java.lang.Object obj14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) "hi!", "hi!", objArray13);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertArrayEquals(charSequenceArray9, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertArrayEquals(charSequenceArray11, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "hi!" + "'", obj14, "hi!");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0217");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) '#', (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 35 and 0, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0218");
        java.lang.constant.Constable[] constableArray1 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray6 = new java.lang.constant.Constable[][] { constableArray1, constableArray3, constableArray5 };
        java.lang.constant.Constable[] constableArray8 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray13 = new java.lang.constant.Constable[][] { constableArray8, constableArray10, constableArray12 };
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray15, constableArray17, constableArray19 };
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray27 = new java.lang.constant.Constable[][] { constableArray22, constableArray24, constableArray26 };
        java.lang.constant.Constable[][][] constableArray28 = new java.lang.constant.Constable[][][] { constableArray6, constableArray13, constableArray20, constableArray27 };
        java.lang.constant.Constable[][][] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.Object obj34 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray39, "");
        java.lang.Object[] objArray42 = new java.lang.Object[] { objArray33, 1, "" };
        java.lang.Object[][] objArray43 = new java.lang.Object[][] { objArray33 };
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        java.lang.Object obj47 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray52, "");
        java.lang.Object[] objArray55 = new java.lang.Object[] { objArray46, 1, "" };
        java.lang.Object[][] objArray56 = new java.lang.Object[][] { objArray46 };
        java.lang.Object[][][] objArray57 = new java.lang.Object[][][] { objArray43, objArray56 };
        java.lang.Object[][][] objArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray57, "hi!");
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray57, "");
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        java.lang.Object obj66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray65);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray71, "");
        java.lang.Object[] objArray74 = new java.lang.Object[] { objArray65, 1, "" };
        java.lang.Object[][] objArray75 = new java.lang.Object[][] { objArray65 };
        java.lang.Object[] objArray78 = new java.lang.Object[] {};
        java.lang.Object obj79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray78);
        java.lang.CharSequence[] charSequenceArray84 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray84, "");
        java.lang.Object[] objArray87 = new java.lang.Object[] { objArray78, 1, "" };
        java.lang.Object[][] objArray88 = new java.lang.Object[][] { objArray78 };
        java.lang.Object[][][] objArray89 = new java.lang.Object[][][] { objArray75, objArray88 };
        java.lang.Object[][][] objArray91 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray89, "hi!");
        java.io.Serializable[][] serializableArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray89, "");
        java.lang.Object[][] objArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[][]) serializableArray93, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray28, (java.lang.Object) objArray61, "hi!", (java.lang.Object[]) serializableArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 'a' + "'", obj34, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 'a' + "'", obj47, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertArrayEquals(objArray65, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 'a' + "'", obj66, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertArrayEquals(objArray78, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj79 + "' != '" + 'a' + "'", obj79, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray84);
        org.junit.Assert.assertNotNull(charSequenceArray86);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(serializableArray93);
        org.junit.Assert.assertNotNull(objArray95);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0219");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (short) 100, (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 10, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0220");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray61, "hi!");
        java.lang.constant.Constable[] constableArray68 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray68, "");
        java.lang.String[] strArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray63, "hi!", (java.lang.Object[]) constableArray70);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "", (java.lang.Object[]) strArray63);
        java.lang.constant.Constable[] constableArray78 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray79 = new java.lang.constant.Constable[][] { constableArray78 };
        java.lang.Object[] objArray83 = new java.lang.Object[] {};
        java.lang.Object obj84 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray83);
        java.lang.constant.Constable[][] constableArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray79, "hi!", objArray83);
        java.lang.constant.Constable[] constableArray90 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray90, "");
        java.io.Serializable[] serializableArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray85, "hi!", (java.lang.Object[]) constableArray92);
        java.lang.constant.Constable[][] constableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray85, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) genericDeclarationArray20, (java.lang.Object) (byte) 100, "", (java.lang.Object[]) constableArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(genericDeclarationArray72);
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(constableArray79);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertArrayEquals(objArray83, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 'a' + "'", obj84, 'a');
        org.junit.Assert.assertNotNull(constableArray85);
        org.junit.Assert.assertNotNull(constableArray90);
        org.junit.Assert.assertNotNull(constableArray92);
        org.junit.Assert.assertNotNull(serializableArray93);
        org.junit.Assert.assertNotNull(constableArray95);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0221");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 0, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0222");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 100L, (long) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0223");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray11 = new java.lang.constant.Constable[][] { constableArray10 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.constant.Constable[][] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "hi!", objArray15);
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray22, "");
        java.io.Serializable[] serializableArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray17, "hi!", (java.lang.Object[]) constableArray24);
        java.lang.constant.Constable[][] constableArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray17, "");
        java.lang.Class<?> wildcardClass28 = constableArray27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.reflect.Type[] typeArray31 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass28, wildcardClass30 };
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.lang.Object obj36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "");
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray35, 1, "" };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray35 };
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        java.lang.Object obj49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray48);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray54, "");
        java.lang.Object[] objArray57 = new java.lang.Object[] { objArray48, 1, "" };
        java.lang.Object[][] objArray58 = new java.lang.Object[][] { objArray48 };
        java.lang.Object[][][] objArray59 = new java.lang.Object[][][] { objArray45, objArray58 };
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray59, "hi!");
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray68, "");
        java.io.Serializable[] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray59, "hi!", (java.lang.Object[]) charSequenceArray70);
        java.lang.reflect.Type[] typeArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray31, "", (java.lang.Object[]) charSequenceArray70);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray76 = new java.lang.Object[][] { objArray75 };
        java.lang.Object[] objArray80 = new java.lang.Object[] {};
        java.lang.Object obj81 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray80);
        java.lang.Object[][] objArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray76, "hi!", objArray80);
        java.lang.reflect.Type[] typeArray83 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray72, "", objArray80);
        java.lang.Class<?> wildcardClass84 = typeArray72.getClass();
        java.lang.Class<?> wildcardClass86 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(wildcardClass84, "");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertArrayEquals(objArray48, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 'a' + "'", obj49, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(charSequenceArray68);
        org.junit.Assert.assertNotNull(charSequenceArray70);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertArrayEquals(objArray80, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 'a' + "'", obj81, 'a');
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(wildcardClass84);
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0224");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 0.0f, 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and 0.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0225");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) 'a', 10.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 97.0 and 10.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0226");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 100L, (long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0227");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][] strArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0228");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (short) 100, 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0229");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField8 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClassOfField8);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0230");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, 1, 100, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0231");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) (byte) 1, (-1.0d), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and -1.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0232");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.lang.CharSequence[][][] charSequenceArray6 = new java.lang.CharSequence[][][] { charSequenceArray2, charSequenceArray5 };
        java.lang.CharSequence[][][] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray15.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass18, wildcardClass20 };
        java.lang.reflect.Type[] typeArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray21, "");
        java.lang.constant.ConstantDesc[] constantDescArray31 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray36, "");
        java.lang.constant.ConstantDesc[] constantDescArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray31, "", (java.lang.Object[]) constableArray36);
        java.lang.reflect.Type[] typeArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray21, "hi!", (java.lang.Object[]) constableArray36);
        java.lang.Class<?> wildcardClass41 = constableArray36.getClass();
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray47 = new java.lang.constant.Constable[][] { constableArray46 };
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        java.lang.Object obj52 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray51);
        java.lang.constant.Constable[][] constableArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray47, "hi!", objArray51);
        java.lang.constant.Constable[] constableArray58 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray58, "");
        java.io.Serializable[] serializableArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray53, "hi!", (java.lang.Object[]) constableArray60);
        java.lang.reflect.AnnotatedElement annotatedElement62 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass41, "hi!", (java.lang.Object[]) constableArray60);
        java.lang.CharSequence[][][] charSequenceArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray6, "hi!", (java.lang.Object[]) constableArray60);
        java.lang.CharSequence[][][] charSequenceArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(constantDescArray31);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertArrayEquals(objArray51, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 'a' + "'", obj52, 'a');
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNotNull(constableArray58);
        org.junit.Assert.assertNotNull(constableArray60);
        org.junit.Assert.assertNotNull(serializableArray61);
        org.junit.Assert.assertNotNull(annotatedElement62);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(charSequenceArray65);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0233");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray6 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray4, "");
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray32 = new java.lang.String[][] { strArray11, strArray15, strArray19, strArray23, strArray27, strArray31 };
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        java.lang.Object obj37 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray36);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray42, "");
        java.lang.Object[] objArray45 = new java.lang.Object[] { objArray36, 1, "" };
        java.lang.Object[][] objArray46 = new java.lang.Object[][] { objArray36 };
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        java.lang.Object obj50 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray55, "");
        java.lang.Object[] objArray58 = new java.lang.Object[] { objArray49, 1, "" };
        java.lang.Object[][] objArray59 = new java.lang.Object[][] { objArray49 };
        java.lang.Object[][][] objArray60 = new java.lang.Object[][][] { objArray46, objArray59 };
        java.lang.Object[][][] objArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray60, "hi!");
        java.lang.Object[][][] objArray64 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray62, "");
        java.lang.String[] strArray71 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray71, "");
        java.lang.Object[][] objArray74 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray64, "", (java.lang.Object[]) strArray73);
        java.lang.String[][] strArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray32, "", (java.lang.Object[]) objArray74);
        java.lang.CharSequence[][] charSequenceArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.CharSequence[][]) strArray75, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) 1.0f, (java.lang.Object) charSequenceArray4, "", (java.lang.Object[]) strArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertArrayEquals(strArray27, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 'a' + "'", obj50, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertArrayEquals(strArray73, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(charSequenceArray77);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0234");
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray6, "hi!");
        java.lang.constant.Constable[] constableArray13 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray13, "");
        java.lang.String[] strArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray8, "hi!", (java.lang.Object[]) constableArray15);
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        java.lang.Object obj20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray19);
        java.lang.CharSequence[] charSequenceArray25 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray25, "");
        java.lang.Object[] objArray28 = new java.lang.Object[] { objArray19, 1, "" };
        java.lang.Object[][] objArray29 = new java.lang.Object[][] { objArray19 };
        java.lang.Object[] objArray32 = new java.lang.Object[] {};
        java.lang.Object obj33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray32);
        java.lang.CharSequence[] charSequenceArray38 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray38, "");
        java.lang.Object[] objArray41 = new java.lang.Object[] { objArray32, 1, "" };
        java.lang.Object[][] objArray42 = new java.lang.Object[][] { objArray32 };
        java.lang.Object[][][] objArray43 = new java.lang.Object[][][] { objArray29, objArray42 };
        java.lang.Object[][][] objArray45 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray43, "hi!");
        java.lang.Object[][][] objArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray43, "");
        java.lang.String[] strArray55 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray55, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray55, "");
        java.lang.constant.Constable[] constableArray64 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray65 = new java.lang.constant.Constable[][] { constableArray64 };
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        java.lang.Object obj70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray69);
        java.lang.constant.Constable[][] constableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "hi!", objArray69);
        java.lang.constant.Constable[] constableArray76 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray76, "");
        java.io.Serializable[] serializableArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray71, "hi!", (java.lang.Object[]) constableArray78);
        java.lang.constant.Constable[][] constableArray81 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray71, "");
        java.lang.Object[] objArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[]) strArray55, "", (java.lang.Object[]) constableArray81);
        java.lang.CharSequence[] charSequenceArray84 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence[]) strArray55, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray15, (java.lang.Object) objArray47, "hi!", (java.lang.Object[]) strArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertArrayEquals(objArray19, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj20 + "' != '" + 'a' + "'", obj20, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertArrayEquals(objArray32, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj33 + "' != '" + 'a' + "'", obj33, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray41), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertArrayEquals(strArray55, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertArrayEquals(strArray57, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray59);
        org.junit.Assert.assertArrayEquals(constantDescArray59, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertArrayEquals(objArray69, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj70 + "' != '" + 'a' + "'", obj70, 'a');
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertNotNull(constableArray81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertArrayEquals(objArray82, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(charSequenceArray84);
        org.junit.Assert.assertArrayEquals(charSequenceArray84, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0235");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray11 = new java.lang.constant.Constable[][] { constableArray10 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.constant.Constable[][] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "hi!", objArray15);
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray22, "");
        java.io.Serializable[] serializableArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray17, "hi!", (java.lang.Object[]) constableArray24);
        java.lang.constant.Constable[][] constableArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray17, "");
        java.lang.Class<?> wildcardClass28 = constableArray27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.reflect.Type[] typeArray31 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass28, wildcardClass30 };
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.lang.Object obj36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "");
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray35, 1, "" };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray35 };
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        java.lang.Object obj49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray48);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray54, "");
        java.lang.Object[] objArray57 = new java.lang.Object[] { objArray48, 1, "" };
        java.lang.Object[][] objArray58 = new java.lang.Object[][] { objArray48 };
        java.lang.Object[][][] objArray59 = new java.lang.Object[][][] { objArray45, objArray58 };
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray59, "hi!");
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray68, "");
        java.io.Serializable[] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray59, "hi!", (java.lang.Object[]) charSequenceArray70);
        java.lang.reflect.Type[] typeArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray31, "", (java.lang.Object[]) charSequenceArray70);
        java.lang.Class<?> wildcardClass73 = charSequenceArray70.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertArrayEquals(objArray48, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 'a' + "'", obj49, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(charSequenceArray68);
        org.junit.Assert.assertNotNull(charSequenceArray70);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(wildcardClass73);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0236");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (byte) -1, (int) (short) 10, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0237");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray61, "hi!");
        java.lang.constant.Constable[] constableArray68 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray68, "");
        java.lang.String[] strArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray63, "hi!", (java.lang.Object[]) constableArray70);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "", (java.lang.Object[]) strArray63);
        java.lang.constant.ConstantDesc[] constantDescArray80 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray85 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray87 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray85, "");
        java.lang.constant.ConstantDesc[] constantDescArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray80, "", (java.lang.Object[]) constableArray85);
        java.lang.constant.ConstantDesc[] constantDescArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray88, "");
        java.lang.Comparable<java.lang.String>[] strComparableArray91 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray63, "", (java.lang.Object[]) constantDescArray90);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(genericDeclarationArray72);
        org.junit.Assert.assertNotNull(constantDescArray80);
        org.junit.Assert.assertNotNull(constableArray85);
        org.junit.Assert.assertNotNull(constableArray87);
        org.junit.Assert.assertNotNull(constantDescArray88);
        org.junit.Assert.assertNotNull(constantDescArray90);
        org.junit.Assert.assertNotNull(strComparableArray91);
        org.junit.Assert.assertArrayEquals(strComparableArray91, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0238");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) 10, (long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0239");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] { charSequenceArray0 };
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] { charSequenceArray8 };
        java.lang.CharSequence[][][] charSequenceArray10 = new java.lang.CharSequence[][][] { charSequenceArray1, charSequenceArray3, charSequenceArray5, charSequenceArray7, charSequenceArray9 };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] { charSequenceArray11 };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] { charSequenceArray13 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] { charSequenceArray15 };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] { charSequenceArray17 };
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] { charSequenceArray19 };
        java.lang.CharSequence[][][] charSequenceArray21 = new java.lang.CharSequence[][][] { charSequenceArray12, charSequenceArray14, charSequenceArray16, charSequenceArray18, charSequenceArray20 };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] { charSequenceArray22 };
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] { charSequenceArray24 };
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] { charSequenceArray26 };
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray29 = new java.lang.CharSequence[][] { charSequenceArray28 };
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] { charSequenceArray30 };
        java.lang.CharSequence[][][] charSequenceArray32 = new java.lang.CharSequence[][][] { charSequenceArray23, charSequenceArray25, charSequenceArray27, charSequenceArray29, charSequenceArray31 };
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] { charSequenceArray33 };
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray36 = new java.lang.CharSequence[][] { charSequenceArray35 };
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray38 = new java.lang.CharSequence[][] { charSequenceArray37 };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] { charSequenceArray39 };
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] { charSequenceArray41 };
        java.lang.CharSequence[][][] charSequenceArray43 = new java.lang.CharSequence[][][] { charSequenceArray34, charSequenceArray36, charSequenceArray38, charSequenceArray40, charSequenceArray42 };
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray45 = new java.lang.CharSequence[][] { charSequenceArray44 };
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] { charSequenceArray46 };
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray49 = new java.lang.CharSequence[][] { charSequenceArray48 };
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray51 = new java.lang.CharSequence[][] { charSequenceArray50 };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray53 = new java.lang.CharSequence[][] { charSequenceArray52 };
        java.lang.CharSequence[][][] charSequenceArray54 = new java.lang.CharSequence[][][] { charSequenceArray45, charSequenceArray47, charSequenceArray49, charSequenceArray51, charSequenceArray53 };
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray56 = new java.lang.CharSequence[][] { charSequenceArray55 };
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray58 = new java.lang.CharSequence[][] { charSequenceArray57 };
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] { charSequenceArray59 };
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray62 = new java.lang.CharSequence[][] { charSequenceArray61 };
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray64 = new java.lang.CharSequence[][] { charSequenceArray63 };
        java.lang.CharSequence[][][] charSequenceArray65 = new java.lang.CharSequence[][][] { charSequenceArray56, charSequenceArray58, charSequenceArray60, charSequenceArray62, charSequenceArray64 };
        java.lang.CharSequence[][][][] charSequenceArray66 = new java.lang.CharSequence[][][][] { charSequenceArray10, charSequenceArray21, charSequenceArray32, charSequenceArray43, charSequenceArray54, charSequenceArray65 };
        java.lang.constant.Constable[] constableArray71 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray72 = new java.lang.constant.Constable[][] { constableArray71 };
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        java.lang.Object obj77 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray76);
        java.lang.constant.Constable[][] constableArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray72, "hi!", objArray76);
        java.lang.constant.Constable[] constableArray83 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray83, "");
        java.io.Serializable[] serializableArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray78, "hi!", (java.lang.Object[]) constableArray85);
        java.lang.constant.Constable[][] constableArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray78, "");
        java.lang.CharSequence[][][][] charSequenceArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray66, "hi!", (java.lang.Object[]) constableArray88);
        java.lang.Class<?> wildcardClass90 = charSequenceArray89.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertArrayEquals(charSequenceArray2, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertArrayEquals(charSequenceArray4, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertArrayEquals(charSequenceArray6, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertArrayEquals(charSequenceArray8, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertArrayEquals(charSequenceArray11, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertArrayEquals(charSequenceArray13, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertArrayEquals(charSequenceArray15, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertArrayEquals(charSequenceArray17, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertArrayEquals(charSequenceArray19, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertArrayEquals(charSequenceArray22, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertArrayEquals(charSequenceArray24, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertArrayEquals(charSequenceArray26, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertArrayEquals(charSequenceArray28, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertArrayEquals(charSequenceArray30, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertArrayEquals(charSequenceArray33, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertArrayEquals(charSequenceArray35, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertArrayEquals(charSequenceArray37, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertArrayEquals(charSequenceArray39, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertArrayEquals(charSequenceArray41, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertArrayEquals(charSequenceArray44, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertArrayEquals(charSequenceArray46, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertArrayEquals(charSequenceArray48, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertArrayEquals(charSequenceArray50, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertArrayEquals(charSequenceArray52, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertArrayEquals(charSequenceArray55, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertArrayEquals(charSequenceArray57, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertArrayEquals(charSequenceArray59, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertArrayEquals(charSequenceArray61, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertArrayEquals(charSequenceArray63, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertNotNull(charSequenceArray65);
        org.junit.Assert.assertNotNull(charSequenceArray66);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray72);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertArrayEquals(objArray76, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 'a' + "'", obj77, 'a');
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(constableArray83);
        org.junit.Assert.assertNotNull(constableArray85);
        org.junit.Assert.assertNotNull(serializableArray86);
        org.junit.Assert.assertNotNull(constableArray88);
        org.junit.Assert.assertNotNull(charSequenceArray89);
        org.junit.Assert.assertNotNull(wildcardClass90);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0240");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) 1.0f, (double) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 97.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0241");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, 100, (int) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0242");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) ' ', 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0243");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (-1.0d), (double) 100.0f, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0244");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (short) 0, (int) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0245");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, 0.0d, (double) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0.0 and 0.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0246");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 0, (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 97, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0247");
        java.lang.CharSequence[][][] charSequenceArray0 = new java.lang.CharSequence[][][] {};
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray9.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray11 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10 };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray17, "");
        java.lang.Class<?> wildcardClass20 = charSequenceArray19.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray21 = new java.lang.reflect.GenericDeclaration[] { wildcardClass20 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray22 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray11, genericDeclarationArray21 };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray30 = new java.lang.constant.Constable[][] { constableArray25, constableArray27, constableArray29 };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray37 = new java.lang.constant.Constable[][] { constableArray32, constableArray34, constableArray36 };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray43 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray44 = new java.lang.constant.Constable[][] { constableArray39, constableArray41, constableArray43 };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray50 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray51 = new java.lang.constant.Constable[][] { constableArray46, constableArray48, constableArray50 };
        java.lang.constant.Constable[][][] constableArray52 = new java.lang.constant.Constable[][][] { constableArray30, constableArray37, constableArray44, constableArray51 };
        java.lang.constant.Constable[][][] constableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray52, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray22, "hi!", (java.lang.Object[]) constableArray52);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray22, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray22, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][][] charSequenceArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray0, "hi!", (java.lang.Object[]) genericDeclarationArray59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(genericDeclarationArray11);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(genericDeclarationArray21);
        org.junit.Assert.assertNotNull(genericDeclarationArray22);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray51);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(genericDeclarationArray55);
        org.junit.Assert.assertNotNull(annotatedElementArray57);
        org.junit.Assert.assertNotNull(genericDeclarationArray59);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0248");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 100, (int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0249");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (short) 1, (double) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 97.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0250");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 10L, (double) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and 100.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0251");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray21 = new java.lang.Object[][] { objArray20 };
        java.lang.Object[] objArray25 = new java.lang.Object[] {};
        java.lang.Object obj26 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray25);
        java.lang.Object[][] objArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray21, "hi!", objArray25);
        java.lang.Comparable<java.lang.String> strComparable28 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) objArray27);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray11, (java.lang.Object) (short) -1, "hi!", (java.lang.Object[]) objArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertArrayEquals(objArray25, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 'a' + "'", obj26, 'a');
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals("'" + strComparable28 + "' != '" + "hi!" + "'", strComparable28, "hi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0252");
        java.lang.constant.ConstantDesc constantDesc2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) 10.0d, "hi!");
        org.junit.Assert.assertEquals("'" + constantDesc2 + "' != '" + 10.0d + "'", constantDesc2, 10.0d);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0253");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, 1L, 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 0, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0254");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) (short) 0, 100.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0255");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 1, (double) (short) 1, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0256");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19, strArray23 };
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.lang.Object obj29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray34, "");
        java.lang.Object[] objArray37 = new java.lang.Object[] { objArray28, 1, "" };
        java.lang.Object[][] objArray38 = new java.lang.Object[][] { objArray28 };
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.Object obj42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray47, "");
        java.lang.Object[] objArray50 = new java.lang.Object[] { objArray41, 1, "" };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray41 };
        java.lang.Object[][][] objArray52 = new java.lang.Object[][][] { objArray38, objArray51 };
        java.lang.Object[][][] objArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray52, "hi!");
        java.lang.Object[][][] objArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray54, "");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray63, "");
        java.lang.Object[][] objArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray56, "", (java.lang.Object[]) strArray65);
        java.lang.String[][] strArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray24, "", (java.lang.Object[]) objArray66);
        java.lang.CharSequence[][] charSequenceArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.CharSequence[][]) strArray67, "");
        java.lang.Class<?> wildcardClass70 = strArray67.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 'a' + "'", obj29, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(charSequenceArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0257");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 0, (int) '#', "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0258");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.constant.ConstantDesc[] constantDescArray81 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray86 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray86, "");
        java.lang.constant.ConstantDesc[] constantDescArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray81, "", (java.lang.Object[]) constableArray86);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray71, "hi!", (java.lang.Object[]) constantDescArray81);
        java.lang.constant.Constable[] constableArray95 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray95, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray98 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "hi!", (java.lang.Object[]) constableArray97);
        java.lang.Class<?> wildcardClass99 = genericDeclarationArray98.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(constantDescArray81);
        org.junit.Assert.assertNotNull(constableArray86);
        org.junit.Assert.assertNotNull(constableArray88);
        org.junit.Assert.assertNotNull(constantDescArray89);
        org.junit.Assert.assertNotNull(annotatedElementArray90);
        org.junit.Assert.assertNotNull(constableArray95);
        org.junit.Assert.assertNotNull(constableArray97);
        org.junit.Assert.assertNotNull(genericDeclarationArray98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0259");
        double double2 = dev.langchain4j.internal.ValidationUtils.ensureGreaterThanZero((java.lang.Double) 100.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0260");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray8, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray8, "");
        java.lang.CharSequence charSequence13 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray8);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray8, "");
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray20.getClass();
        java.lang.Object[] objArray26 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray27 = new java.lang.Object[][] { objArray26 };
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Object obj32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray31);
        java.lang.Object[][] objArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray27, "hi!", objArray31);
        java.lang.constant.ConstantDesc[] constantDescArray41 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray46, "");
        java.lang.constant.ConstantDesc[] constantDescArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray41, "", (java.lang.Object[]) constableArray46);
        java.lang.constant.ConstantDesc[] constantDescArray51 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray41, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray41, "");
        java.io.Serializable[] serializableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray27, "", (java.lang.Object[]) constantDescArray53);
        java.lang.reflect.Type type55 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass23, "hi!", (java.lang.Object[]) constantDescArray53);
        java.lang.Object obj56 = new java.lang.Object();
        java.lang.Class<?> wildcardClass57 = obj56.getClass();
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray61, "");
        java.lang.Class<?> wildcardClass64 = charSequenceArray61.getClass();
        java.lang.Object obj65 = new java.lang.Object();
        java.lang.Class<?> wildcardClass66 = obj65.getClass();
        java.lang.reflect.Type[] typeArray67 = new java.lang.reflect.Type[] { wildcardClass57, wildcardClass64, wildcardClass66 };
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray67, "");
        java.lang.constant.ConstantDesc[] constantDescArray77 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray82 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray84 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray82, "");
        java.lang.constant.ConstantDesc[] constantDescArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray77, "", (java.lang.Object[]) constableArray82);
        java.lang.reflect.Type[] typeArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray67, "hi!", (java.lang.Object[]) constableArray82);
        java.lang.Class<?> wildcardClass87 = constableArray82.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray88 = new java.lang.reflect.GenericDeclaration[] { wildcardClass23, wildcardClass87 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray88, "");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray90, "");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray94 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(annotatedElementArray92, "");
        java.lang.Comparable<java.lang.String>[] strComparableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Comparable<java.lang.String>[]) strArray8, "", (java.lang.Object[]) annotatedElementArray94);
        java.lang.Class<?> wildcardClass96 = strComparableArray95.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertArrayEquals(constantDescArray12, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(constantDescArray41);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constantDescArray49);
        org.junit.Assert.assertNotNull(constantDescArray51);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertNotNull(serializableArray54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(wildcardClass64);
        org.junit.Assert.assertNotNull(wildcardClass66);
        org.junit.Assert.assertNotNull(typeArray67);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(constantDescArray77);
        org.junit.Assert.assertNotNull(constableArray82);
        org.junit.Assert.assertNotNull(constableArray84);
        org.junit.Assert.assertNotNull(constantDescArray85);
        org.junit.Assert.assertNotNull(typeArray86);
        org.junit.Assert.assertNotNull(wildcardClass87);
        org.junit.Assert.assertNotNull(genericDeclarationArray88);
        org.junit.Assert.assertNotNull(genericDeclarationArray90);
        org.junit.Assert.assertNotNull(annotatedElementArray92);
        org.junit.Assert.assertNotNull(annotatedElementArray94);
        org.junit.Assert.assertNotNull(strComparableArray95);
        org.junit.Assert.assertArrayEquals(strComparableArray95, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0261");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 1, (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 97, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0262");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) 100, (long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0263");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) '4', (double) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52.0 and 1.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0264");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) (byte) 100, (double) 100.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 100.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0265");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray1 };
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object obj7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray6);
        java.lang.Object[][] objArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray2, "hi!", objArray6);
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray21, "");
        java.lang.constant.ConstantDesc[] constantDescArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "", (java.lang.Object[]) constableArray21);
        java.lang.constant.ConstantDesc[] constantDescArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray16, "");
        java.io.Serializable[] serializableArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray2, "", (java.lang.Object[]) constantDescArray28);
        java.lang.Object[] objArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[]) constantDescArray28, "");
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[-1.0, 100.0, 10.0, 1, 100, 1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[-1.0, 100.0, 10.0, 1, 100, 1.0]");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0266");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (byte) 1, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0267");
        java.lang.String str2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull("", "hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0268");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, 10, (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 10, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0269");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 1, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0270");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) (byte) 10, 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and 0.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0271");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 1.0d, (double) 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 0.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0272");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, 10L, (long) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0273");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.Class<?> wildcardClass74 = genericDeclarationArray71.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0274");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.lang.CharSequence[][][] charSequenceArray6 = new java.lang.CharSequence[][][] { charSequenceArray2, charSequenceArray5 };
        java.lang.CharSequence[][][] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Object obj10 = new java.lang.Object();
        java.lang.Class<?> wildcardClass11 = obj10.getClass();
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray15.getClass();
        java.lang.Object obj19 = new java.lang.Object();
        java.lang.Class<?> wildcardClass20 = obj19.getClass();
        java.lang.reflect.Type[] typeArray21 = new java.lang.reflect.Type[] { wildcardClass11, wildcardClass18, wildcardClass20 };
        java.lang.reflect.Type[] typeArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray21, "");
        java.lang.constant.ConstantDesc[] constantDescArray31 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray36, "");
        java.lang.constant.ConstantDesc[] constantDescArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray31, "", (java.lang.Object[]) constableArray36);
        java.lang.reflect.Type[] typeArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray21, "hi!", (java.lang.Object[]) constableArray36);
        java.lang.Class<?> wildcardClass41 = constableArray36.getClass();
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray47 = new java.lang.constant.Constable[][] { constableArray46 };
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        java.lang.Object obj52 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray51);
        java.lang.constant.Constable[][] constableArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray47, "hi!", objArray51);
        java.lang.constant.Constable[] constableArray58 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray58, "");
        java.io.Serializable[] serializableArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray53, "hi!", (java.lang.Object[]) constableArray60);
        java.lang.reflect.AnnotatedElement annotatedElement62 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass41, "hi!", (java.lang.Object[]) constableArray60);
        java.lang.CharSequence[][][] charSequenceArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray6, "hi!", (java.lang.Object[]) constableArray60);
        java.lang.Class<?> wildcardClass64 = charSequenceArray6.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(typeArray23);
        org.junit.Assert.assertNotNull(constantDescArray31);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertArrayEquals(objArray51, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 'a' + "'", obj52, 'a');
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNotNull(constableArray58);
        org.junit.Assert.assertNotNull(constableArray60);
        org.junit.Assert.assertNotNull(serializableArray61);
        org.junit.Assert.assertNotNull(annotatedElement62);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0275");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) (short) -1, (int) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between -1 and 10, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0276");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 100L, (double) 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 0.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0277");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, 10, (int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0278");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][] strArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0279");
        java.lang.Object[] objArray1 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray2 = new java.lang.Object[][] { objArray1 };
        java.lang.Object[] objArray6 = new java.lang.Object[] {};
        java.lang.Object obj7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray6);
        java.lang.Object[][] objArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray2, "hi!", objArray6);
        java.lang.constant.ConstantDesc[] constantDescArray16 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray21, "");
        java.lang.constant.ConstantDesc[] constantDescArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "", (java.lang.Object[]) constableArray21);
        java.lang.constant.ConstantDesc[] constantDescArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray16, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray16, "");
        java.io.Serializable[] serializableArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray2, "", (java.lang.Object[]) constantDescArray28);
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray41, "");
        java.lang.constant.ConstantDesc[] constantDescArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray36, "", (java.lang.Object[]) constableArray41);
        java.lang.constant.ConstantDesc[] constantDescArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray36, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray36, "hi!");
        java.lang.constant.Constable[] constableArray53 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray55 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray57 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray58 = new java.lang.constant.Constable[][] { constableArray53, constableArray55, constableArray57 };
        java.lang.constant.Constable[] constableArray60 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray64 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray65 = new java.lang.constant.Constable[][] { constableArray60, constableArray62, constableArray64 };
        java.lang.constant.Constable[] constableArray67 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray71 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray72 = new java.lang.constant.Constable[][] { constableArray67, constableArray69, constableArray71 };
        java.lang.constant.Constable[] constableArray74 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray76 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray78 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray79 = new java.lang.constant.Constable[][] { constableArray74, constableArray76, constableArray78 };
        java.lang.constant.Constable[][][] constableArray80 = new java.lang.constant.Constable[][][] { constableArray58, constableArray65, constableArray72, constableArray79 };
        java.lang.constant.Constable[][][] constableArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray80, "");
        java.lang.constant.Constable[][][] constableArray84 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray80, "hi!");
        java.lang.Object[][][] objArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[][][]) constableArray80, "hi!");
        java.lang.String str87 = dev.langchain4j.internal.ValidationUtils.ensureNotNull("", "", (java.lang.Object[]) objArray86);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) objArray2, (java.lang.Object) "hi!", "hi!", (java.lang.Object[]) objArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray1), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray1), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertArrayEquals(objArray6, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj7 + "' != '" + 'a' + "'", obj7, 'a');
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constantDescArray26);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(serializableArray29);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertNotNull(constantDescArray48);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNotNull(constableArray55);
        org.junit.Assert.assertNotNull(constableArray57);
        org.junit.Assert.assertNotNull(constableArray58);
        org.junit.Assert.assertNotNull(constableArray60);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray72);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(constableArray79);
        org.junit.Assert.assertNotNull(constableArray80);
        org.junit.Assert.assertNotNull(constableArray82);
        org.junit.Assert.assertNotNull(constableArray84);
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0280");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, 0L, 1L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0 and 1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0281");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = new java.io.Serializable[][][] { serializableArray5 };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray14, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray14, "");
        java.io.Serializable[][][] serializableArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray6, "", (java.lang.Object[]) constantDescArray18);
        java.lang.Class<?> wildcardClass20 = serializableArray6.getClass();
        org.junit.Assert.assertNotNull(serializableArray0);
        org.junit.Assert.assertArrayEquals(serializableArray0, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray1);
        org.junit.Assert.assertArrayEquals(serializableArray1, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray2);
        org.junit.Assert.assertArrayEquals(serializableArray2, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray3);
        org.junit.Assert.assertArrayEquals(serializableArray3, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray4);
        org.junit.Assert.assertArrayEquals(serializableArray4, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertArrayEquals(constantDescArray18, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(serializableArray19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0282");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (byte) 1, 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0283");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (-1L), (long) 1, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0284");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) 10, (-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and -1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0285");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0286");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (byte) 0, (double) 0, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0287");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) (byte) 1, (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 0, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0288");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray41, "");
        java.lang.constant.ConstantDesc[] constantDescArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray36, "", (java.lang.Object[]) constableArray41);
        java.lang.constant.ConstantDesc[] constantDescArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray44, "hi!");
        java.lang.Object[][] objArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray26, "hi!", (java.lang.Object[]) constantDescArray46);
        java.io.Serializable[][] serializableArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray26, "");
        java.lang.Object[] objArray52 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray53 = new java.lang.Object[][] { objArray52 };
        java.lang.Object[] objArray57 = new java.lang.Object[] {};
        java.lang.Object obj58 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray57);
        java.lang.Object[][] objArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray53, "hi!", objArray57);
        java.lang.constant.ConstantDesc[] constantDescArray67 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray72 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray74 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray72, "");
        java.lang.constant.ConstantDesc[] constantDescArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray67, "", (java.lang.Object[]) constableArray72);
        java.lang.constant.ConstantDesc[] constantDescArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray67, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray67, "");
        java.io.Serializable[] serializableArray80 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray53, "", (java.lang.Object[]) constantDescArray79);
        java.io.Serializable[] serializableArray81 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray26, "", (java.lang.Object[]) serializableArray80);
        java.lang.Class<?> wildcardClass82 = serializableArray81.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(serializableArray49);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray52), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertArrayEquals(objArray57, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 'a' + "'", obj58, 'a');
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertNotNull(constableArray72);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constantDescArray75);
        org.junit.Assert.assertNotNull(constantDescArray77);
        org.junit.Assert.assertNotNull(constantDescArray79);
        org.junit.Assert.assertNotNull(serializableArray80);
        org.junit.Assert.assertNotNull(serializableArray81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0289");
        java.lang.constant.ConstantDesc constantDesc2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) 0L, "");
        org.junit.Assert.assertEquals("'" + constantDesc2 + "' != '" + 0L + "'", constantDesc2, 0L);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0290");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (short) 0, 0.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and 0.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0291");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (byte) 10, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 10, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0292");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, 0, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 1, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0293");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), 0, 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0294");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) '4', (-1L), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and -1, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0295");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray1 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.lang.CharSequence[][][] charSequenceArray6 = new java.lang.CharSequence[][][] { charSequenceArray2, charSequenceArray5 };
        java.lang.CharSequence[][][] charSequenceArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray6, "");
        java.lang.Class<?> wildcardClass9 = charSequenceArray6.getClass();
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField11 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass9, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClassOfField11);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0296");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) 10, (double) 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and 0.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0297");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 1, (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0298");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.constant.Constable[][] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray10, "");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray28, "hi!");
        java.lang.String[] strArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray30, "");
        java.lang.constant.Constable[][] constableArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray20, "", (java.lang.Object[]) strArray32);
        java.lang.Class<?> wildcardClass34 = constableArray20.getClass();
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0299");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 10, (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0300");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (-1), (int) '4', "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0301");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray11 = new java.lang.constant.Constable[][] { constableArray10 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.constant.Constable[][] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "hi!", objArray15);
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray22, "");
        java.io.Serializable[] serializableArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray17, "hi!", (java.lang.Object[]) constableArray24);
        java.lang.constant.Constable[][] constableArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray17, "");
        java.lang.Class<?> wildcardClass28 = constableArray27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.reflect.Type[] typeArray31 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass28, wildcardClass30 };
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.lang.Object obj36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "");
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray35, 1, "" };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray35 };
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        java.lang.Object obj49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray48);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray54, "");
        java.lang.Object[] objArray57 = new java.lang.Object[] { objArray48, 1, "" };
        java.lang.Object[][] objArray58 = new java.lang.Object[][] { objArray48 };
        java.lang.Object[][][] objArray59 = new java.lang.Object[][][] { objArray45, objArray58 };
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray59, "hi!");
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray68, "");
        java.io.Serializable[] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray59, "hi!", (java.lang.Object[]) charSequenceArray70);
        java.lang.reflect.Type[] typeArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray31, "", (java.lang.Object[]) charSequenceArray70);
        java.lang.Object[] objArray75 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray76 = new java.lang.Object[][] { objArray75 };
        java.lang.Object[] objArray80 = new java.lang.Object[] {};
        java.lang.Object obj81 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray80);
        java.lang.Object[][] objArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray76, "hi!", objArray80);
        java.lang.reflect.Type[] typeArray83 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray72, "", objArray80);
        java.lang.Class<?> wildcardClass84 = typeArray83.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertArrayEquals(objArray48, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 'a' + "'", obj49, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(charSequenceArray68);
        org.junit.Assert.assertNotNull(charSequenceArray70);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertArrayEquals(objArray80, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj81 + "' != '" + 'a' + "'", obj81, 'a');
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertNotNull(typeArray83);
        org.junit.Assert.assertNotNull(wildcardClass84);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0302");
        java.io.Serializable[] serializableArray0 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray1 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray2 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray3 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray4 = new java.io.Serializable[] {};
        java.io.Serializable[][] serializableArray5 = new java.io.Serializable[][] { serializableArray0, serializableArray1, serializableArray2, serializableArray3, serializableArray4 };
        java.io.Serializable[][][] serializableArray6 = new java.io.Serializable[][][] { serializableArray5 };
        java.lang.String[] strArray14 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray14, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray14, "");
        java.io.Serializable[][][] serializableArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray6, "", (java.lang.Object[]) constantDescArray18);
        java.io.Serializable[][] serializableArray21 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) serializableArray6, "hi!");
        java.lang.CharSequence[] charSequenceArray23 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray24 = new java.lang.CharSequence[][] { charSequenceArray23 };
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "hi!" };
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] { charSequenceArray26 };
        java.lang.CharSequence[][][] charSequenceArray28 = new java.lang.CharSequence[][][] { charSequenceArray24, charSequenceArray27 };
        java.lang.CharSequence[][][] charSequenceArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray28, "");
        java.lang.Object obj32 = new java.lang.Object();
        java.lang.Class<?> wildcardClass33 = obj32.getClass();
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray37, "");
        java.lang.Class<?> wildcardClass40 = charSequenceArray37.getClass();
        java.lang.Object obj41 = new java.lang.Object();
        java.lang.Class<?> wildcardClass42 = obj41.getClass();
        java.lang.reflect.Type[] typeArray43 = new java.lang.reflect.Type[] { wildcardClass33, wildcardClass40, wildcardClass42 };
        java.lang.reflect.Type[] typeArray45 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray43, "");
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray58 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray58, "");
        java.lang.constant.ConstantDesc[] constantDescArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray53, "", (java.lang.Object[]) constableArray58);
        java.lang.reflect.Type[] typeArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray43, "hi!", (java.lang.Object[]) constableArray58);
        java.lang.Class<?> wildcardClass63 = constableArray58.getClass();
        java.lang.constant.Constable[] constableArray68 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray69 = new java.lang.constant.Constable[][] { constableArray68 };
        java.lang.Object[] objArray73 = new java.lang.Object[] {};
        java.lang.Object obj74 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray73);
        java.lang.constant.Constable[][] constableArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray69, "hi!", objArray73);
        java.lang.constant.Constable[] constableArray80 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray80, "");
        java.io.Serializable[] serializableArray83 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray75, "hi!", (java.lang.Object[]) constableArray82);
        java.lang.reflect.AnnotatedElement annotatedElement84 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass63, "hi!", (java.lang.Object[]) constableArray82);
        java.lang.CharSequence[][][] charSequenceArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray28, "hi!", (java.lang.Object[]) constableArray82);
        java.lang.String[] strArray93 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray93, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray93, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) serializableArray21, (java.lang.Object) constableArray82, "hi!", (java.lang.Object[]) constantDescArray97);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(serializableArray0);
        org.junit.Assert.assertArrayEquals(serializableArray0, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray1);
        org.junit.Assert.assertArrayEquals(serializableArray1, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray2);
        org.junit.Assert.assertArrayEquals(serializableArray2, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray3);
        org.junit.Assert.assertArrayEquals(serializableArray3, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray4);
        org.junit.Assert.assertArrayEquals(serializableArray4, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray5);
        org.junit.Assert.assertNotNull(serializableArray6);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertArrayEquals(strArray16, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertArrayEquals(constantDescArray18, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(serializableArray19);
        org.junit.Assert.assertNotNull(serializableArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(wildcardClass42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(typeArray45);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertNotNull(constableArray58);
        org.junit.Assert.assertNotNull(constableArray60);
        org.junit.Assert.assertNotNull(constantDescArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertArrayEquals(objArray73, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + 'a' + "'", obj74, 'a');
        org.junit.Assert.assertNotNull(constableArray75);
        org.junit.Assert.assertNotNull(constableArray80);
        org.junit.Assert.assertNotNull(constableArray82);
        org.junit.Assert.assertNotNull(serializableArray83);
        org.junit.Assert.assertNotNull(annotatedElement84);
        org.junit.Assert.assertNotNull(charSequenceArray85);
        org.junit.Assert.assertNotNull(strArray93);
        org.junit.Assert.assertArrayEquals(strArray93, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray95);
        org.junit.Assert.assertArrayEquals(strArray95, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray97);
        org.junit.Assert.assertArrayEquals(constantDescArray97, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0303");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) 100, (long) (-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0304");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) ' ', (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 32 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0305");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (-1L), (long) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0306");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray73, "hi!");
        java.lang.Class<?> wildcardClass76 = genericDeclarationArray73.getClass();
        java.lang.Object[] objArray78 = null;
        java.lang.constant.Constable constable79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.Constable) wildcardClass76, "", objArray78);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(genericDeclarationArray75);
        org.junit.Assert.assertNotNull(wildcardClass76);
        org.junit.Assert.assertNotNull(constable79);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0307");
        java.lang.Object obj0 = null;
        java.lang.constant.ConstantDesc[] constantDescArray9 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray14 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray14, "");
        java.lang.constant.ConstantDesc[] constantDescArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray9, "", (java.lang.Object[]) constableArray14);
        java.lang.CharSequence charSequence18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence) "", "", (java.lang.Object[]) constableArray14);
        java.io.Serializable[] serializableArray20 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray21 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray22 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray23 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray24 = new java.io.Serializable[] {};
        java.io.Serializable[][] serializableArray25 = new java.io.Serializable[][] { serializableArray20, serializableArray21, serializableArray22, serializableArray23, serializableArray24 };
        java.io.Serializable[][][] serializableArray26 = new java.io.Serializable[][][] { serializableArray25 };
        java.lang.String[] strArray34 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray34, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray34, "");
        java.io.Serializable[][][] serializableArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray26, "", (java.lang.Object[]) constantDescArray38);
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq(obj0, (java.lang.Object) charSequence18, "", (java.lang.Object[]) serializableArray39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray9);
        org.junit.Assert.assertNotNull(constableArray14);
        org.junit.Assert.assertNotNull(constableArray16);
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertEquals("'" + charSequence18 + "' != '" + "" + "'", charSequence18, "");
        org.junit.Assert.assertNotNull(serializableArray20);
        org.junit.Assert.assertArrayEquals(serializableArray20, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray21);
        org.junit.Assert.assertArrayEquals(serializableArray21, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray22);
        org.junit.Assert.assertArrayEquals(serializableArray22, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray23);
        org.junit.Assert.assertArrayEquals(serializableArray23, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray24);
        org.junit.Assert.assertArrayEquals(serializableArray24, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertNotNull(serializableArray26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertArrayEquals(constantDescArray38, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(serializableArray39);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0308");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray8, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray8, "");
        java.lang.CharSequence charSequence13 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray8);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray8, "");
        java.lang.Class<?> wildcardClass16 = strArray8.getClass();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertArrayEquals(constantDescArray12, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0309");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) -1, (long) '#', "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0310");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) 1, (long) (short) 100, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0311");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) (short) 0, (double) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and -1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0312");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) 10, (long) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 52, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0313");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray20, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray57, "hi!");
        java.lang.Class<?> wildcardClass60 = genericDeclarationArray59.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(genericDeclarationArray57);
        org.junit.Assert.assertNotNull(genericDeclarationArray59);
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0314");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) 100, (long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 52, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0315");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, 1, (-1), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and -1, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0316");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.constant.Constable[][] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray10, "");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray28, "hi!");
        java.lang.String[] strArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray30, "");
        java.lang.constant.Constable[][] constableArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray20, "", (java.lang.Object[]) strArray32);
        java.lang.Class<?> wildcardClass34 = constableArray33.getClass();
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0317");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray41, "");
        java.lang.constant.ConstantDesc[] constantDescArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray36, "", (java.lang.Object[]) constableArray41);
        java.lang.constant.ConstantDesc[] constantDescArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray44, "hi!");
        java.lang.Object[][] objArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray26, "hi!", (java.lang.Object[]) constantDescArray46);
        java.io.Serializable[][] serializableArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray26, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray57 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray64 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray62, "");
        java.lang.constant.ConstantDesc[] constantDescArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray57, "", (java.lang.Object[]) constableArray62);
        java.lang.constant.ConstantDesc[] constantDescArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray57, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray57, "");
        java.lang.Object[][] objArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object[][]) serializableArray49, "hi!", (java.lang.Object[]) constantDescArray57);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(serializableArray49);
        org.junit.Assert.assertNotNull(constantDescArray57);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constantDescArray65);
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertNotNull(constantDescArray69);
        org.junit.Assert.assertNotNull(objArray70);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0318");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray19 };
        java.lang.Object[] objArray24 = new java.lang.Object[] {};
        java.lang.Object obj25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray24);
        java.lang.constant.Constable[][] constableArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray20, "hi!", objArray24);
        java.lang.constant.Constable[] constableArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "", objArray24);
        java.lang.reflect.Type[] typeArray28 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray29 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray30 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray31 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray32 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray33 = new java.lang.reflect.Type[][] { typeArray28, typeArray29, typeArray30, typeArray31, typeArray32 };
        java.lang.reflect.Type[] typeArray34 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray35 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray36 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray38 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray39 = new java.lang.reflect.Type[][] { typeArray34, typeArray35, typeArray36, typeArray37, typeArray38 };
        java.lang.reflect.Type[][][] typeArray40 = new java.lang.reflect.Type[][][] { typeArray33, typeArray39 };
        java.lang.reflect.Type[][][] typeArray42 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray40, "");
        java.lang.constant.Constable[] constableArray45 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray47 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray49 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray50 = new java.lang.constant.Constable[][] { constableArray45, constableArray47, constableArray49 };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray54 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray56 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray57 = new java.lang.constant.Constable[][] { constableArray52, constableArray54, constableArray56 };
        java.lang.constant.Constable[] constableArray59 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray61 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray63 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray64 = new java.lang.constant.Constable[][] { constableArray59, constableArray61, constableArray63 };
        java.lang.constant.Constable[] constableArray66 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray68 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray70 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray71 = new java.lang.constant.Constable[][] { constableArray66, constableArray68, constableArray70 };
        java.lang.constant.Constable[][][] constableArray72 = new java.lang.constant.Constable[][][] { constableArray50, constableArray57, constableArray64, constableArray71 };
        java.lang.constant.Constable[][][] constableArray74 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray72, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray11, (java.lang.Object) typeArray40, "", (java.lang.Object[]) constableArray72);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertArrayEquals(objArray24, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + 'a' + "'", obj25, 'a');
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertArrayEquals(typeArray28, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertArrayEquals(typeArray29, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray30);
        org.junit.Assert.assertArrayEquals(typeArray30, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertArrayEquals(typeArray31, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray32);
        org.junit.Assert.assertArrayEquals(typeArray32, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray33);
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertArrayEquals(typeArray34, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray35);
        org.junit.Assert.assertArrayEquals(typeArray35, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray36);
        org.junit.Assert.assertArrayEquals(typeArray36, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertArrayEquals(typeArray37, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertArrayEquals(typeArray38, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertNotNull(constableArray45);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constableArray56);
        org.junit.Assert.assertNotNull(constableArray57);
        org.junit.Assert.assertNotNull(constableArray59);
        org.junit.Assert.assertNotNull(constableArray61);
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constableArray66);
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray72);
        org.junit.Assert.assertNotNull(constableArray74);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0319");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Object[][][] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray28, "");
        java.lang.Class<?> wildcardClass31 = objArray30.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0320");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) ' ', 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 32 and 0, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0321");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray34 };
        java.lang.Object[] objArray39 = new java.lang.Object[] {};
        java.lang.Object obj40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray39);
        java.lang.constant.Constable[][] constableArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray35, "hi!", objArray39);
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray46, "");
        java.io.Serializable[] serializableArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray41, "hi!", (java.lang.Object[]) constableArray48);
        java.lang.reflect.AnnotatedElement annotatedElement50 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass29, "", (java.lang.Object[]) constableArray48);
        java.lang.Class<?> wildcardClass52 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(wildcardClass29, "");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertArrayEquals(objArray39, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + 'a' + "'", obj40, 'a');
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(serializableArray49);
        org.junit.Assert.assertNotNull(annotatedElement50);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0322");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) ' ', (long) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 32 and 35, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0323");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration10 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass8, "hi!");
        java.lang.invoke.TypeDescriptor typeDescriptor12 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor) wildcardClass8, "");
        java.lang.Class<?> wildcardClass13 = typeDescriptor12.getClass();
        java.lang.reflect.AnnotatedElement annotatedElement15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass13, "");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclaration10);
        org.junit.Assert.assertNotNull(typeDescriptor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(annotatedElement15);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0324");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (short) 1, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0325");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (byte) 10, (int) ' ', "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0326");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray20, "");
        java.lang.Class<?> wildcardClass58 = genericDeclarationArray20.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(genericDeclarationArray57);
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0327");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) ' ', (double) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32.0 and 35.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0328");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) '4', (long) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and 100, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0329");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 10, (int) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0330");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray22.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass23, "");
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.Class<?> wildcardClass34 = charSequenceArray31.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] { wildcardClass27, wildcardClass34, wildcardClass36 };
        java.lang.reflect.Type[] typeArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray37, "");
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray52, "");
        java.lang.constant.ConstantDesc[] constantDescArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray47, "", (java.lang.Object[]) constableArray52);
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray37, "hi!", (java.lang.Object[]) constableArray52);
        java.lang.Class<?> wildcardClass57 = constableArray52.getClass();
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray63 = new java.lang.constant.Constable[][] { constableArray62 };
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        java.lang.Object obj68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray67);
        java.lang.constant.Constable[][] constableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray63, "hi!", objArray67);
        java.lang.constant.Constable[] constableArray74 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray74, "");
        java.io.Serializable[] serializableArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray69, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.AnnotatedElement annotatedElement78 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass57, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass23, wildcardClass57 };
        java.lang.reflect.Type[][] typeArray80 = new java.lang.reflect.Type[][] { typeArray79 };
        java.lang.reflect.Type[][] typeArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "hi!");
        java.lang.String[] strArray90 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray90, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray94 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray90, "");
        java.lang.reflect.Type[][] typeArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "", (java.lang.Object[]) constantDescArray94);
        java.lang.reflect.Type[][] typeArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray95, "");
        java.lang.reflect.Type[][] typeArray99 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray95, "");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(genericDeclaration25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 'a' + "'", obj68, 'a');
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertNotNull(annotatedElement78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray94);
        org.junit.Assert.assertArrayEquals(constantDescArray94, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray97);
        org.junit.Assert.assertNotNull(typeArray99);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0331");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray22.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass23, "");
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.Class<?> wildcardClass34 = charSequenceArray31.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] { wildcardClass27, wildcardClass34, wildcardClass36 };
        java.lang.reflect.Type[] typeArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray37, "");
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray52, "");
        java.lang.constant.ConstantDesc[] constantDescArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray47, "", (java.lang.Object[]) constableArray52);
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray37, "hi!", (java.lang.Object[]) constableArray52);
        java.lang.Class<?> wildcardClass57 = constableArray52.getClass();
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray63 = new java.lang.constant.Constable[][] { constableArray62 };
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        java.lang.Object obj68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray67);
        java.lang.constant.Constable[][] constableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray63, "hi!", objArray67);
        java.lang.constant.Constable[] constableArray74 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray74, "");
        java.io.Serializable[] serializableArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray69, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.AnnotatedElement annotatedElement78 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass57, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass23, wildcardClass57 };
        java.lang.reflect.Type[][] typeArray80 = new java.lang.reflect.Type[][] { typeArray79 };
        java.lang.reflect.Type[][] typeArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "hi!");
        java.lang.String[] strArray90 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray90, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray94 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray90, "");
        java.lang.reflect.Type[][] typeArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "", (java.lang.Object[]) constantDescArray94);
        java.lang.reflect.Type[][] typeArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray95, "");
        java.lang.reflect.Type[][] typeArray99 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray97, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(genericDeclaration25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 'a' + "'", obj68, 'a');
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertNotNull(annotatedElement78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray94);
        org.junit.Assert.assertArrayEquals(constantDescArray94, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray97);
        org.junit.Assert.assertNotNull(typeArray99);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0332");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (short) 0, (double) (short) 100, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0333");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, 1L, (long) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0334");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray10, "");
        java.lang.Class<?> wildcardClass13 = charSequenceArray10.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray17 = new java.lang.Object[][] { objArray16 };
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        java.lang.Object obj22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray21);
        java.lang.Object[][] objArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray17, "hi!", objArray21);
        java.lang.constant.ConstantDesc[] constantDescArray31 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray36, "");
        java.lang.constant.ConstantDesc[] constantDescArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray31, "", (java.lang.Object[]) constableArray36);
        java.lang.constant.ConstantDesc[] constantDescArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray31, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray31, "");
        java.io.Serializable[] serializableArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray17, "", (java.lang.Object[]) constantDescArray43);
        java.lang.reflect.Type type45 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass13, "hi!", (java.lang.Object[]) constantDescArray43);
        java.lang.reflect.Type[] typeArray46 = new java.lang.reflect.Type[] { wildcardClass6, type45 };
        java.lang.reflect.Type[] typeArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray46, "");
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        java.lang.Object obj53 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray58, "");
        java.lang.Object[] objArray61 = new java.lang.Object[] { objArray52, 1, "" };
        java.lang.Object[][] objArray62 = new java.lang.Object[][] { objArray52 };
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        java.lang.Object obj66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray65);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray71, "");
        java.lang.Object[] objArray74 = new java.lang.Object[] { objArray65, 1, "" };
        java.lang.Object[][] objArray75 = new java.lang.Object[][] { objArray65 };
        java.lang.Object[][][] objArray76 = new java.lang.Object[][][] { objArray62, objArray75 };
        java.lang.Object[][][] objArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray76, "hi!");
        java.lang.reflect.Type[] typeArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray48, "hi!", (java.lang.Object[]) objArray76);
        java.lang.Class<?> wildcardClass80 = typeArray79.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(constantDescArray31);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(constantDescArray41);
        org.junit.Assert.assertNotNull(constantDescArray43);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 'a' + "'", obj53, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertArrayEquals(objArray65, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 'a' + "'", obj66, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0335");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, 100.0d, 1.0d, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 1.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0336");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Class<?> wildcardClass29 = objArray26.getClass();
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.Object obj34 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray39, "");
        java.lang.Object[] objArray42 = new java.lang.Object[] { objArray33, 1, "" };
        java.lang.Object[][] objArray43 = new java.lang.Object[][] { objArray33 };
        java.lang.Object[] objArray46 = new java.lang.Object[] {};
        java.lang.Object obj47 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray46);
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray52, "");
        java.lang.Object[] objArray55 = new java.lang.Object[] { objArray46, 1, "" };
        java.lang.Object[][] objArray56 = new java.lang.Object[][] { objArray46 };
        java.lang.Object[][][] objArray57 = new java.lang.Object[][][] { objArray43, objArray56 };
        java.lang.Object[][][] objArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray57, "hi!");
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray57, "");
        java.io.Serializable serializable62 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable) wildcardClass29, "", (java.lang.Object[]) objArray57);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(wildcardClass29);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 'a' + "'", obj34, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertArrayEquals(objArray46, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj47 + "' != '" + 'a' + "'", obj47, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray55), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(serializable62);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0337");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) 1, (long) 'a', "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0338");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray35, "");
        java.io.Serializable[] serializableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray26, "hi!", (java.lang.Object[]) charSequenceArray37);
        java.lang.CharSequence[] charSequenceArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray37, "");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(charSequenceArray40);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0339");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 1, (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0340");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) '#', (long) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 35 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0341");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 100, 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0342");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 1, (double) 100L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 100.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0343");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (-1L), (long) ' ', "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + (-1L) + "'", long4 == (-1L));
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0344");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), 0.0d, 0.0d, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0.0 and 0.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0345");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) 1, (long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 52, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0346");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) 100L, (double) 0.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 0.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0347");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) 10.0f, (double) '4', "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0348");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) '4', (long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 52 and -1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0349");
        java.lang.reflect.Type[][][] typeArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Type[][][] typeArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0350");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray5.getClass();
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray11 = new java.lang.constant.Constable[][] { constableArray10 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.constant.Constable[][] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "hi!", objArray15);
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray22, "");
        java.io.Serializable[] serializableArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray17, "hi!", (java.lang.Object[]) constableArray24);
        java.lang.constant.Constable[][] constableArray27 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray17, "");
        java.lang.Class<?> wildcardClass28 = constableArray27.getClass();
        java.lang.Object obj29 = new java.lang.Object();
        java.lang.Class<?> wildcardClass30 = obj29.getClass();
        java.lang.reflect.Type[] typeArray31 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass28, wildcardClass30 };
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.lang.Object obj36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "");
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray35, 1, "" };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray35 };
        java.lang.Object[] objArray48 = new java.lang.Object[] {};
        java.lang.Object obj49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray48);
        java.lang.CharSequence[] charSequenceArray54 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray54, "");
        java.lang.Object[] objArray57 = new java.lang.Object[] { objArray48, 1, "" };
        java.lang.Object[][] objArray58 = new java.lang.Object[][] { objArray48 };
        java.lang.Object[][][] objArray59 = new java.lang.Object[][][] { objArray45, objArray58 };
        java.lang.Object[][][] objArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray59, "hi!");
        java.lang.CharSequence[] charSequenceArray68 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray68, "");
        java.io.Serializable[] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray59, "hi!", (java.lang.Object[]) charSequenceArray70);
        java.lang.reflect.Type[] typeArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray31, "", (java.lang.Object[]) charSequenceArray70);
        java.lang.reflect.Type[] typeArray74 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray31, "hi!");
        java.lang.reflect.Type[] typeArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray31, "");
        java.lang.Object[] objArray78 = null;
        java.lang.reflect.Type[] typeArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray76, "", objArray78);
        java.lang.reflect.Type[] typeArray81 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray76, "");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(serializableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(wildcardClass28);
        org.junit.Assert.assertNotNull(wildcardClass30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertArrayEquals(objArray48, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj49 + "' != '" + 'a' + "'", obj49, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(charSequenceArray68);
        org.junit.Assert.assertNotNull(charSequenceArray70);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(typeArray72);
        org.junit.Assert.assertNotNull(typeArray74);
        org.junit.Assert.assertNotNull(typeArray76);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray81);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0351");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray1 = new java.lang.CharSequence[][] { charSequenceArray0 };
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray9 = new java.lang.CharSequence[][] { charSequenceArray8 };
        java.lang.CharSequence[][][] charSequenceArray10 = new java.lang.CharSequence[][][] { charSequenceArray1, charSequenceArray3, charSequenceArray5, charSequenceArray7, charSequenceArray9 };
        java.lang.CharSequence[] charSequenceArray11 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray12 = new java.lang.CharSequence[][] { charSequenceArray11 };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray14 = new java.lang.CharSequence[][] { charSequenceArray13 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray16 = new java.lang.CharSequence[][] { charSequenceArray15 };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray18 = new java.lang.CharSequence[][] { charSequenceArray17 };
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray20 = new java.lang.CharSequence[][] { charSequenceArray19 };
        java.lang.CharSequence[][][] charSequenceArray21 = new java.lang.CharSequence[][][] { charSequenceArray12, charSequenceArray14, charSequenceArray16, charSequenceArray18, charSequenceArray20 };
        java.lang.CharSequence[] charSequenceArray22 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray23 = new java.lang.CharSequence[][] { charSequenceArray22 };
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray25 = new java.lang.CharSequence[][] { charSequenceArray24 };
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray27 = new java.lang.CharSequence[][] { charSequenceArray26 };
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray29 = new java.lang.CharSequence[][] { charSequenceArray28 };
        java.lang.CharSequence[] charSequenceArray30 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray31 = new java.lang.CharSequence[][] { charSequenceArray30 };
        java.lang.CharSequence[][][] charSequenceArray32 = new java.lang.CharSequence[][][] { charSequenceArray23, charSequenceArray25, charSequenceArray27, charSequenceArray29, charSequenceArray31 };
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray34 = new java.lang.CharSequence[][] { charSequenceArray33 };
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray36 = new java.lang.CharSequence[][] { charSequenceArray35 };
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray38 = new java.lang.CharSequence[][] { charSequenceArray37 };
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray40 = new java.lang.CharSequence[][] { charSequenceArray39 };
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray42 = new java.lang.CharSequence[][] { charSequenceArray41 };
        java.lang.CharSequence[][][] charSequenceArray43 = new java.lang.CharSequence[][][] { charSequenceArray34, charSequenceArray36, charSequenceArray38, charSequenceArray40, charSequenceArray42 };
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray45 = new java.lang.CharSequence[][] { charSequenceArray44 };
        java.lang.CharSequence[] charSequenceArray46 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray47 = new java.lang.CharSequence[][] { charSequenceArray46 };
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray49 = new java.lang.CharSequence[][] { charSequenceArray48 };
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray51 = new java.lang.CharSequence[][] { charSequenceArray50 };
        java.lang.CharSequence[] charSequenceArray52 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray53 = new java.lang.CharSequence[][] { charSequenceArray52 };
        java.lang.CharSequence[][][] charSequenceArray54 = new java.lang.CharSequence[][][] { charSequenceArray45, charSequenceArray47, charSequenceArray49, charSequenceArray51, charSequenceArray53 };
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray56 = new java.lang.CharSequence[][] { charSequenceArray55 };
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray58 = new java.lang.CharSequence[][] { charSequenceArray57 };
        java.lang.CharSequence[] charSequenceArray59 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray60 = new java.lang.CharSequence[][] { charSequenceArray59 };
        java.lang.CharSequence[] charSequenceArray61 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray62 = new java.lang.CharSequence[][] { charSequenceArray61 };
        java.lang.CharSequence[] charSequenceArray63 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray64 = new java.lang.CharSequence[][] { charSequenceArray63 };
        java.lang.CharSequence[][][] charSequenceArray65 = new java.lang.CharSequence[][][] { charSequenceArray56, charSequenceArray58, charSequenceArray60, charSequenceArray62, charSequenceArray64 };
        java.lang.CharSequence[][][][] charSequenceArray66 = new java.lang.CharSequence[][][][] { charSequenceArray10, charSequenceArray21, charSequenceArray32, charSequenceArray43, charSequenceArray54, charSequenceArray65 };
        java.lang.constant.Constable[] constableArray71 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray72 = new java.lang.constant.Constable[][] { constableArray71 };
        java.lang.Object[] objArray76 = new java.lang.Object[] {};
        java.lang.Object obj77 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray76);
        java.lang.constant.Constable[][] constableArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray72, "hi!", objArray76);
        java.lang.constant.Constable[] constableArray83 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray83, "");
        java.io.Serializable[] serializableArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray78, "hi!", (java.lang.Object[]) constableArray85);
        java.lang.constant.Constable[][] constableArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray78, "");
        java.lang.CharSequence[][][][] charSequenceArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray66, "hi!", (java.lang.Object[]) constableArray88);
        java.lang.CharSequence[][][][] charSequenceArray91 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray89, "hi!");
        java.lang.CharSequence[][][][] charSequenceArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray91, "");
        java.io.Serializable[][][] serializableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[][][]) charSequenceArray93, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray1);
        org.junit.Assert.assertNotNull(charSequenceArray2);
        org.junit.Assert.assertArrayEquals(charSequenceArray2, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray4);
        org.junit.Assert.assertArrayEquals(charSequenceArray4, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray6);
        org.junit.Assert.assertArrayEquals(charSequenceArray6, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertArrayEquals(charSequenceArray8, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertArrayEquals(charSequenceArray11, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertArrayEquals(charSequenceArray13, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray14);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertArrayEquals(charSequenceArray15, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertArrayEquals(charSequenceArray17, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray18);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertArrayEquals(charSequenceArray19, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertArrayEquals(charSequenceArray22, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertArrayEquals(charSequenceArray24, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray25);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertArrayEquals(charSequenceArray26, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray27);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertArrayEquals(charSequenceArray28, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertArrayEquals(charSequenceArray30, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertArrayEquals(charSequenceArray33, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertArrayEquals(charSequenceArray35, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertArrayEquals(charSequenceArray37, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertArrayEquals(charSequenceArray39, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertArrayEquals(charSequenceArray41, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertArrayEquals(charSequenceArray44, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray45);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertArrayEquals(charSequenceArray46, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertArrayEquals(charSequenceArray48, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertArrayEquals(charSequenceArray50, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertArrayEquals(charSequenceArray52, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(charSequenceArray54);
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertArrayEquals(charSequenceArray55, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray56);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertArrayEquals(charSequenceArray57, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertArrayEquals(charSequenceArray59, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(charSequenceArray61);
        org.junit.Assert.assertArrayEquals(charSequenceArray61, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray62);
        org.junit.Assert.assertNotNull(charSequenceArray63);
        org.junit.Assert.assertArrayEquals(charSequenceArray63, new java.lang.CharSequence[] {});
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertNotNull(charSequenceArray65);
        org.junit.Assert.assertNotNull(charSequenceArray66);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constableArray72);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertArrayEquals(objArray76, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 'a' + "'", obj77, 'a');
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(constableArray83);
        org.junit.Assert.assertNotNull(constableArray85);
        org.junit.Assert.assertNotNull(serializableArray86);
        org.junit.Assert.assertNotNull(constableArray88);
        org.junit.Assert.assertNotNull(charSequenceArray89);
        org.junit.Assert.assertNotNull(charSequenceArray91);
        org.junit.Assert.assertNotNull(charSequenceArray93);
        org.junit.Assert.assertNotNull(serializableArray95);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0352");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray22.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass23, "");
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.Class<?> wildcardClass34 = charSequenceArray31.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] { wildcardClass27, wildcardClass34, wildcardClass36 };
        java.lang.reflect.Type[] typeArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray37, "");
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray52, "");
        java.lang.constant.ConstantDesc[] constantDescArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray47, "", (java.lang.Object[]) constableArray52);
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray37, "hi!", (java.lang.Object[]) constableArray52);
        java.lang.Class<?> wildcardClass57 = constableArray52.getClass();
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray63 = new java.lang.constant.Constable[][] { constableArray62 };
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        java.lang.Object obj68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray67);
        java.lang.constant.Constable[][] constableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray63, "hi!", objArray67);
        java.lang.constant.Constable[] constableArray74 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray74, "");
        java.io.Serializable[] serializableArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray69, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.AnnotatedElement annotatedElement78 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass57, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass23, wildcardClass57 };
        java.lang.reflect.Type[][] typeArray80 = new java.lang.reflect.Type[][] { typeArray79 };
        java.lang.reflect.Type[][] typeArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "hi!");
        java.lang.String[] strArray90 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray90, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray94 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray90, "");
        java.lang.reflect.Type[][] typeArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "", (java.lang.Object[]) constantDescArray94);
        java.lang.reflect.Type[][] typeArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray95, "");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(genericDeclaration25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 'a' + "'", obj68, 'a');
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertNotNull(annotatedElement78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertArrayEquals(strArray92, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray94);
        org.junit.Assert.assertArrayEquals(constantDescArray94, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(typeArray95);
        org.junit.Assert.assertNotNull(typeArray97);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0353");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, 0.0d, (double) (byte) 1, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0354");
        java.lang.constant.Constable constable2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.Constable) (-1), "hi!");
        org.junit.Assert.assertEquals("'" + constable2 + "' != '" + (-1) + "'", constable2, (-1));
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0355");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) '#', (long) (short) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 35 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0356");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray26 = new java.lang.String[][] { strArray5, strArray9, strArray13, strArray17, strArray21, strArray25 };
        java.lang.Object[] objArray30 = new java.lang.Object[] {};
        java.lang.Object obj31 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray30);
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray36, "");
        java.lang.Object[] objArray39 = new java.lang.Object[] { objArray30, 1, "" };
        java.lang.Object[][] objArray40 = new java.lang.Object[][] { objArray30 };
        java.lang.Object[] objArray43 = new java.lang.Object[] {};
        java.lang.Object obj44 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray43);
        java.lang.CharSequence[] charSequenceArray49 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray51 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray49, "");
        java.lang.Object[] objArray52 = new java.lang.Object[] { objArray43, 1, "" };
        java.lang.Object[][] objArray53 = new java.lang.Object[][] { objArray43 };
        java.lang.Object[][][] objArray54 = new java.lang.Object[][][] { objArray40, objArray53 };
        java.lang.Object[][][] objArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray54, "hi!");
        java.lang.Object[][][] objArray58 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray56, "");
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray65, "");
        java.lang.Object[][] objArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray58, "", (java.lang.Object[]) strArray67);
        java.lang.String[][] strArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray26, "", (java.lang.Object[]) objArray68);
        java.lang.CharSequence[][] charSequenceArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.CharSequence[][]) strArray69, "");
        java.lang.constant.Constable[][] constableArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.Constable[][]) strArray69, "hi!");
        java.lang.constant.Constable[] constableArray78 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray79 = new java.lang.constant.Constable[][] { constableArray78 };
        java.lang.Object[] objArray83 = new java.lang.Object[] {};
        java.lang.Object obj84 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray83);
        java.lang.constant.Constable[][] constableArray85 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray79, "hi!", objArray83);
        java.io.Serializable serializable86 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable) "hi!", "hi!", objArray83);
        java.io.Serializable serializable87 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable) 100, "", objArray83);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertArrayEquals(strArray9, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertArrayEquals(strArray13, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertArrayEquals(strArray17, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertArrayEquals(strArray25, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertArrayEquals(objArray30, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj31 + "' != '" + 'a' + "'", obj31, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertArrayEquals(objArray43, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + 'a' + "'", obj44, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray52), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertArrayEquals(strArray67, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(strArray69);
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(constableArray73);
        org.junit.Assert.assertNotNull(constableArray78);
        org.junit.Assert.assertNotNull(constableArray79);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertArrayEquals(objArray83, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj84 + "' != '" + 'a' + "'", obj84, 'a');
        org.junit.Assert.assertNotNull(constableArray85);
        org.junit.Assert.assertEquals("'" + serializable86 + "' != '" + "hi!" + "'", serializable86, "hi!");
        org.junit.Assert.assertEquals("'" + serializable87 + "' != '" + 100 + "'", serializable87, 100);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0357");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Class<?> wildcardClass10 = obj9.getClass();
        java.lang.reflect.Type[] typeArray11 = new java.lang.reflect.Type[] { wildcardClass1, wildcardClass8, wildcardClass10 };
        java.lang.reflect.Type[] typeArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray11, "");
        java.lang.reflect.Type[] typeArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray13, "");
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray32 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray36 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray37 = new java.lang.CharSequence[][] { charSequenceArray20, charSequenceArray24, charSequenceArray28, charSequenceArray32, charSequenceArray36 };
        java.lang.CharSequence[][] charSequenceArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray37, "");
        java.lang.CharSequence[][] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray39, "hi!");
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        java.lang.Object obj46 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray45);
        java.lang.CharSequence[] charSequenceArray51 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray51, "");
        java.lang.Object[] objArray54 = new java.lang.Object[] { objArray45, 1, "" };
        java.lang.Object[][] objArray55 = new java.lang.Object[][] { objArray45 };
        java.lang.Object[] objArray58 = new java.lang.Object[] {};
        java.lang.Object obj59 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray58);
        java.lang.CharSequence[] charSequenceArray64 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray64, "");
        java.lang.Object[] objArray67 = new java.lang.Object[] { objArray58, 1, "" };
        java.lang.Object[][] objArray68 = new java.lang.Object[][] { objArray58 };
        java.lang.Object[][][] objArray69 = new java.lang.Object[][][] { objArray55, objArray68 };
        java.lang.Object[][][] objArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray69, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray79 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray84 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray86 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray84, "");
        java.lang.constant.ConstantDesc[] constantDescArray87 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray79, "", (java.lang.Object[]) constableArray84);
        java.lang.constant.ConstantDesc[] constantDescArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray87, "hi!");
        java.lang.Object[][] objArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray69, "hi!", (java.lang.Object[]) constantDescArray89);
        java.io.Serializable[][] serializableArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray69, "");
        java.lang.CharSequence[][] charSequenceArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "hi!", (java.lang.Object[]) objArray69);
        java.io.Serializable[][] serializableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray69, "hi!");
        java.lang.reflect.Type[] typeArray96 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray13, "hi!", (java.lang.Object[]) objArray69);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray13);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray32);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertArrayEquals(objArray45, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj46 + "' != '" + 'a' + "'", obj46, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray51);
        org.junit.Assert.assertNotNull(charSequenceArray53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertArrayEquals(objArray58, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj59 + "' != '" + 'a' + "'", obj59, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertNotNull(charSequenceArray66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertNotNull(constantDescArray79);
        org.junit.Assert.assertNotNull(constableArray84);
        org.junit.Assert.assertNotNull(constableArray86);
        org.junit.Assert.assertNotNull(constantDescArray87);
        org.junit.Assert.assertNotNull(constantDescArray89);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(serializableArray92);
        org.junit.Assert.assertNotNull(charSequenceArray93);
        org.junit.Assert.assertNotNull(serializableArray95);
        org.junit.Assert.assertNotNull(typeArray96);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0358");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) (short) 100, (double) 0L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100.0 and 0.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0359");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray7.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray13 };
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object obj19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray18);
        java.lang.Object[][] objArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray14, "hi!", objArray18);
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray33, "");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "", (java.lang.Object[]) constableArray33);
        java.lang.constant.ConstantDesc[] constantDescArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray28, "");
        java.io.Serializable[] serializableArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray14, "", (java.lang.Object[]) constantDescArray40);
        java.lang.reflect.Type type42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass10, "hi!", (java.lang.Object[]) constantDescArray40);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray48, "");
        java.lang.Class<?> wildcardClass51 = charSequenceArray48.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass51, wildcardClass53 };
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray54, "");
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray69, "");
        java.lang.constant.ConstantDesc[] constantDescArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray64, "", (java.lang.Object[]) constableArray69);
        java.lang.reflect.Type[] typeArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray54, "hi!", (java.lang.Object[]) constableArray69);
        java.lang.Class<?> wildcardClass74 = constableArray69.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass74 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray75, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray77, "");
        java.lang.Comparable<java.lang.String>[] strComparableArray80 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray2, "hi!", (java.lang.Object[]) genericDeclarationArray79);
        java.lang.Class<?> wildcardClass81 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(genericDeclarationArray75);
        org.junit.Assert.assertNotNull(genericDeclarationArray77);
        org.junit.Assert.assertNotNull(genericDeclarationArray79);
        org.junit.Assert.assertNotNull(strComparableArray80);
        org.junit.Assert.assertArrayEquals(strComparableArray80, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0360");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) '4', (long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and 100, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0361");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) '#', (long) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 35 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0362");
        java.lang.constant.Constable[] constableArray1 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray6 = new java.lang.constant.Constable[][] { constableArray1, constableArray3, constableArray5 };
        java.lang.constant.Constable[] constableArray8 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray13 = new java.lang.constant.Constable[][] { constableArray8, constableArray10, constableArray12 };
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray15, constableArray17, constableArray19 };
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray27 = new java.lang.constant.Constable[][] { constableArray22, constableArray24, constableArray26 };
        java.lang.constant.Constable[][][] constableArray28 = new java.lang.constant.Constable[][][] { constableArray6, constableArray13, constableArray20, constableArray27 };
        java.lang.constant.Constable[][][] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.constant.Constable[][][] constableArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray28, "hi!");
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        java.lang.Object obj37 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray36);
        java.lang.CharSequence[] charSequenceArray42 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray42, "");
        java.lang.Object[] objArray45 = new java.lang.Object[] { objArray36, 1, "" };
        java.lang.Object[][] objArray46 = new java.lang.Object[][] { objArray36 };
        java.lang.Object[] objArray49 = new java.lang.Object[] {};
        java.lang.Object obj50 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray49);
        java.lang.CharSequence[] charSequenceArray55 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray55, "");
        java.lang.Object[] objArray58 = new java.lang.Object[] { objArray49, 1, "" };
        java.lang.Object[][] objArray59 = new java.lang.Object[][] { objArray49 };
        java.lang.Object[][][] objArray60 = new java.lang.Object[][][] { objArray46, objArray59 };
        java.lang.Object[][][] objArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray60, "hi!");
        java.lang.Object[][][] objArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][][]) constableArray28, "", (java.lang.Object[]) objArray60);
        java.io.Serializable[][] serializableArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) constableArray28, "");
        java.lang.Class<?> wildcardClass66 = serializableArray65.getClass();
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertArrayEquals(objArray36, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + 'a' + "'", obj37, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray42);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertArrayEquals(objArray49, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj50 + "' != '" + 'a' + "'", obj50, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray55);
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray58), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0363");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "");
        java.lang.Class<?> wildcardClass56 = annotatedElementArray55.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0364");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) (byte) 0, (long) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0 and 52, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0365");
        java.lang.constant.ConstantDesc[] constantDescArray0 = new java.lang.constant.ConstantDesc[] {};
        java.lang.constant.ConstantDesc[] constantDescArray1 = new java.lang.constant.ConstantDesc[] {};
        java.lang.constant.ConstantDesc[][] constantDescArray2 = new java.lang.constant.ConstantDesc[][] { constantDescArray0, constantDescArray1 };
        java.lang.constant.ConstantDesc[] constantDescArray3 = new java.lang.constant.ConstantDesc[] {};
        java.lang.constant.ConstantDesc[] constantDescArray4 = new java.lang.constant.ConstantDesc[] {};
        java.lang.constant.ConstantDesc[][] constantDescArray5 = new java.lang.constant.ConstantDesc[][] { constantDescArray3, constantDescArray4 };
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] {};
        java.lang.constant.ConstantDesc[] constantDescArray7 = new java.lang.constant.ConstantDesc[] {};
        java.lang.constant.ConstantDesc[][] constantDescArray8 = new java.lang.constant.ConstantDesc[][] { constantDescArray6, constantDescArray7 };
        java.lang.constant.ConstantDesc[][][] constantDescArray9 = new java.lang.constant.ConstantDesc[][][] { constantDescArray2, constantDescArray5, constantDescArray8 };
        java.lang.constant.ConstantDesc[][][][] constantDescArray10 = new java.lang.constant.ConstantDesc[][][][] { constantDescArray9 };
        java.io.Serializable[] serializableArray12 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray13 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray14 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray15 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray16 = new java.io.Serializable[] {};
        java.io.Serializable[][] serializableArray17 = new java.io.Serializable[][] { serializableArray12, serializableArray13, serializableArray14, serializableArray15, serializableArray16 };
        java.io.Serializable[][][] serializableArray18 = new java.io.Serializable[][][] { serializableArray17 };
        java.lang.String[] strArray26 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray26, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray26, "");
        java.io.Serializable[][][] serializableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray18, "", (java.lang.Object[]) constantDescArray30);
        java.lang.constant.ConstantDesc[][][][] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray10, "", (java.lang.Object[]) serializableArray31);
        java.lang.Class<?> wildcardClass33 = serializableArray31.getClass();
        org.junit.Assert.assertNotNull(constantDescArray0);
        org.junit.Assert.assertArrayEquals(constantDescArray0, new java.lang.constant.ConstantDesc[] {});
        org.junit.Assert.assertNotNull(constantDescArray1);
        org.junit.Assert.assertArrayEquals(constantDescArray1, new java.lang.constant.ConstantDesc[] {});
        org.junit.Assert.assertNotNull(constantDescArray2);
        org.junit.Assert.assertNotNull(constantDescArray3);
        org.junit.Assert.assertArrayEquals(constantDescArray3, new java.lang.constant.ConstantDesc[] {});
        org.junit.Assert.assertNotNull(constantDescArray4);
        org.junit.Assert.assertArrayEquals(constantDescArray4, new java.lang.constant.ConstantDesc[] {});
        org.junit.Assert.assertNotNull(constantDescArray5);
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertArrayEquals(constantDescArray6, new java.lang.constant.ConstantDesc[] {});
        org.junit.Assert.assertNotNull(constantDescArray7);
        org.junit.Assert.assertArrayEquals(constantDescArray7, new java.lang.constant.ConstantDesc[] {});
        org.junit.Assert.assertNotNull(constantDescArray8);
        org.junit.Assert.assertNotNull(constantDescArray9);
        org.junit.Assert.assertNotNull(constantDescArray10);
        org.junit.Assert.assertNotNull(serializableArray12);
        org.junit.Assert.assertArrayEquals(serializableArray12, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray13);
        org.junit.Assert.assertArrayEquals(serializableArray13, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray14);
        org.junit.Assert.assertArrayEquals(serializableArray14, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray15);
        org.junit.Assert.assertArrayEquals(serializableArray15, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray16);
        org.junit.Assert.assertArrayEquals(serializableArray16, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray30);
        org.junit.Assert.assertArrayEquals(constantDescArray30, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(serializableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0366");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) '4', 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and 0, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0367");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (short) -1, (long) '#', "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0368");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "hi!");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(annotatedElementArray57);
        org.junit.Assert.assertNotNull(annotatedElementArray59);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0369");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) '4', (double) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52.0 and 10.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0370");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 1, (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0371");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (byte) 1, (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0372");
        java.lang.Object[] objArray2 = null;
        java.lang.constant.ConstantDesc constantDesc3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.ConstantDesc) 0, "hi!", objArray2);
        org.junit.Assert.assertEquals("'" + constantDesc3 + "' != '" + 0 + "'", constantDesc3, 0);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0373");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 1, (double) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 0.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0374");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray73, "");
        java.lang.Class<?> wildcardClass76 = genericDeclarationArray75.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(genericDeclarationArray75);
        org.junit.Assert.assertNotNull(wildcardClass76);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0375");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, 100L, (long) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0376");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) ' ', (double) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32.0 and 10.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0377");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 100.0f, (double) (-1L), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and -1.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0378");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (byte) 0, 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0379");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) '4', (long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 52 and -1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0380");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) '#', (double) (byte) 100, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 35.0 and 100.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0381");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) ' ', (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32 and 97, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0382");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) '4', 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 52 and 0, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0383");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) 1, 100L, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0384");
        java.lang.constant.ConstantDesc[] constantDescArray5 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[] constantDescArray11 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[] constantDescArray17 = new java.lang.constant.ConstantDesc[] { 10.0f, 100, 1L, 0, 10.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray18 = new java.lang.constant.ConstantDesc[][] { constantDescArray5, constantDescArray11, constantDescArray17 };
        java.lang.Object[] objArray22 = new java.lang.Object[] {};
        java.lang.Object obj23 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray22);
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray28, "");
        java.lang.Object[] objArray31 = new java.lang.Object[] { objArray22, 1, "" };
        java.lang.Object[][] objArray32 = new java.lang.Object[][] { objArray22 };
        java.lang.Object[] objArray35 = new java.lang.Object[] {};
        java.lang.Object obj36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray35);
        java.lang.CharSequence[] charSequenceArray41 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray41, "");
        java.lang.Object[] objArray44 = new java.lang.Object[] { objArray35, 1, "" };
        java.lang.Object[][] objArray45 = new java.lang.Object[][] { objArray35 };
        java.lang.Object[][][] objArray46 = new java.lang.Object[][][] { objArray32, objArray45 };
        java.lang.Object[][][] objArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray46, "hi!");
        java.lang.Class<?> wildcardClass49 = objArray46.getClass();
        java.lang.constant.Constable[] constableArray54 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray55 = new java.lang.constant.Constable[][] { constableArray54 };
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        java.lang.Object obj60 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray59);
        java.lang.constant.Constable[][] constableArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray55, "hi!", objArray59);
        java.lang.constant.Constable[] constableArray66 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray66, "");
        java.io.Serializable[] serializableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray61, "hi!", (java.lang.Object[]) constableArray68);
        java.lang.reflect.AnnotatedElement annotatedElement70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass49, "", (java.lang.Object[]) constableArray68);
        java.lang.constant.ConstantDesc[][] constantDescArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray18, "", (java.lang.Object[]) constableArray68);
        java.io.Serializable[] serializableArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constantDescArray18, "hi!");
        java.lang.Class<?> wildcardClass74 = constantDescArray18.getClass();
        org.junit.Assert.assertNotNull(constantDescArray5);
        org.junit.Assert.assertNotNull(constantDescArray11);
        org.junit.Assert.assertNotNull(constantDescArray17);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertArrayEquals(objArray22, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj23 + "' != '" + 'a' + "'", obj23, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertArrayEquals(objArray35, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + 'a' + "'", obj36, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(charSequenceArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constableArray55);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertArrayEquals(objArray59, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj60 + "' != '" + 'a' + "'", obj60, 'a');
        org.junit.Assert.assertNotNull(constableArray61);
        org.junit.Assert.assertNotNull(constableArray66);
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertNotNull(annotatedElement70);
        org.junit.Assert.assertNotNull(constantDescArray71);
        org.junit.Assert.assertNotNull(serializableArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0385");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, 1, (int) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 1, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0386");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 100.0f, (double) (-1.0f), "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100.0 and -1.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0387");
        java.lang.constant.Constable[][][] constableArray0 = new java.lang.constant.Constable[][][] {};
        java.lang.constant.Constable[][][] constableArray1 = new java.lang.constant.Constable[][][] {};
        java.lang.constant.Constable[][][] constableArray2 = new java.lang.constant.Constable[][][] {};
        java.lang.constant.Constable[][][][] constableArray3 = new java.lang.constant.Constable[][][][] { constableArray0, constableArray1, constableArray2 };
        java.lang.constant.Constable[][][][] constableArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray3, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray13 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray18 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray18, "");
        java.lang.constant.ConstantDesc[] constantDescArray21 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray13, "", (java.lang.Object[]) constableArray18);
        java.lang.constant.ConstantDesc[] constantDescArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray13, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray13, "");
        java.io.Serializable[][][] serializableArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][][]) constableArray3, "", (java.lang.Object[]) constantDescArray13);
        org.junit.Assert.assertNotNull(constableArray0);
        org.junit.Assert.assertArrayEquals(constableArray0, new java.lang.constant.Constable[][][] {});
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertArrayEquals(constableArray1, new java.lang.constant.Constable[][][] {});
        org.junit.Assert.assertNotNull(constableArray2);
        org.junit.Assert.assertArrayEquals(constableArray2, new java.lang.constant.Constable[][][] {});
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constantDescArray13);
        org.junit.Assert.assertNotNull(constableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constantDescArray21);
        org.junit.Assert.assertNotNull(constantDescArray23);
        org.junit.Assert.assertNotNull(constantDescArray25);
        org.junit.Assert.assertNotNull(serializableArray26);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0388");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19, strArray23 };
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.lang.Object obj29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray34, "");
        java.lang.Object[] objArray37 = new java.lang.Object[] { objArray28, 1, "" };
        java.lang.Object[][] objArray38 = new java.lang.Object[][] { objArray28 };
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.Object obj42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray47, "");
        java.lang.Object[] objArray50 = new java.lang.Object[] { objArray41, 1, "" };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray41 };
        java.lang.Object[][][] objArray52 = new java.lang.Object[][][] { objArray38, objArray51 };
        java.lang.Object[][][] objArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray52, "hi!");
        java.lang.Object[][][] objArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray54, "");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray63, "");
        java.lang.Object[][] objArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray56, "", (java.lang.Object[]) strArray65);
        java.lang.String[][] strArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray24, "", (java.lang.Object[]) objArray66);
        java.lang.Class<?> wildcardClass68 = objArray66.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 'a' + "'", obj29, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0389");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (short) -1, (int) ' ', "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0390");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 10, (int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 97, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0391");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 1, 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 100, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0392");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), 0.0d, (double) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and -1.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0393");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 10, (int) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 0, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0394");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) 100, (long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0395");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, (int) (byte) 100, (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 10, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0396");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) (byte) 0, (long) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0 and 97, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0397");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.String[] strArray61 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray61, "hi!");
        java.lang.constant.Constable[] constableArray68 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray68, "");
        java.lang.String[] strArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray63, "hi!", (java.lang.Object[]) constableArray70);
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "", (java.lang.Object[]) strArray63);
        java.lang.Class<?> wildcardClass73 = genericDeclarationArray72.getClass();
        java.lang.constant.ConstantDesc[] constantDescArray81 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray86 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray88 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray86, "");
        java.lang.constant.ConstantDesc[] constantDescArray89 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray81, "", (java.lang.Object[]) constableArray86);
        java.lang.constant.ConstantDesc[] constantDescArray91 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray81, "hi!");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField92 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass73, "hi!", (java.lang.Object[]) constantDescArray81);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertArrayEquals(strArray61, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(constableArray70);
        org.junit.Assert.assertNotNull(strArray71);
        org.junit.Assert.assertArrayEquals(strArray71, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(genericDeclarationArray72);
        org.junit.Assert.assertNotNull(wildcardClass73);
        org.junit.Assert.assertNotNull(constantDescArray81);
        org.junit.Assert.assertNotNull(constableArray86);
        org.junit.Assert.assertNotNull(constableArray88);
        org.junit.Assert.assertNotNull(constantDescArray89);
        org.junit.Assert.assertNotNull(constantDescArray91);
        org.junit.Assert.assertNotNull(wildcardClassOfField92);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0398");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.Object[][][] objArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray28, "");
        java.io.Serializable[][] serializableArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[][]) objArray30, "");
        java.lang.Class<?> wildcardClass33 = serializableArray32.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(serializableArray32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0399");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray41, "");
        java.lang.constant.ConstantDesc[] constantDescArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray36, "", (java.lang.Object[]) constableArray41);
        java.lang.constant.ConstantDesc[] constantDescArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray44, "hi!");
        java.lang.Object[][] objArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray26, "hi!", (java.lang.Object[]) constantDescArray46);
        java.io.Serializable[][] serializableArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray26, "");
        java.lang.Class<?> wildcardClass50 = objArray26.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(serializableArray49);
        org.junit.Assert.assertNotNull(wildcardClass50);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0400");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 10, (int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 0, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0401");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray20, "");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray57, "");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(annotatedElementArray59, "");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(genericDeclarationArray57);
        org.junit.Assert.assertNotNull(annotatedElementArray59);
        org.junit.Assert.assertNotNull(annotatedElementArray61);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0402");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray22 = new java.lang.constant.Constable[][] { constableArray17, constableArray19, constableArray21 };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray29 = new java.lang.constant.Constable[][] { constableArray24, constableArray26, constableArray28 };
        java.lang.constant.Constable[] constableArray31 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray35 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray36 = new java.lang.constant.Constable[][] { constableArray31, constableArray33, constableArray35 };
        java.lang.constant.Constable[] constableArray38 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray40 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray42 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray43 = new java.lang.constant.Constable[][] { constableArray38, constableArray40, constableArray42 };
        java.lang.constant.Constable[][][] constableArray44 = new java.lang.constant.Constable[][][] { constableArray22, constableArray29, constableArray36, constableArray43 };
        java.lang.constant.Constable[][][] constableArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray44, "");
        java.lang.constant.Constable[] constableArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray11, "hi!", (java.lang.Object[]) constableArray46);
        java.lang.Class<?> wildcardClass48 = constableArray47.getClass();
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0403");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (short) 100, 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0404");
        java.lang.CharSequence[][][][][][] charSequenceArray0 = new java.lang.CharSequence[][][][][][] {};
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] { charSequenceArray5, charSequenceArray9, charSequenceArray13, charSequenceArray17, charSequenceArray21 };
        java.lang.CharSequence[][] charSequenceArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray22, "");
        java.lang.CharSequence[][] charSequenceArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray24, "");
        java.lang.CharSequence[][] charSequenceArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray26, "");
        java.lang.CharSequence[][][][][][] charSequenceArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray0, "hi!", (java.lang.Object[]) charSequenceArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[][][][][][] charSequenceArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertArrayEquals(charSequenceArray29, new java.lang.CharSequence[][][][][][] {});
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0405");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) (-1.0f), (double) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0406");
        java.lang.String[][][][] strArray0 = new java.lang.String[][][][] {};
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray7, "");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray12 };
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object obj18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray17);
        java.lang.Object[][] objArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray13, "hi!", objArray17);
        java.lang.constant.ConstantDesc[] constantDescArray27 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray32, "");
        java.lang.constant.ConstantDesc[] constantDescArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray27, "", (java.lang.Object[]) constableArray32);
        java.lang.constant.ConstantDesc[] constantDescArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray27, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray27, "");
        java.io.Serializable[] serializableArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray13, "", (java.lang.Object[]) constantDescArray39);
        java.lang.CharSequence[] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray7, "", (java.lang.Object[]) serializableArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][][][] strArray42 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray0, "", (java.lang.Object[]) serializableArray40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertArrayEquals(strArray0, new java.lang.String[][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(constantDescArray27);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constantDescArray35);
        org.junit.Assert.assertNotNull(constantDescArray37);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0407");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) ' ', 10L, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 32 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0408");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.Object obj19 = null;
        java.lang.Object[] objArray21 = null;
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) "hi!", obj19, "hi!", objArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0409");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.Class<?> wildcardClass15 = wildcardClassOfField14.getClass();
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray22 = new java.lang.constant.Constable[][] { constableArray17, constableArray19, constableArray21 };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray29 = new java.lang.constant.Constable[][] { constableArray24, constableArray26, constableArray28 };
        java.lang.constant.Constable[] constableArray31 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray35 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray36 = new java.lang.constant.Constable[][] { constableArray31, constableArray33, constableArray35 };
        java.lang.constant.Constable[] constableArray38 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray40 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray42 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray43 = new java.lang.constant.Constable[][] { constableArray38, constableArray40, constableArray42 };
        java.lang.constant.Constable[][][] constableArray44 = new java.lang.constant.Constable[][][] { constableArray22, constableArray29, constableArray36, constableArray43 };
        java.lang.constant.Constable[][][] constableArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray44, "");
        java.lang.constant.Constable[][][] constableArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray44, "hi!");
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        java.lang.Object obj53 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray58, "");
        java.lang.Object[] objArray61 = new java.lang.Object[] { objArray52, 1, "" };
        java.lang.Object[][] objArray62 = new java.lang.Object[][] { objArray52 };
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        java.lang.Object obj66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray65);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray71, "");
        java.lang.Object[] objArray74 = new java.lang.Object[] { objArray65, 1, "" };
        java.lang.Object[][] objArray75 = new java.lang.Object[][] { objArray65 };
        java.lang.Object[][][] objArray76 = new java.lang.Object[][][] { objArray62, objArray75 };
        java.lang.Object[][][] objArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray76, "hi!");
        java.lang.Object[][][] objArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][][]) constableArray44, "", (java.lang.Object[]) objArray76);
        java.io.Serializable[][] serializableArray81 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) constableArray44, "");
        java.lang.Object[] objArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) wildcardClass15, (java.lang.Object) constableArray44, "hi!", objArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 'a' + "'", obj53, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertArrayEquals(objArray65, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 'a' + "'", obj66, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(serializableArray81);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0410");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.lang.String[][] strArray12 = new java.lang.String[][] { strArray2, strArray5, strArray8, strArray11 };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "" };
        java.lang.String[][] strArray25 = new java.lang.String[][] { strArray15, strArray18, strArray21, strArray24 };
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "" };
        java.lang.String[][] strArray38 = new java.lang.String[][] { strArray28, strArray31, strArray34, strArray37 };
        java.lang.String[][][] strArray39 = new java.lang.String[][][] { strArray12, strArray25, strArray38 };
        java.lang.String[][][] strArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray39, "");
        java.lang.Object[] objArray45 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray46 = new java.lang.Object[][] { objArray45 };
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        java.lang.Object obj51 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray50);
        java.lang.Object[][] objArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray46, "hi!", objArray50);
        java.lang.Comparable<java.lang.String> strComparable53 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>) "hi!", "", (java.lang.Object[]) objArray52);
        java.lang.Object[] objArray55 = null;
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) strArray41, (java.lang.Object) objArray52, "", objArray55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertArrayEquals(strArray21, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertArrayEquals(strArray24, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertArrayEquals(strArray31, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertArrayEquals(strArray34, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertArrayEquals(strArray37, new java.lang.String[] { "hi!", "" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(strArray41);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertArrayEquals(objArray50, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj51 + "' != '" + 'a' + "'", obj51, 'a');
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertEquals("'" + strComparable53 + "' != '" + "hi!" + "'", strComparable53, "hi!");
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0411");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (byte) 1, (long) (short) 10, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0412");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray22 = new java.lang.constant.Constable[][] { constableArray17, constableArray19, constableArray21 };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray29 = new java.lang.constant.Constable[][] { constableArray24, constableArray26, constableArray28 };
        java.lang.constant.Constable[] constableArray31 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray35 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray36 = new java.lang.constant.Constable[][] { constableArray31, constableArray33, constableArray35 };
        java.lang.constant.Constable[] constableArray38 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray40 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray42 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray43 = new java.lang.constant.Constable[][] { constableArray38, constableArray40, constableArray42 };
        java.lang.constant.Constable[][][] constableArray44 = new java.lang.constant.Constable[][][] { constableArray22, constableArray29, constableArray36, constableArray43 };
        java.lang.constant.Constable[][][] constableArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray44, "");
        java.lang.constant.Constable[] constableArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray11, "hi!", (java.lang.Object[]) constableArray46);
        java.lang.Class<?> wildcardClass48 = constableArray11.getClass();
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField50 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass48, "");
        java.lang.reflect.GenericDeclaration genericDeclaration52 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass48, "hi!");
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constableArray40);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(wildcardClassOfField50);
        org.junit.Assert.assertNotNull(genericDeclaration52);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0413");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 1, (double) 0L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1.0 and 0.0, but is: 1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0414");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (short) 1, 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 0, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0415");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) 0L, (double) (byte) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and 1.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0416");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) (short) 100, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 1, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0417");
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(annotatedElementArray0, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[][][] annotatedElementArray4 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(annotatedElementArray2, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[][][] {});
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0418");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (short) 100, (long) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 100 and 100, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0419");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) (byte) 10, (long) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 10, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0420");
        java.lang.CharSequence[] charSequenceArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence[] charSequenceArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0421");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray7.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray13 };
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object obj19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray18);
        java.lang.Object[][] objArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray14, "hi!", objArray18);
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray33, "");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "", (java.lang.Object[]) constableArray33);
        java.lang.constant.ConstantDesc[] constantDescArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray28, "");
        java.io.Serializable[] serializableArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray14, "", (java.lang.Object[]) constantDescArray40);
        java.lang.reflect.Type type42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass10, "hi!", (java.lang.Object[]) constantDescArray40);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray48, "");
        java.lang.Class<?> wildcardClass51 = charSequenceArray48.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass51, wildcardClass53 };
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray54, "");
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray69, "");
        java.lang.constant.ConstantDesc[] constantDescArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray64, "", (java.lang.Object[]) constableArray69);
        java.lang.reflect.Type[] typeArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray54, "hi!", (java.lang.Object[]) constableArray69);
        java.lang.Class<?> wildcardClass74 = constableArray69.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass74 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray75, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray77, "");
        java.lang.Comparable<java.lang.String>[] strComparableArray80 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray2, "hi!", (java.lang.Object[]) genericDeclarationArray79);
        java.lang.Object obj81 = null;
        java.lang.Object[] objArray83 = null;
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) strArray2, obj81, "", objArray83);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(genericDeclarationArray75);
        org.junit.Assert.assertNotNull(genericDeclarationArray77);
        org.junit.Assert.assertNotNull(genericDeclarationArray79);
        org.junit.Assert.assertNotNull(strComparableArray80);
        org.junit.Assert.assertArrayEquals(strComparableArray80, new java.lang.String[] { "hi!", "hi!" });
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0422");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray5, "");
        java.lang.CharSequence[] charSequenceArray12 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray16 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray28 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray29 = new java.lang.CharSequence[][] { charSequenceArray12, charSequenceArray16, charSequenceArray20, charSequenceArray24, charSequenceArray28 };
        java.lang.CharSequence[][] charSequenceArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray29, "");
        java.lang.CharSequence[][] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.CharSequence[][] charSequenceArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray33, "");
        java.lang.String[] strArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray7, "", (java.lang.Object[]) charSequenceArray35);
        java.lang.String[] strArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray36, "");
        java.lang.String[] strArray46 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray46, "hi!");
        java.lang.String[] strArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray36, "hi!", (java.lang.Object[]) strArray46);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertArrayEquals(strArray5, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(charSequenceArray16);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertArrayEquals(strArray36, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertArrayEquals(strArray38, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertArrayEquals(strArray46, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertArrayEquals(strArray48, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertArrayEquals(strArray49, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0423");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray19 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray24 = new java.lang.String[][] { strArray3, strArray7, strArray11, strArray15, strArray19, strArray23 };
        java.lang.Object[] objArray28 = new java.lang.Object[] {};
        java.lang.Object obj29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray28);
        java.lang.CharSequence[] charSequenceArray34 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray34, "");
        java.lang.Object[] objArray37 = new java.lang.Object[] { objArray28, 1, "" };
        java.lang.Object[][] objArray38 = new java.lang.Object[][] { objArray28 };
        java.lang.Object[] objArray41 = new java.lang.Object[] {};
        java.lang.Object obj42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray41);
        java.lang.CharSequence[] charSequenceArray47 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray49 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray47, "");
        java.lang.Object[] objArray50 = new java.lang.Object[] { objArray41, 1, "" };
        java.lang.Object[][] objArray51 = new java.lang.Object[][] { objArray41 };
        java.lang.Object[][][] objArray52 = new java.lang.Object[][][] { objArray38, objArray51 };
        java.lang.Object[][][] objArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray52, "hi!");
        java.lang.Object[][][] objArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray54, "");
        java.lang.String[] strArray63 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray63, "");
        java.lang.Object[][] objArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray56, "", (java.lang.Object[]) strArray65);
        java.lang.String[][] strArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray24, "", (java.lang.Object[]) objArray66);
        java.lang.Object[] objArray71 = new java.lang.Object[] {};
        java.lang.Object obj72 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray71);
        java.lang.CharSequence[] charSequenceArray77 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray77, "");
        java.lang.Object[] objArray80 = new java.lang.Object[] { objArray71, 1, "" };
        java.lang.Object[][] objArray81 = new java.lang.Object[][] { objArray71 };
        java.lang.Object[] objArray84 = new java.lang.Object[] {};
        java.lang.Object obj85 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray84);
        java.lang.CharSequence[] charSequenceArray90 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray90, "");
        java.lang.Object[] objArray93 = new java.lang.Object[] { objArray84, 1, "" };
        java.lang.Object[][] objArray94 = new java.lang.Object[][] { objArray84 };
        java.lang.Object[][][] objArray95 = new java.lang.Object[][][] { objArray81, objArray94 };
        java.lang.Object[][][] objArray97 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray95, "hi!");
        java.io.Serializable[] serializableArray98 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[]) strArray67, "", (java.lang.Object[]) objArray97);
        java.lang.Class<?> wildcardClass99 = objArray97.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertArrayEquals(strArray3, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertArrayEquals(strArray7, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertArrayEquals(strArray11, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertArrayEquals(strArray15, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertArrayEquals(strArray19, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertArrayEquals(strArray23, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertArrayEquals(objArray28, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + 'a' + "'", obj29, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray34);
        org.junit.Assert.assertNotNull(charSequenceArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertArrayEquals(objArray41, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + 'a' + "'", obj42, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray47);
        org.junit.Assert.assertNotNull(charSequenceArray49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertArrayEquals(strArray63, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertArrayEquals(strArray65, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertArrayEquals(objArray71, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj72 + "' != '" + 'a' + "'", obj72, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray77);
        org.junit.Assert.assertNotNull(charSequenceArray79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray80), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertArrayEquals(objArray84, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + 'a' + "'", obj85, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray90);
        org.junit.Assert.assertNotNull(charSequenceArray92);
        org.junit.Assert.assertNotNull(objArray93);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray93), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertNotNull(objArray97);
        org.junit.Assert.assertNotNull(serializableArray98);
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0424");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (short) 0, (long) (short) 100, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0425");
        java.lang.constant.Constable[] constableArray1 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray6 = new java.lang.constant.Constable[][] { constableArray1, constableArray3, constableArray5 };
        java.lang.constant.Constable[] constableArray8 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray13 = new java.lang.constant.Constable[][] { constableArray8, constableArray10, constableArray12 };
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray15, constableArray17, constableArray19 };
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray27 = new java.lang.constant.Constable[][] { constableArray22, constableArray24, constableArray26 };
        java.lang.constant.Constable[][][] constableArray28 = new java.lang.constant.Constable[][][] { constableArray6, constableArray13, constableArray20, constableArray27 };
        java.lang.constant.Constable[][][] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.constant.Constable[][][] constableArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray28, "hi!");
        java.lang.constant.Constable[][][] constableArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray28, "");
        java.lang.Object[] objArray38 = new java.lang.Object[] {};
        java.lang.Object obj39 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray38);
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Object[] objArray47 = new java.lang.Object[] { objArray38, 1, "" };
        java.lang.Object[][] objArray48 = new java.lang.Object[][] { objArray38 };
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        java.lang.Object obj52 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray51);
        java.lang.CharSequence[] charSequenceArray57 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray57, "");
        java.lang.Object[] objArray60 = new java.lang.Object[] { objArray51, 1, "" };
        java.lang.Object[][] objArray61 = new java.lang.Object[][] { objArray51 };
        java.lang.Object[][][] objArray62 = new java.lang.Object[][][] { objArray48, objArray61 };
        java.lang.Object[][][] objArray64 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray62, "hi!");
        java.lang.Object[][][] objArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray64, "");
        java.io.Serializable[][] serializableArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[][]) objArray66, "");
        java.io.Serializable[] serializableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[]) constableArray28, "", (java.lang.Object[]) objArray66);
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertArrayEquals(objArray38, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj39 + "' != '" + 'a' + "'", obj39, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertArrayEquals(objArray51, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj52 + "' != '" + 'a' + "'", obj52, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray57);
        org.junit.Assert.assertNotNull(charSequenceArray59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(serializableArray68);
        org.junit.Assert.assertNotNull(serializableArray69);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0426");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 100.0f, (double) 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 1.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0427");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, 10.0d, 10.0d, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0428");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (-1.0d), 0.0d, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0429");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) 'a', (int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 97 and 0, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0430");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (byte) 0, (int) 'a', "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0431");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), 100L, (long) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0432");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) '4', (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and 1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0433");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.CharSequence[] charSequenceArray33 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray33, "");
        java.lang.Class<?> wildcardClass36 = charSequenceArray33.getClass();
        java.lang.Object[] objArray39 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray40 = new java.lang.Object[][] { objArray39 };
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        java.lang.Object obj45 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray44);
        java.lang.Object[][] objArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray40, "hi!", objArray44);
        java.lang.constant.ConstantDesc[] constantDescArray54 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray59 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray61 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray59, "");
        java.lang.constant.ConstantDesc[] constantDescArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray54, "", (java.lang.Object[]) constableArray59);
        java.lang.constant.ConstantDesc[] constantDescArray64 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray54, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray54, "");
        java.io.Serializable[] serializableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray40, "", (java.lang.Object[]) constantDescArray66);
        java.lang.reflect.Type type68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass36, "hi!", (java.lang.Object[]) constantDescArray66);
        java.io.Serializable[][] serializableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray26, "", (java.lang.Object[]) constantDescArray66);
        java.io.Serializable[][] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray69, "hi!");
        java.lang.Class<?> wildcardClass72 = serializableArray69.getClass();
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertArrayEquals(objArray44, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 'a' + "'", obj45, 'a');
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(constantDescArray54);
        org.junit.Assert.assertNotNull(constableArray59);
        org.junit.Assert.assertNotNull(constableArray61);
        org.junit.Assert.assertNotNull(constantDescArray62);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertNotNull(type68);
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(wildcardClass72);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0434");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) '4', 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 52 and 10, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0435");
        java.lang.Object[][][][] objArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][] objArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0436");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) 10, (long) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 10, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0437");
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(annotatedElementArray0, "hi!");
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray11 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray9, "");
        java.lang.Class<?> wildcardClass12 = charSequenceArray11.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray13 = new java.lang.reflect.GenericDeclaration[] { wildcardClass12 };
        java.lang.CharSequence[] charSequenceArray19 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray21 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray19, "");
        java.lang.Class<?> wildcardClass22 = charSequenceArray21.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray23 = new java.lang.reflect.GenericDeclaration[] { wildcardClass22 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray24 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray13, genericDeclarationArray23 };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray31 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray32 = new java.lang.constant.Constable[][] { constableArray27, constableArray29, constableArray31 };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray38 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray39 = new java.lang.constant.Constable[][] { constableArray34, constableArray36, constableArray38 };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray43 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray45 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray46 = new java.lang.constant.Constable[][] { constableArray41, constableArray43, constableArray45 };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray50 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray53 = new java.lang.constant.Constable[][] { constableArray48, constableArray50, constableArray52 };
        java.lang.constant.Constable[][][] constableArray54 = new java.lang.constant.Constable[][][] { constableArray32, constableArray39, constableArray46, constableArray53 };
        java.lang.constant.Constable[][][] constableArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray54, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray24, "hi!", (java.lang.Object[]) constableArray54);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[][][] annotatedElementArray58 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(annotatedElementArray2, "hi!", (java.lang.Object[]) constableArray54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(genericDeclarationArray13);
        org.junit.Assert.assertNotNull(charSequenceArray19);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(genericDeclarationArray23);
        org.junit.Assert.assertNotNull(genericDeclarationArray24);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constableArray45);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constableArray56);
        org.junit.Assert.assertNotNull(genericDeclarationArray57);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0438");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray1 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray2 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray3 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray0, annotatedElementArray1, annotatedElementArray2 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray4 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray5 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray6 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray7 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray4, annotatedElementArray5, annotatedElementArray6 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray8 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray9 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray10 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray11 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray8, annotatedElementArray9, annotatedElementArray10 };
        java.lang.reflect.AnnotatedElement[] annotatedElementArray12 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray13 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[] annotatedElementArray14 = new java.lang.reflect.AnnotatedElement[] {};
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray15 = new java.lang.reflect.AnnotatedElement[][] { annotatedElementArray12, annotatedElementArray13, annotatedElementArray14 };
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray16 = new java.lang.reflect.AnnotatedElement[][][] { annotatedElementArray3, annotatedElementArray7, annotatedElementArray11, annotatedElementArray15 };
        java.lang.Object[] objArray20 = new java.lang.Object[] {};
        java.lang.Object obj21 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray20);
        java.lang.CharSequence[] charSequenceArray26 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray26, "");
        java.lang.Object[] objArray29 = new java.lang.Object[] { objArray20, 1, "" };
        java.lang.Object[][] objArray30 = new java.lang.Object[][] { objArray20 };
        java.lang.Object[] objArray33 = new java.lang.Object[] {};
        java.lang.Object obj34 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray33);
        java.lang.CharSequence[] charSequenceArray39 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray39, "");
        java.lang.Object[] objArray42 = new java.lang.Object[] { objArray33, 1, "" };
        java.lang.Object[][] objArray43 = new java.lang.Object[][] { objArray33 };
        java.lang.Object[][][] objArray44 = new java.lang.Object[][][] { objArray30, objArray43 };
        java.lang.Object[][][] objArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray44, "hi!");
        java.lang.Class<?> wildcardClass47 = objArray44.getClass();
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray53 = new java.lang.constant.Constable[][] { constableArray52 };
        java.lang.Object[] objArray57 = new java.lang.Object[] {};
        java.lang.Object obj58 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray57);
        java.lang.constant.Constable[][] constableArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray53, "hi!", objArray57);
        java.lang.constant.Constable[] constableArray64 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray64, "");
        java.io.Serializable[] serializableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray59, "hi!", (java.lang.Object[]) constableArray66);
        java.lang.reflect.AnnotatedElement annotatedElement68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass47, "", (java.lang.Object[]) constableArray66);
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(annotatedElementArray16, "", (java.lang.Object[]) constableArray66);
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(annotatedElementArray69, "");
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray1);
        org.junit.Assert.assertArrayEquals(annotatedElementArray1, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray3);
        org.junit.Assert.assertNotNull(annotatedElementArray4);
        org.junit.Assert.assertArrayEquals(annotatedElementArray4, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray5);
        org.junit.Assert.assertArrayEquals(annotatedElementArray5, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray6);
        org.junit.Assert.assertArrayEquals(annotatedElementArray6, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray7);
        org.junit.Assert.assertNotNull(annotatedElementArray8);
        org.junit.Assert.assertArrayEquals(annotatedElementArray8, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray9);
        org.junit.Assert.assertArrayEquals(annotatedElementArray9, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray10);
        org.junit.Assert.assertArrayEquals(annotatedElementArray10, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray11);
        org.junit.Assert.assertNotNull(annotatedElementArray12);
        org.junit.Assert.assertArrayEquals(annotatedElementArray12, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray13);
        org.junit.Assert.assertArrayEquals(annotatedElementArray13, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray14);
        org.junit.Assert.assertArrayEquals(annotatedElementArray14, new java.lang.reflect.AnnotatedElement[] {});
        org.junit.Assert.assertNotNull(annotatedElementArray15);
        org.junit.Assert.assertNotNull(annotatedElementArray16);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertArrayEquals(objArray20, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + 'a' + "'", obj21, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertArrayEquals(objArray33, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + 'a' + "'", obj34, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(charSequenceArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray42), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray53);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertArrayEquals(objArray57, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj58 + "' != '" + 'a' + "'", obj58, 'a');
        org.junit.Assert.assertNotNull(constableArray59);
        org.junit.Assert.assertNotNull(constableArray64);
        org.junit.Assert.assertNotNull(constableArray66);
        org.junit.Assert.assertNotNull(serializableArray67);
        org.junit.Assert.assertNotNull(annotatedElement68);
        org.junit.Assert.assertNotNull(annotatedElementArray69);
        org.junit.Assert.assertNotNull(annotatedElementArray71);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0439");
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray7 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray5, "");
        java.lang.Class<?> wildcardClass8 = charSequenceArray7.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray9 = new java.lang.reflect.GenericDeclaration[] { wildcardClass8 };
        java.lang.CharSequence[] charSequenceArray15 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray15, "");
        java.lang.Class<?> wildcardClass18 = charSequenceArray17.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray19 = new java.lang.reflect.GenericDeclaration[] { wildcardClass18 };
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray20 = new java.lang.reflect.GenericDeclaration[][] { genericDeclarationArray9, genericDeclarationArray19 };
        java.lang.constant.Constable[] constableArray23 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray25 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray27 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray28 = new java.lang.constant.Constable[][] { constableArray23, constableArray25, constableArray27 };
        java.lang.constant.Constable[] constableArray30 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray34 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray35 = new java.lang.constant.Constable[][] { constableArray30, constableArray32, constableArray34 };
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray39 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray42 = new java.lang.constant.Constable[][] { constableArray37, constableArray39, constableArray41 };
        java.lang.constant.Constable[] constableArray44 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray46 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray48 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray49 = new java.lang.constant.Constable[][] { constableArray44, constableArray46, constableArray48 };
        java.lang.constant.Constable[][][] constableArray50 = new java.lang.constant.Constable[][][] { constableArray28, constableArray35, constableArray42, constableArray49 };
        java.lang.constant.Constable[][][] constableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray50, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray53 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray20, "hi!", (java.lang.Object[]) constableArray50);
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[][]) genericDeclarationArray20, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray20, "");
        java.lang.reflect.GenericDeclaration[][] genericDeclarationArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray20, "hi!");
        java.io.Serializable serializable61 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable) "hi!", "");
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(genericDeclarationArray9);
        org.junit.Assert.assertNotNull(charSequenceArray15);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(genericDeclarationArray19);
        org.junit.Assert.assertNotNull(genericDeclarationArray20);
        org.junit.Assert.assertNotNull(constableArray23);
        org.junit.Assert.assertNotNull(constableArray25);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray39);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray42);
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray46);
        org.junit.Assert.assertNotNull(constableArray48);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray50);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(genericDeclarationArray53);
        org.junit.Assert.assertNotNull(annotatedElementArray55);
        org.junit.Assert.assertNotNull(genericDeclarationArray57);
        org.junit.Assert.assertNotNull(genericDeclarationArray59);
        org.junit.Assert.assertEquals("'" + serializable61 + "' != '" + "hi!" + "'", serializable61, "hi!");
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0440");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray7.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray13 };
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object obj19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray18);
        java.lang.Object[][] objArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray14, "hi!", objArray18);
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray33, "");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "", (java.lang.Object[]) constableArray33);
        java.lang.constant.ConstantDesc[] constantDescArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray28, "");
        java.io.Serializable[] serializableArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray14, "", (java.lang.Object[]) constantDescArray40);
        java.lang.reflect.Type type42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass10, "hi!", (java.lang.Object[]) constantDescArray40);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray48, "");
        java.lang.Class<?> wildcardClass51 = charSequenceArray48.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass51, wildcardClass53 };
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray54, "");
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray69, "");
        java.lang.constant.ConstantDesc[] constantDescArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray64, "", (java.lang.Object[]) constableArray69);
        java.lang.reflect.Type[] typeArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray54, "hi!", (java.lang.Object[]) constableArray69);
        java.lang.Class<?> wildcardClass74 = constableArray69.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass74 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray75, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray77, "");
        java.lang.Comparable<java.lang.String>[] strComparableArray80 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray2, "hi!", (java.lang.Object[]) genericDeclarationArray79);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray79, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(genericDeclarationArray75);
        org.junit.Assert.assertNotNull(genericDeclarationArray77);
        org.junit.Assert.assertNotNull(genericDeclarationArray79);
        org.junit.Assert.assertNotNull(strComparableArray80);
        org.junit.Assert.assertArrayEquals(strComparableArray80, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(annotatedElementArray82);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0441");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.constant.Constable[][] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray10, "");
        java.lang.String[] strArray28 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray28, "hi!");
        java.lang.String[] strArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(strArray30, "");
        java.lang.constant.Constable[][] constableArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray20, "", (java.lang.Object[]) strArray32);
        java.lang.constant.Constable[] constableArray37 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray38 = new java.lang.constant.Constable[][] { constableArray37 };
        java.lang.Object[] objArray42 = new java.lang.Object[] {};
        java.lang.Object obj43 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray42);
        java.lang.constant.Constable[][] constableArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray38, "hi!", objArray42);
        java.lang.constant.Constable[] constableArray49 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray51 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray49, "");
        java.io.Serializable[] serializableArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray44, "hi!", (java.lang.Object[]) constableArray51);
        java.lang.Class<?> wildcardClass53 = constableArray51.getClass();
        java.lang.String[] strArray60 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray60, "");
        java.lang.CharSequence[] charSequenceArray64 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence[]) strArray62, "");
        java.lang.CharSequence[] charSequenceArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray64, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray33, (java.lang.Object) wildcardClass53, "hi!", (java.lang.Object[]) charSequenceArray66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertArrayEquals(strArray28, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertArrayEquals(strArray30, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertArrayEquals(strArray32, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray37);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertArrayEquals(objArray42, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + 'a' + "'", obj43, 'a');
        org.junit.Assert.assertNotNull(constableArray44);
        org.junit.Assert.assertNotNull(constableArray49);
        org.junit.Assert.assertNotNull(constableArray51);
        org.junit.Assert.assertNotNull(serializableArray52);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(strArray60);
        org.junit.Assert.assertArrayEquals(strArray60, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertArrayEquals(strArray62, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray64);
        org.junit.Assert.assertArrayEquals(charSequenceArray64, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray66);
        org.junit.Assert.assertArrayEquals(charSequenceArray66, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0442");
        java.lang.CharSequence charSequence2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence) "hi!", "");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!" + "'", charSequence2, "hi!");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0443");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 0, (double) (byte) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0.0 and -1.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0444");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.Object[] objArray9 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray10 = new java.lang.Object[][] { objArray9 };
        java.lang.Object[] objArray14 = new java.lang.Object[] {};
        java.lang.Object obj15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray14);
        java.lang.Object[][] objArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray10, "hi!", objArray14);
        java.lang.constant.ConstantDesc[] constantDescArray24 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray29 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray29, "");
        java.lang.constant.ConstantDesc[] constantDescArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "", (java.lang.Object[]) constableArray29);
        java.lang.constant.ConstantDesc[] constantDescArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray24, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray24, "");
        java.io.Serializable[] serializableArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray10, "", (java.lang.Object[]) constantDescArray36);
        java.lang.reflect.Type type38 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass6, "hi!", (java.lang.Object[]) constantDescArray36);
        java.lang.Object obj39 = new java.lang.Object();
        java.lang.Class<?> wildcardClass40 = obj39.getClass();
        java.lang.CharSequence[] charSequenceArray44 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray44, "");
        java.lang.Class<?> wildcardClass47 = charSequenceArray44.getClass();
        java.lang.Object obj48 = new java.lang.Object();
        java.lang.Class<?> wildcardClass49 = obj48.getClass();
        java.lang.reflect.Type[] typeArray50 = new java.lang.reflect.Type[] { wildcardClass40, wildcardClass47, wildcardClass49 };
        java.lang.reflect.Type[] typeArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray50, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray65 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray65, "");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray60, "", (java.lang.Object[]) constableArray65);
        java.lang.reflect.Type[] typeArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray50, "hi!", (java.lang.Object[]) constableArray65);
        java.lang.Class<?> wildcardClass70 = constableArray65.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray71 = new java.lang.reflect.GenericDeclaration[] { wildcardClass6, wildcardClass70 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray71, "");
        java.lang.reflect.AnnotatedElement[] annotatedElementArray75 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray73, "");
        java.lang.Object[] objArray77 = null;
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray73, "", objArray77);
        java.lang.reflect.AnnotatedElement[] annotatedElementArray80 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement[]) genericDeclarationArray78, "hi!");
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray10);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertArrayEquals(objArray14, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + 'a' + "'", obj15, 'a');
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(constantDescArray24);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray31);
        org.junit.Assert.assertNotNull(constantDescArray32);
        org.junit.Assert.assertNotNull(constantDescArray34);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(serializableArray37);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(charSequenceArray44);
        org.junit.Assert.assertNotNull(charSequenceArray46);
        org.junit.Assert.assertNotNull(wildcardClass47);
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(typeArray50);
        org.junit.Assert.assertNotNull(typeArray52);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constableArray65);
        org.junit.Assert.assertNotNull(constableArray67);
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(genericDeclarationArray71);
        org.junit.Assert.assertNotNull(genericDeclarationArray73);
        org.junit.Assert.assertNotNull(annotatedElementArray75);
        org.junit.Assert.assertNotNull(genericDeclarationArray78);
        org.junit.Assert.assertNotNull(annotatedElementArray80);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0445");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 1L, (long) (byte) 1, (long) (byte) 10, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1L + "'", long4 == 1L);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0446");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) 0.0f, (double) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0.0 and 0.0, but is: 100.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0447");
        java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray0 = null;
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray7 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray8 = new java.lang.constant.Constable[][] { constableArray3, constableArray5, constableArray7 };
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray14 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray15 = new java.lang.constant.Constable[][] { constableArray10, constableArray12, constableArray14 };
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray21 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray22 = new java.lang.constant.Constable[][] { constableArray17, constableArray19, constableArray21 };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray28 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray29 = new java.lang.constant.Constable[][] { constableArray24, constableArray26, constableArray28 };
        java.lang.constant.Constable[][][] constableArray30 = new java.lang.constant.Constable[][][] { constableArray8, constableArray15, constableArray22, constableArray29 };
        java.lang.constant.Constable[][][] constableArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray30, "");
        java.lang.constant.Constable[][][] constableArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray30, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray40 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray45 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray50 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray55 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray60 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray65 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray66 = new java.lang.constant.ConstantDesc[][] { constantDescArray40, constantDescArray45, constantDescArray50, constantDescArray55, constantDescArray60, constantDescArray65 };
        java.lang.constant.ConstantDesc[][][] constantDescArray67 = new java.lang.constant.ConstantDesc[][][] { constantDescArray66 };
        java.lang.constant.ConstantDesc[][][] constantDescArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray67, "hi!");
        java.lang.constant.Constable[][][] constableArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray30, "hi!", (java.lang.Object[]) constantDescArray67);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[][][][] annotatedElementArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(annotatedElementArray0, "", (java.lang.Object[]) constableArray30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray7);
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray14);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray21);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray29);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertNotNull(constantDescArray45);
        org.junit.Assert.assertNotNull(constantDescArray50);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constantDescArray65);
        org.junit.Assert.assertNotNull(constantDescArray66);
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertNotNull(constantDescArray69);
        org.junit.Assert.assertNotNull(constableArray70);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0448");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 100, (int) '#', (int) '#', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 35 and 35, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0449");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.constant.Constable[][] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray10, "");
        java.lang.Class<?> wildcardClass21 = constableArray10.getClass();
        java.lang.Object obj22 = null;
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray24 = new java.lang.invoke.TypeDescriptor[] {};
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray25 = new java.lang.invoke.TypeDescriptor[] {};
        java.lang.invoke.TypeDescriptor[] typeDescriptorArray26 = new java.lang.invoke.TypeDescriptor[] {};
        java.lang.invoke.TypeDescriptor[][] typeDescriptorArray27 = new java.lang.invoke.TypeDescriptor[][] { typeDescriptorArray24, typeDescriptorArray25, typeDescriptorArray26 };
        java.lang.invoke.TypeDescriptor[][] typeDescriptorArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeDescriptorArray27, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) constableArray10, obj22, "", (java.lang.Object[]) typeDescriptorArray27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(typeDescriptorArray24);
        org.junit.Assert.assertArrayEquals(typeDescriptorArray24, new java.lang.invoke.TypeDescriptor[] {});
        org.junit.Assert.assertNotNull(typeDescriptorArray25);
        org.junit.Assert.assertArrayEquals(typeDescriptorArray25, new java.lang.invoke.TypeDescriptor[] {});
        org.junit.Assert.assertNotNull(typeDescriptorArray26);
        org.junit.Assert.assertArrayEquals(typeDescriptorArray26, new java.lang.invoke.TypeDescriptor[] {});
        org.junit.Assert.assertNotNull(typeDescriptorArray27);
        org.junit.Assert.assertNotNull(typeDescriptorArray29);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0450");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), 0, (int) (byte) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 0 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0451");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) 'a', 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 97 and 1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0452");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 100, (int) '4', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100 and 52, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0453");
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray0 = new java.lang.reflect.AnnotatedElement[][][] {};
        java.lang.reflect.AnnotatedElement[][][] annotatedElementArray2 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(annotatedElementArray0, "hi!");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray10 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!" };
        java.lang.String[][] strArray27 = new java.lang.String[][] { strArray6, strArray10, strArray14, strArray18, strArray22, strArray26 };
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Object obj32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray31);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray37, "");
        java.lang.Object[] objArray40 = new java.lang.Object[] { objArray31, 1, "" };
        java.lang.Object[][] objArray41 = new java.lang.Object[][] { objArray31 };
        java.lang.Object[] objArray44 = new java.lang.Object[] {};
        java.lang.Object obj45 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray44);
        java.lang.CharSequence[] charSequenceArray50 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray52 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray50, "");
        java.lang.Object[] objArray53 = new java.lang.Object[] { objArray44, 1, "" };
        java.lang.Object[][] objArray54 = new java.lang.Object[][] { objArray44 };
        java.lang.Object[][][] objArray55 = new java.lang.Object[][][] { objArray41, objArray54 };
        java.lang.Object[][][] objArray57 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray55, "hi!");
        java.lang.Object[][][] objArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(objArray57, "");
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray66, "");
        java.lang.Object[][] objArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray59, "", (java.lang.Object[]) strArray68);
        java.lang.String[][] strArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray27, "", (java.lang.Object[]) objArray69);
        java.lang.CharSequence[][] charSequenceArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.CharSequence[][]) strArray70, "");
        java.io.Serializable[] serializableArray74 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray75 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray76 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray77 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray78 = new java.io.Serializable[] {};
        java.io.Serializable[][] serializableArray79 = new java.io.Serializable[][] { serializableArray74, serializableArray75, serializableArray76, serializableArray77, serializableArray78 };
        java.io.Serializable[][][] serializableArray80 = new java.io.Serializable[][][] { serializableArray79 };
        java.lang.String[] strArray88 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray90 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray88, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray92 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray88, "");
        java.io.Serializable[][][] serializableArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray80, "", (java.lang.Object[]) constantDescArray92);
        java.io.Serializable[][] serializableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) serializableArray80, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq((java.lang.Object) "hi!", (java.lang.Object) strArray70, "", (java.lang.Object[]) serializableArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotatedElementArray0);
        org.junit.Assert.assertArrayEquals(annotatedElementArray0, new java.lang.reflect.AnnotatedElement[][][] {});
        org.junit.Assert.assertNotNull(annotatedElementArray2);
        org.junit.Assert.assertArrayEquals(annotatedElementArray2, new java.lang.reflect.AnnotatedElement[][][] {});
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertArrayEquals(strArray6, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertArrayEquals(strArray14, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertArrayEquals(strArray18, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertArrayEquals(strArray22, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertArrayEquals(strArray26, new java.lang.String[] { "hi!", "", "hi!" });
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertArrayEquals(objArray44, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj45 + "' != '" + 'a' + "'", obj45, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(charSequenceArray52);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertArrayEquals(strArray68, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(charSequenceArray72);
        org.junit.Assert.assertNotNull(serializableArray74);
        org.junit.Assert.assertArrayEquals(serializableArray74, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray75);
        org.junit.Assert.assertArrayEquals(serializableArray75, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray76);
        org.junit.Assert.assertArrayEquals(serializableArray76, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertArrayEquals(serializableArray77, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray78);
        org.junit.Assert.assertArrayEquals(serializableArray78, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray79);
        org.junit.Assert.assertNotNull(serializableArray80);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertArrayEquals(strArray88, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray90);
        org.junit.Assert.assertArrayEquals(strArray90, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray92);
        org.junit.Assert.assertArrayEquals(constantDescArray92, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(serializableArray93);
        org.junit.Assert.assertNotNull(serializableArray95);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0454");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.CharSequence[] charSequenceArray10 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray10, "");
        java.lang.Class<?> wildcardClass13 = charSequenceArray10.getClass();
        java.lang.Object[] objArray16 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray17 = new java.lang.Object[][] { objArray16 };
        java.lang.Object[] objArray21 = new java.lang.Object[] {};
        java.lang.Object obj22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray21);
        java.lang.Object[][] objArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray17, "hi!", objArray21);
        java.lang.constant.ConstantDesc[] constantDescArray31 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray36 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray36, "");
        java.lang.constant.ConstantDesc[] constantDescArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray31, "", (java.lang.Object[]) constableArray36);
        java.lang.constant.ConstantDesc[] constantDescArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray31, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray31, "");
        java.io.Serializable[] serializableArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray17, "", (java.lang.Object[]) constantDescArray43);
        java.lang.reflect.Type type45 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass13, "hi!", (java.lang.Object[]) constantDescArray43);
        java.lang.reflect.Type[] typeArray46 = new java.lang.reflect.Type[] { wildcardClass6, type45 };
        java.lang.reflect.Type[] typeArray48 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray46, "");
        java.lang.Object[] objArray52 = new java.lang.Object[] {};
        java.lang.Object obj53 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray52);
        java.lang.CharSequence[] charSequenceArray58 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray58, "");
        java.lang.Object[] objArray61 = new java.lang.Object[] { objArray52, 1, "" };
        java.lang.Object[][] objArray62 = new java.lang.Object[][] { objArray52 };
        java.lang.Object[] objArray65 = new java.lang.Object[] {};
        java.lang.Object obj66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray65);
        java.lang.CharSequence[] charSequenceArray71 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray71, "");
        java.lang.Object[] objArray74 = new java.lang.Object[] { objArray65, 1, "" };
        java.lang.Object[][] objArray75 = new java.lang.Object[][] { objArray65 };
        java.lang.Object[][][] objArray76 = new java.lang.Object[][][] { objArray62, objArray75 };
        java.lang.Object[][][] objArray78 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray76, "hi!");
        java.lang.reflect.Type[] typeArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray48, "hi!", (java.lang.Object[]) objArray76);
        java.lang.Class<?> wildcardClass80 = typeArray48.getClass();
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(charSequenceArray12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertArrayEquals(objArray21, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + 'a' + "'", obj22, 'a');
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(constantDescArray31);
        org.junit.Assert.assertNotNull(constableArray36);
        org.junit.Assert.assertNotNull(constableArray38);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(constantDescArray41);
        org.junit.Assert.assertNotNull(constantDescArray43);
        org.junit.Assert.assertNotNull(serializableArray44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(typeArray48);
        org.junit.Assert.assertNotNull(objArray52);
        org.junit.Assert.assertArrayEquals(objArray52, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj53 + "' != '" + 'a' + "'", obj53, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray58);
        org.junit.Assert.assertNotNull(charSequenceArray60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray61), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertArrayEquals(objArray65, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj66 + "' != '" + 'a' + "'", obj66, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray71);
        org.junit.Assert.assertNotNull(charSequenceArray73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0455");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray5 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray3, "");
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>> wildcardClassOfField14 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>) wildcardClass6, "", (java.lang.Object[]) constableArray11);
        java.lang.CharSequence[] charSequenceArray20 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray20, "");
        java.lang.Class<?> wildcardClass23 = charSequenceArray22.getClass();
        java.lang.reflect.GenericDeclaration genericDeclaration25 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.GenericDeclaration) wildcardClass23, "");
        java.lang.Object obj26 = new java.lang.Object();
        java.lang.Class<?> wildcardClass27 = obj26.getClass();
        java.lang.CharSequence[] charSequenceArray31 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray33 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray31, "");
        java.lang.Class<?> wildcardClass34 = charSequenceArray31.getClass();
        java.lang.Object obj35 = new java.lang.Object();
        java.lang.Class<?> wildcardClass36 = obj35.getClass();
        java.lang.reflect.Type[] typeArray37 = new java.lang.reflect.Type[] { wildcardClass27, wildcardClass34, wildcardClass36 };
        java.lang.reflect.Type[] typeArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray37, "");
        java.lang.constant.ConstantDesc[] constantDescArray47 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray52 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray54 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray52, "");
        java.lang.constant.ConstantDesc[] constantDescArray55 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray47, "", (java.lang.Object[]) constableArray52);
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray37, "hi!", (java.lang.Object[]) constableArray52);
        java.lang.Class<?> wildcardClass57 = constableArray52.getClass();
        java.lang.constant.Constable[] constableArray62 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray63 = new java.lang.constant.Constable[][] { constableArray62 };
        java.lang.Object[] objArray67 = new java.lang.Object[] {};
        java.lang.Object obj68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray67);
        java.lang.constant.Constable[][] constableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray63, "hi!", objArray67);
        java.lang.constant.Constable[] constableArray74 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray76 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray74, "");
        java.io.Serializable[] serializableArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray69, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.AnnotatedElement annotatedElement78 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.AnnotatedElement) wildcardClass57, "hi!", (java.lang.Object[]) constableArray76);
        java.lang.reflect.Type[] typeArray79 = new java.lang.reflect.Type[] { wildcardClass6, wildcardClass23, wildcardClass57 };
        java.lang.reflect.Type[][] typeArray80 = new java.lang.reflect.Type[][] { typeArray79 };
        java.lang.reflect.Type[][] typeArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray80, "hi!");
        java.lang.CharSequence[][][][] charSequenceArray84 = new java.lang.CharSequence[][][][] {};
        java.lang.CharSequence[][][][] charSequenceArray85 = new java.lang.CharSequence[][][][] {};
        java.lang.CharSequence[][][][] charSequenceArray86 = new java.lang.CharSequence[][][][] {};
        java.lang.CharSequence[][][][] charSequenceArray87 = new java.lang.CharSequence[][][][] {};
        java.lang.CharSequence[][][][] charSequenceArray88 = new java.lang.CharSequence[][][][] {};
        java.lang.CharSequence[][][][][] charSequenceArray89 = new java.lang.CharSequence[][][][][] { charSequenceArray84, charSequenceArray85, charSequenceArray86, charSequenceArray87, charSequenceArray88 };
        java.lang.CharSequence[][][][][] charSequenceArray91 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray89, "hi!");
        java.lang.CharSequence[][][][][] charSequenceArray93 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray91, "");
        java.io.Serializable[] serializableArray95 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) charSequenceArray93, "");
        java.lang.reflect.Type[][] typeArray96 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray80, "", (java.lang.Object[]) charSequenceArray93);
        org.junit.Assert.assertNotNull(charSequenceArray3);
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(wildcardClassOfField14);
        org.junit.Assert.assertNotNull(charSequenceArray20);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(genericDeclaration25);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(charSequenceArray31);
        org.junit.Assert.assertNotNull(charSequenceArray33);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(typeArray37);
        org.junit.Assert.assertNotNull(typeArray39);
        org.junit.Assert.assertNotNull(constantDescArray47);
        org.junit.Assert.assertNotNull(constableArray52);
        org.junit.Assert.assertNotNull(constableArray54);
        org.junit.Assert.assertNotNull(constantDescArray55);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(constableArray62);
        org.junit.Assert.assertNotNull(constableArray63);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertArrayEquals(objArray67, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + 'a' + "'", obj68, 'a');
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray74);
        org.junit.Assert.assertNotNull(constableArray76);
        org.junit.Assert.assertNotNull(serializableArray77);
        org.junit.Assert.assertNotNull(annotatedElement78);
        org.junit.Assert.assertNotNull(typeArray79);
        org.junit.Assert.assertNotNull(typeArray80);
        org.junit.Assert.assertNotNull(typeArray82);
        org.junit.Assert.assertNotNull(charSequenceArray84);
        org.junit.Assert.assertArrayEquals(charSequenceArray84, new java.lang.CharSequence[][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray85);
        org.junit.Assert.assertArrayEquals(charSequenceArray85, new java.lang.CharSequence[][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray86);
        org.junit.Assert.assertArrayEquals(charSequenceArray86, new java.lang.CharSequence[][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray87);
        org.junit.Assert.assertArrayEquals(charSequenceArray87, new java.lang.CharSequence[][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray88);
        org.junit.Assert.assertArrayEquals(charSequenceArray88, new java.lang.CharSequence[][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray89);
        org.junit.Assert.assertNotNull(charSequenceArray91);
        org.junit.Assert.assertNotNull(charSequenceArray93);
        org.junit.Assert.assertNotNull(serializableArray95);
        org.junit.Assert.assertNotNull(typeArray96);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0456");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray8, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray12 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray8, "");
        java.lang.CharSequence charSequence13 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.CharSequence) "hi!", "", (java.lang.Object[]) strArray8);
        java.lang.Comparable<java.lang.String>[] strComparableArray15 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray8, "");
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.constant.Constable[]) strArray8, "");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray12);
        org.junit.Assert.assertArrayEquals(constantDescArray12, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertEquals("'" + charSequence13 + "' != '" + "hi!" + "'", charSequence13, "hi!");
        org.junit.Assert.assertNotNull(strComparableArray15);
        org.junit.Assert.assertArrayEquals(strComparableArray15, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertArrayEquals(constableArray17, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0457");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.CharSequence[] charSequenceArray35 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray35, "");
        java.io.Serializable[] serializableArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray26, "hi!", (java.lang.Object[]) charSequenceArray37);
        java.lang.Class<?> wildcardClass39 = charSequenceArray37.getClass();
        java.lang.Class<?> wildcardClass41 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(wildcardClass39, "");
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(charSequenceArray35);
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(serializableArray38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0458");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, 1.0d, (double) 1.0f, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1.0 and 1.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0459");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "hi!" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray7, "");
        java.lang.Class<?> wildcardClass10 = charSequenceArray7.getClass();
        java.lang.Object[] objArray13 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray14 = new java.lang.Object[][] { objArray13 };
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object obj19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray18);
        java.lang.Object[][] objArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray14, "hi!", objArray18);
        java.lang.constant.ConstantDesc[] constantDescArray28 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray33 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray33, "");
        java.lang.constant.ConstantDesc[] constantDescArray36 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "", (java.lang.Object[]) constableArray33);
        java.lang.constant.ConstantDesc[] constantDescArray38 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray28, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray28, "");
        java.io.Serializable[] serializableArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray14, "", (java.lang.Object[]) constantDescArray40);
        java.lang.reflect.Type type42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass10, "hi!", (java.lang.Object[]) constantDescArray40);
        java.lang.Object obj43 = new java.lang.Object();
        java.lang.Class<?> wildcardClass44 = obj43.getClass();
        java.lang.CharSequence[] charSequenceArray48 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray50 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray48, "");
        java.lang.Class<?> wildcardClass51 = charSequenceArray48.getClass();
        java.lang.Object obj52 = new java.lang.Object();
        java.lang.Class<?> wildcardClass53 = obj52.getClass();
        java.lang.reflect.Type[] typeArray54 = new java.lang.reflect.Type[] { wildcardClass44, wildcardClass51, wildcardClass53 };
        java.lang.reflect.Type[] typeArray56 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray54, "");
        java.lang.constant.ConstantDesc[] constantDescArray64 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray69 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray69, "");
        java.lang.constant.ConstantDesc[] constantDescArray72 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray64, "", (java.lang.Object[]) constableArray69);
        java.lang.reflect.Type[] typeArray73 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray54, "hi!", (java.lang.Object[]) constableArray69);
        java.lang.Class<?> wildcardClass74 = constableArray69.getClass();
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray75 = new java.lang.reflect.GenericDeclaration[] { wildcardClass10, wildcardClass74 };
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray77 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray75, "");
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray79 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(genericDeclarationArray77, "");
        java.lang.Comparable<java.lang.String>[] strComparableArray80 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Comparable<java.lang.String>[]) strArray2, "hi!", (java.lang.Object[]) genericDeclarationArray79);
        java.lang.reflect.GenericDeclaration[] genericDeclarationArray82 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(genericDeclarationArray79, "hi!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertArrayEquals(strArray2, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(constantDescArray28);
        org.junit.Assert.assertNotNull(constableArray33);
        org.junit.Assert.assertNotNull(constableArray35);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertNotNull(constantDescArray40);
        org.junit.Assert.assertNotNull(serializableArray41);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(charSequenceArray48);
        org.junit.Assert.assertNotNull(charSequenceArray50);
        org.junit.Assert.assertNotNull(wildcardClass51);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertNotNull(typeArray54);
        org.junit.Assert.assertNotNull(typeArray56);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constableArray69);
        org.junit.Assert.assertNotNull(constableArray71);
        org.junit.Assert.assertNotNull(constantDescArray72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertNotNull(wildcardClass74);
        org.junit.Assert.assertNotNull(genericDeclarationArray75);
        org.junit.Assert.assertNotNull(genericDeclarationArray77);
        org.junit.Assert.assertNotNull(genericDeclarationArray79);
        org.junit.Assert.assertNotNull(strComparableArray80);
        org.junit.Assert.assertArrayEquals(strComparableArray80, new java.lang.String[] { "hi!", "hi!" });
        org.junit.Assert.assertNotNull(genericDeclarationArray82);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0460");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) (byte) 0, (long) (byte) 100, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0461");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (short) -1, 10.0d, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0462");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 1, (int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0463");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray11 = new java.lang.reflect.Type[][] { typeArray6, typeArray7, typeArray8, typeArray9, typeArray10 };
        java.lang.reflect.Type[][][] typeArray12 = new java.lang.reflect.Type[][][] { typeArray5, typeArray11 };
        java.lang.reflect.Type[][][] typeArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray12, "");
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        java.lang.Object obj19 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray18);
        java.lang.CharSequence[] charSequenceArray24 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray24, "");
        java.lang.Object[] objArray27 = new java.lang.Object[] { objArray18, 1, "" };
        java.lang.Object[][] objArray28 = new java.lang.Object[][] { objArray18 };
        java.lang.Object[] objArray31 = new java.lang.Object[] {};
        java.lang.Object obj32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray31);
        java.lang.CharSequence[] charSequenceArray37 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray37, "");
        java.lang.Object[] objArray40 = new java.lang.Object[] { objArray31, 1, "" };
        java.lang.Object[][] objArray41 = new java.lang.Object[][] { objArray31 };
        java.lang.Object[][][] objArray42 = new java.lang.Object[][][] { objArray28, objArray41 };
        java.lang.Object[][][] objArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray42, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray52 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray57 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray59 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray57, "");
        java.lang.constant.ConstantDesc[] constantDescArray60 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray52, "", (java.lang.Object[]) constableArray57);
        java.lang.constant.ConstantDesc[] constantDescArray62 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray60, "hi!");
        java.lang.Object[][] objArray63 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray42, "hi!", (java.lang.Object[]) constantDescArray62);
        java.io.Serializable[][] serializableArray65 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) objArray42, "hi!");
        java.lang.reflect.Type[][][] typeArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray14, "hi!", (java.lang.Object[]) objArray42);
        java.lang.reflect.Type[][][] typeArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray66, "hi!");
        java.lang.reflect.Type[][][] typeArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(typeArray66, "hi!");
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertArrayEquals(typeArray3, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertArrayEquals(typeArray4, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertArrayEquals(typeArray6, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertArrayEquals(typeArray7, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertArrayEquals(typeArray8, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertArrayEquals(typeArray9, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertArrayEquals(typeArray10, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertArrayEquals(objArray18, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + 'a' + "'", obj19, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertArrayEquals(objArray31, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + 'a' + "'", obj32, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray37);
        org.junit.Assert.assertNotNull(charSequenceArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(constantDescArray52);
        org.junit.Assert.assertNotNull(constableArray57);
        org.junit.Assert.assertNotNull(constableArray59);
        org.junit.Assert.assertNotNull(constantDescArray60);
        org.junit.Assert.assertNotNull(constantDescArray62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(serializableArray65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertNotNull(typeArray68);
        org.junit.Assert.assertNotNull(typeArray70);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0464");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (byte) 1, 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0465");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, 1L, (long) 'a', "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0466");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) 1, (long) (short) 10, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1 and 10, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0467");
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 10L, 100.0f, 10.0f };
        java.lang.constant.Constable[][] constableArray4 = new java.lang.constant.Constable[][] { constableArray3 };
        java.lang.Object[] objArray8 = new java.lang.Object[] {};
        java.lang.Object obj9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray8);
        java.lang.constant.Constable[][] constableArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray4, "hi!", objArray8);
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray17 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray15, "");
        java.io.Serializable[] serializableArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) constableArray10, "hi!", (java.lang.Object[]) constableArray17);
        java.lang.constant.Constable[][] constableArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray10, "");
        java.lang.constant.Constable[][] constableArray22 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray10, "hi!");
        java.io.Serializable[] serializableArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[]) constableArray10, "");
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray4);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertArrayEquals(objArray8, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj9 + "' != '" + 'a' + "'", obj9, 'a');
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(serializableArray18);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(serializableArray24);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0468");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) 10, (long) (short) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0469");
        java.lang.CharSequence[][][][][][] charSequenceArray0 = new java.lang.CharSequence[][][][][][] {};
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray9 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray13 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray17 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "hi!", "" };
        java.lang.CharSequence[][] charSequenceArray22 = new java.lang.CharSequence[][] { charSequenceArray5, charSequenceArray9, charSequenceArray13, charSequenceArray17, charSequenceArray21 };
        java.lang.CharSequence[][] charSequenceArray24 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray22, "");
        java.lang.CharSequence[][] charSequenceArray26 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray24, "");
        java.lang.CharSequence[][] charSequenceArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray26, "");
        java.lang.CharSequence[][][][][][] charSequenceArray29 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray0, "hi!", (java.lang.Object[]) charSequenceArray28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object[][][][][] objArray31 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][][][][]) charSequenceArray29, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  cannot be null or empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray0);
        org.junit.Assert.assertArrayEquals(charSequenceArray0, new java.lang.CharSequence[][][][][][] {});
        org.junit.Assert.assertNotNull(charSequenceArray5);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(charSequenceArray13);
        org.junit.Assert.assertNotNull(charSequenceArray17);
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray22);
        org.junit.Assert.assertNotNull(charSequenceArray24);
        org.junit.Assert.assertNotNull(charSequenceArray26);
        org.junit.Assert.assertNotNull(charSequenceArray28);
        org.junit.Assert.assertNotNull(charSequenceArray29);
        org.junit.Assert.assertArrayEquals(charSequenceArray29, new java.lang.CharSequence[][][][][][] {});
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0470");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) 10, (int) (byte) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 100, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0471");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) (-1.0d), (double) (short) 1, (double) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 1.0 and 100.0, but is: -1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0472");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, (double) 1, (double) 100.0f, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0473");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 1.0d, 0.0d, 100.0d, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0474");
        java.lang.constant.ConstantDesc[] constantDescArray6 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray11 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray13 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray11, "");
        java.lang.constant.ConstantDesc[] constantDescArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "", (java.lang.Object[]) constableArray11);
        java.lang.constant.ConstantDesc[] constantDescArray16 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray6, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray6, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray20 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray6, "hi!");
        org.junit.Assert.assertNotNull(constantDescArray6);
        org.junit.Assert.assertNotNull(constableArray11);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constantDescArray14);
        org.junit.Assert.assertNotNull(constantDescArray16);
        org.junit.Assert.assertNotNull(constantDescArray18);
        org.junit.Assert.assertNotNull(constantDescArray20);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0475");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) (-1), (int) (short) 1, (int) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 97, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0476");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) '4', (int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 52 and -1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0477");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (byte) 0, (long) (byte) 100, "");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0478");
        java.lang.Object[] objArray2 = new java.lang.Object[] {};
        java.lang.Object obj3 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray2);
        java.lang.CharSequence[] charSequenceArray8 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray8, "");
        java.lang.Object[] objArray11 = new java.lang.Object[] { objArray2, 1, "" };
        java.lang.Object[][] objArray12 = new java.lang.Object[][] { objArray2 };
        java.lang.Object[] objArray15 = new java.lang.Object[] {};
        java.lang.Object obj16 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray15);
        java.lang.CharSequence[] charSequenceArray21 = new java.lang.CharSequence[] { "", "", "hi!" };
        java.lang.CharSequence[] charSequenceArray23 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(charSequenceArray21, "");
        java.lang.Object[] objArray24 = new java.lang.Object[] { objArray15, 1, "" };
        java.lang.Object[][] objArray25 = new java.lang.Object[][] { objArray15 };
        java.lang.Object[][][] objArray26 = new java.lang.Object[][][] { objArray12, objArray25 };
        java.lang.Object[][][] objArray28 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray26, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray36 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray41 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray43 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray41, "");
        java.lang.constant.ConstantDesc[] constantDescArray44 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray36, "", (java.lang.Object[]) constableArray41);
        java.lang.constant.ConstantDesc[] constantDescArray46 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray44, "hi!");
        java.lang.Object[][] objArray47 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.Object[][]) objArray26, "hi!", (java.lang.Object[]) constantDescArray46);
        java.lang.Class<?> wildcardClass48 = constantDescArray46.getClass();
        java.io.Serializable[] serializableArray50 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray51 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray52 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray53 = new java.io.Serializable[] {};
        java.io.Serializable[] serializableArray54 = new java.io.Serializable[] {};
        java.io.Serializable[][] serializableArray55 = new java.io.Serializable[][] { serializableArray50, serializableArray51, serializableArray52, serializableArray53, serializableArray54 };
        java.io.Serializable[][][] serializableArray56 = new java.io.Serializable[][][] { serializableArray55 };
        java.lang.String[] strArray64 = new java.lang.String[] { "", "hi!", "", "", "hi!", "" };
        java.lang.String[] strArray66 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray64, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.lang.constant.ConstantDesc[]) strArray64, "");
        java.io.Serializable[][][] serializableArray69 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(serializableArray56, "", (java.lang.Object[]) constantDescArray68);
        java.io.Serializable[][] serializableArray71 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[][]) serializableArray56, "hi!");
        java.lang.reflect.Type type72 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.reflect.Type) wildcardClass48, "", (java.lang.Object[]) serializableArray56);
        org.junit.Assert.assertNotNull(objArray2);
        org.junit.Assert.assertArrayEquals(objArray2, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj3 + "' != '" + 'a' + "'", obj3, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray8);
        org.junit.Assert.assertNotNull(charSequenceArray10);
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertNotNull(objArray15);
        org.junit.Assert.assertArrayEquals(objArray15, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + 'a' + "'", obj16, 'a');
        org.junit.Assert.assertNotNull(charSequenceArray21);
        org.junit.Assert.assertNotNull(charSequenceArray23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[[], 1, ]");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(constantDescArray36);
        org.junit.Assert.assertNotNull(constableArray41);
        org.junit.Assert.assertNotNull(constableArray43);
        org.junit.Assert.assertNotNull(constantDescArray44);
        org.junit.Assert.assertNotNull(constantDescArray46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(wildcardClass48);
        org.junit.Assert.assertNotNull(serializableArray50);
        org.junit.Assert.assertArrayEquals(serializableArray50, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray51);
        org.junit.Assert.assertArrayEquals(serializableArray51, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray52);
        org.junit.Assert.assertArrayEquals(serializableArray52, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray53);
        org.junit.Assert.assertArrayEquals(serializableArray53, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray54);
        org.junit.Assert.assertArrayEquals(serializableArray54, new java.io.Serializable[] {});
        org.junit.Assert.assertNotNull(serializableArray55);
        org.junit.Assert.assertNotNull(serializableArray56);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertArrayEquals(strArray64, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertArrayEquals(strArray66, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(constantDescArray68);
        org.junit.Assert.assertArrayEquals(constantDescArray68, new java.lang.String[] { "", "hi!", "", "", "hi!", "" });
        org.junit.Assert.assertNotNull(serializableArray69);
        org.junit.Assert.assertNotNull(serializableArray71);
        org.junit.Assert.assertNotNull(type72);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0479");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, 0, (int) (short) 10, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0480");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" };
        java.lang.String[] strArray10 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(strArray8, "");
        // The following exception was thrown during execution in test generation
        try {
            dev.langchain4j.internal.ValidationUtils.ensureEq(obj0, (java.lang.Object) 0L, "", (java.lang.Object[]) strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertArrayEquals(strArray8, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertArrayEquals(strArray10, new java.lang.String[] { "hi!", "hi!", "hi!", "hi!", "hi!" });
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0481");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) (-1L), (long) (byte) 0, (long) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 0 and 1, but is: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0482");
        long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (short) -1, (long) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0483");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) '#', (double) 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 35.0 and 1.0, but is: 10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0484");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 10L, (long) (byte) -1, (long) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between -1 and -1, but is: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0485");
        java.lang.reflect.Type[] typeArray0 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray1 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray2 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray3 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray4 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4 };
        java.lang.reflect.Type[] typeArray6 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray7 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray8 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray9 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[] typeArray10 = new java.lang.reflect.Type[] {};
        java.lang.reflect.Type[][] typeArray11 = new java.lang.reflect.Type[][] { typeArray6, typeArray7, typeArray8, typeArray9, typeArray10 };
        java.lang.reflect.Type[][][] typeArray12 = new java.lang.reflect.Type[][][] { typeArray5, typeArray11 };
        java.lang.reflect.Type[][][] typeArray14 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray12, "");
        java.lang.Class<?> wildcardClass15 = typeArray14.getClass();
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertArrayEquals(typeArray3, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertArrayEquals(typeArray4, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertArrayEquals(typeArray6, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertArrayEquals(typeArray7, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertArrayEquals(typeArray8, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertArrayEquals(typeArray9, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray10);
        org.junit.Assert.assertArrayEquals(typeArray10, new java.lang.reflect.Type[] {});
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0486");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 100L, (long) 'a', 1L, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 97 and 1, but is: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0487");
        java.lang.reflect.AnnotatedElement[][] annotatedElementArray0 = null;
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "hi!", "", "hi!", "hi!", "" };
        java.lang.CharSequence[] charSequenceArray9 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray7, "");
        java.lang.Object[] objArray12 = new java.lang.Object[] { (-1.0f) };
        java.lang.Object[][] objArray13 = new java.lang.Object[][] { objArray12 };
        java.lang.Object[] objArray17 = new java.lang.Object[] {};
        java.lang.Object obj18 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.lang.Object) 'a', "hi!", objArray17);
        java.lang.Object[][] objArray19 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(objArray13, "hi!", objArray17);
        java.lang.constant.ConstantDesc[] constantDescArray27 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100.0f, 10.0f, 1L, 100L, 1.0d };
        java.lang.constant.Constable[] constableArray32 = new java.lang.constant.Constable[] { (byte) 0, (short) -1, "hi!" };
        java.lang.constant.Constable[] constableArray34 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray32, "");
        java.lang.constant.ConstantDesc[] constantDescArray35 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray27, "", (java.lang.Object[]) constableArray32);
        java.lang.constant.ConstantDesc[] constantDescArray37 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray27, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray39 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constantDescArray27, "");
        java.io.Serializable[] serializableArray40 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty((java.io.Serializable[]) objArray13, "", (java.lang.Object[]) constantDescArray39);
        java.lang.CharSequence[] charSequenceArray41 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(charSequenceArray7, "", (java.lang.Object[]) serializableArray40);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.AnnotatedElement[][] annotatedElementArray42 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(annotatedElementArray0, "hi!", (java.lang.Object[]) charSequenceArray41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charSequenceArray7);
        org.junit.Assert.assertNotNull(charSequenceArray9);
        org.junit.Assert.assertNotNull(objArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray12), "[-1.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray12), "[-1.0]");
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertArrayEquals(objArray17, new java.lang.Object[] {});
        org.junit.Assert.assertEquals("'" + obj18 + "' != '" + 'a' + "'", obj18, 'a');
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertNotNull(constantDescArray27);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constableArray34);
        org.junit.Assert.assertNotNull(constantDescArray35);
        org.junit.Assert.assertNotNull(constantDescArray37);
        org.junit.Assert.assertNotNull(constantDescArray39);
        org.junit.Assert.assertNotNull(serializableArray40);
        org.junit.Assert.assertNotNull(charSequenceArray41);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0488");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 10L, (double) (byte) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10.0 and 0.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0489");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, (int) ' ', (int) (byte) 10, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 32 and 10, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0490");
        java.lang.constant.Constable[] constableArray1 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray3 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray5 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray6 = new java.lang.constant.Constable[][] { constableArray1, constableArray3, constableArray5 };
        java.lang.constant.Constable[] constableArray8 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray10 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray12 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray13 = new java.lang.constant.Constable[][] { constableArray8, constableArray10, constableArray12 };
        java.lang.constant.Constable[] constableArray15 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray17 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray19 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray20 = new java.lang.constant.Constable[][] { constableArray15, constableArray17, constableArray19 };
        java.lang.constant.Constable[] constableArray22 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray24 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[] constableArray26 = new java.lang.constant.Constable[] { 100L };
        java.lang.constant.Constable[][] constableArray27 = new java.lang.constant.Constable[][] { constableArray22, constableArray24, constableArray26 };
        java.lang.constant.Constable[][][] constableArray28 = new java.lang.constant.Constable[][][] { constableArray6, constableArray13, constableArray20, constableArray27 };
        java.lang.constant.Constable[][][] constableArray30 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constableArray28, "");
        java.lang.constant.Constable[][][] constableArray32 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray28, "hi!");
        java.lang.constant.ConstantDesc[] constantDescArray38 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray43 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray48 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray53 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray58 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[] constantDescArray63 = new java.lang.constant.ConstantDesc[] { (-1.0f), 100L, (-1L), 1.0f };
        java.lang.constant.ConstantDesc[][] constantDescArray64 = new java.lang.constant.ConstantDesc[][] { constantDescArray38, constantDescArray43, constantDescArray48, constantDescArray53, constantDescArray58, constantDescArray63 };
        java.lang.constant.ConstantDesc[][][] constantDescArray65 = new java.lang.constant.ConstantDesc[][][] { constantDescArray64 };
        java.lang.constant.ConstantDesc[][][] constantDescArray67 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(constantDescArray65, "hi!");
        java.lang.constant.Constable[][][] constableArray68 = dev.langchain4j.internal.ValidationUtils.ensureNotNull(constableArray28, "hi!", (java.lang.Object[]) constantDescArray65);
        java.io.Serializable[][] serializableArray70 = dev.langchain4j.internal.ValidationUtils.ensureNotNull((java.io.Serializable[][]) constableArray28, "hi!");
        org.junit.Assert.assertNotNull(constableArray1);
        org.junit.Assert.assertNotNull(constableArray3);
        org.junit.Assert.assertNotNull(constableArray5);
        org.junit.Assert.assertNotNull(constableArray6);
        org.junit.Assert.assertNotNull(constableArray8);
        org.junit.Assert.assertNotNull(constableArray10);
        org.junit.Assert.assertNotNull(constableArray12);
        org.junit.Assert.assertNotNull(constableArray13);
        org.junit.Assert.assertNotNull(constableArray15);
        org.junit.Assert.assertNotNull(constableArray17);
        org.junit.Assert.assertNotNull(constableArray19);
        org.junit.Assert.assertNotNull(constableArray20);
        org.junit.Assert.assertNotNull(constableArray22);
        org.junit.Assert.assertNotNull(constableArray24);
        org.junit.Assert.assertNotNull(constableArray26);
        org.junit.Assert.assertNotNull(constableArray27);
        org.junit.Assert.assertNotNull(constableArray28);
        org.junit.Assert.assertNotNull(constableArray30);
        org.junit.Assert.assertNotNull(constableArray32);
        org.junit.Assert.assertNotNull(constantDescArray38);
        org.junit.Assert.assertNotNull(constantDescArray43);
        org.junit.Assert.assertNotNull(constantDescArray48);
        org.junit.Assert.assertNotNull(constantDescArray53);
        org.junit.Assert.assertNotNull(constantDescArray58);
        org.junit.Assert.assertNotNull(constantDescArray63);
        org.junit.Assert.assertNotNull(constantDescArray64);
        org.junit.Assert.assertNotNull(constantDescArray65);
        org.junit.Assert.assertNotNull(constantDescArray67);
        org.junit.Assert.assertNotNull(constableArray68);
        org.junit.Assert.assertNotNull(serializableArray70);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0491");
        java.lang.reflect.Type[][] typeArray0 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray1 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray2 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray3 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray4 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][] typeArray5 = new java.lang.reflect.Type[][] {};
        java.lang.reflect.Type[][][] typeArray6 = new java.lang.reflect.Type[][][] { typeArray0, typeArray1, typeArray2, typeArray3, typeArray4, typeArray5 };
        java.lang.reflect.Type[][][] typeArray8 = dev.langchain4j.internal.ValidationUtils.ensureNotEmpty(typeArray6, "");
        java.lang.Class<?> wildcardClass9 = typeArray6.getClass();
        org.junit.Assert.assertNotNull(typeArray0);
        org.junit.Assert.assertArrayEquals(typeArray0, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray1);
        org.junit.Assert.assertArrayEquals(typeArray1, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray2);
        org.junit.Assert.assertArrayEquals(typeArray2, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertArrayEquals(typeArray3, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray4);
        org.junit.Assert.assertArrayEquals(typeArray4, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertArrayEquals(typeArray5, new java.lang.reflect.Type[][] {});
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0492");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 1, 10, (int) '4', "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message:  must be between 10 and 52, but is: 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0493");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 10.0d, (double) (byte) 0, (double) (short) 10, "");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0494");
        // The following exception was thrown during execution in test generation
        try {
            double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) (short) 100, (double) (short) 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 100.0 and 1.0, but is: 0.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0495");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (short) -1, 10, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0496");
        // The following exception was thrown during execution in test generation
        try {
            long long4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Long) 0L, (long) (short) 1, (long) 'a', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 1 and 97, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0497");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 0.0d, (double) 0, (double) 10L, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0498");
        double double4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Double) 100.0d, (double) '#', (double) 100L, "hi!");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0499");
        int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 10, 0, (int) '4', "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ValidationUtilsRegressionTest0.test0500");
        // The following exception was thrown during execution in test generation
        try {
            int int4 = dev.langchain4j.internal.ValidationUtils.ensureBetween((java.lang.Integer) 0, (int) (byte) 10, 1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: hi! must be between 10 and 1, but is: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSearchRequestRegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0002");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        java.lang.Class<?> wildcardClass3 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0003");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0004");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0005");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0006");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0007");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0008");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0009");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0010");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        java.lang.Class<?> wildcardClass13 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0011");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0012");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0013");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0014");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0015");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0016");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0017");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0018");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0019");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0020");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass3 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0021");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0022");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0023");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0024");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0025");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0026");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0027");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0028");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0029");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0030");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0031");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0032");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0033");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0034");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0035");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0036");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0037");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0038");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("");
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0039");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0040");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0041");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0042");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0043");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0044");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0045");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0046");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0047");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0048");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0049");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0050");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0051");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0052");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0053");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0054");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0055");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0056");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0057");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0058");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass19 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0059");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0060");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0061");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0062");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0063");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0064");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0065");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0066");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("");
        java.lang.Class<?> wildcardClass19 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0067");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0068");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0069");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0070");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0071");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        java.lang.Class<?> wildcardClass15 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0072");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0073");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0074");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0075");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0076");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0077");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0078");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0079");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0080");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0081");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0082");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0083");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass21 = builder20.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0084");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0085");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0086");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0087");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0088");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass17 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0089");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0090");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass19 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0091");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0092");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0093");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0094");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0095");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0096");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0097");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0098");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0099");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0100");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0101");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
        java.lang.Class<?> wildcardClass17 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0102");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass17 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0103");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0104");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0105");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0106");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0107");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0108");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0109");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0110");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0111");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0112");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0113");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0114");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0115");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0116");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0117");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0118");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0119");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("");
        java.lang.Class<?> wildcardClass19 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0120");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0121");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0122");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0123");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0124");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0125");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0126");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0127");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0128");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0129");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0130");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0131");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0132");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0133");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0134");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0135");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0136");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0137");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0138");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0139");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0140");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0141");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0142");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0143");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0144");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0145");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0146");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.geoLocation("hi!");
        java.lang.Class<?> wildcardClass21 = builder20.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0147");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0148");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0149");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0150");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0151");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0152");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0153");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0154");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0155");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0156");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.additionalParams(strMap17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0157");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0158");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0159");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0160");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("hi!");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0161");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0162");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0163");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0164");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass15 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0165");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0166");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.additionalParams(strMap17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0167");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0168");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass5 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0169");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0170");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0171");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0172");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0173");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0174");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0175");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0176");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0177");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0178");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0179");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0180");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0181");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0182");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0183");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0184");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0185");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0186");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0187");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0188");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0189");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0190");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0191");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0192");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0193");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0194");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0195");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0196");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0197");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0198");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0199");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass21 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0200");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.maxResults((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass29 = builder26.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0201");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0202");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0203");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0204");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0205");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0206");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0207");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0208");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0209");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0210");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0211");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0212");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0213");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0214");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0215");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0216");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0217");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0218");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0219");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0220");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0221");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass17 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0222");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0223");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0224");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0225");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0226");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0227");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.additionalParams(strMap21);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0228");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0229");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0230");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0231");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0232");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        java.lang.Class<?> wildcardClass15 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0233");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0234");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0235");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        java.lang.Class<?> wildcardClass19 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0236");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0237");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0238");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0239");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0240");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0241");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0242");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0243");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0244");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0245");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0246");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0247");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0248");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0249");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0250");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        java.lang.Class<?> wildcardClass7 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0251");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0252");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0253");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0254");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0255");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0256");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0257");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0258");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0259");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0260");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0261");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0262");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0263");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0264");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0265");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0266");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0267");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0268");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0269");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0270");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0271");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0272");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0273");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0274");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass13 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0275");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0276");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0277");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0278");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.geoLocation("");
        java.lang.Class<?> wildcardClass19 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0279");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("");
        java.lang.Class<?> wildcardClass23 = builder22.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0280");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder8.additionalParams(strMap19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0281");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0282");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0283");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0284");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0285");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0286");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0287");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0288");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.additionalParams(strMap13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0289");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0290");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0291");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0292");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0293");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0294");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0295");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0296");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0297");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0298");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0299");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0300");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0301");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass15 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0302");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0303");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.startPage((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0304");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0305");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0306");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0307");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0308");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0309");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0310");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0311");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0312");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.additionalParams(strMap23);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0313");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0314");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0315");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0316");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0317");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0318");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        java.lang.Class<?> wildcardClass11 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0319");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0320");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0321");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0322");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0323");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0324");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0325");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0326");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0327");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0328");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0329");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0330");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0331");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0332");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0333");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0334");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0335");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0336");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0337");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass19 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0338");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0339");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0340");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.maxResults((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass19 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0341");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0342");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0343");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0344");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0345");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0346");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0347");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0348");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0349");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder30 = builder26.geoLocation("");
        java.lang.Class<?> wildcardClass31 = builder30.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0350");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0351");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.additionalParams(strMap13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0352");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0353");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0354");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0355");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0356");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0357");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0358");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0359");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0360");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0361");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0362");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0363");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0364");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder30 = builder26.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder32 = builder30.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0365");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0366");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass15 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0367");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass23 = builder22.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0368");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass17 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0369");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0370");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0371");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0372");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0373");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0374");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0375");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0376");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0377");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0378");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0379");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0380");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0381");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0382");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0383");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0384");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0385");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0386");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0387");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0388");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.additionalParams(strMap13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0389");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0390");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("hi!");
        java.lang.Class<?> wildcardClass23 = builder22.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0391");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0392");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0393");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0394");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0395");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0396");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0397");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.searchTerms("");
        java.lang.Class<?> wildcardClass23 = builder18.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0398");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0399");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0400");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0401");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0402");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0403");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0404");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0405");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0406");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0407");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0408");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0409");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0410");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0411");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0412");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        java.lang.Class<?> wildcardClass13 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0413");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0414");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0415");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0416");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder6.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0417");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0418");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0419");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0420");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0421");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0422");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0423");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0424");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.additionalParams(strMap15);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0425");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0426");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0427");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0428");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0429");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0430");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0431");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0432");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0433");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass11 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0434");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0435");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0436");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0437");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0438");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0439");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0440");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0441");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0442");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0443");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0444");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0445");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startIndex((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = builder14.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0446");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0447");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        java.lang.Class<?> wildcardClass15 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0448");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.additionalParams(strMap15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.additionalParams(strMap17);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0449");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0450");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0451");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0452");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0453");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0454");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0455");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder0.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0456");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("");
        java.lang.Class<?> wildcardClass21 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0457");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.startIndex((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass11 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0458");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        java.lang.Class<?> wildcardClass15 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0459");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0460");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("");
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0461");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0462");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0463");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0464");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0465");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0466");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0467");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0468");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0469");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0470");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0471");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0472");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0473");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0474");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0475");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0476");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0477");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0478");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0479");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0480");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0481");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass11 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0482");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0483");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0484");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0485");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0486");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0487");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0488");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0489");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0490");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0491");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.geoLocation("");
        java.lang.Class<?> wildcardClass17 = builder16.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0492");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0493");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
        java.lang.Class<?> wildcardClass17 = builder10.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0494");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0495");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0496");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0497");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("");
        java.lang.Class<?> wildcardClass13 = builder12.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0498");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0499");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest0.test0500");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }
}


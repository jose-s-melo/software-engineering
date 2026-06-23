import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSearchRequestRegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test0501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0501");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0502");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0503");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.additionalParams(strMap17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.additionalParams(strMap19);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder6.additionalParams(strMap21);
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
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0504");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
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
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0505");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
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
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0506");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
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
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0507");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0508");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0509");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
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
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0510");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.additionalParams(strMap13);
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
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0511");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.maxResults((java.lang.Integer) 10);
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
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0512");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.maxResults((java.lang.Integer) 100);
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
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0513");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.language("hi!");
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
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0514");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.language("");
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
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0515");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
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
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0516");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.language("");
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
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0517");
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
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0518");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
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
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0519");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startIndex((java.lang.Integer) 0);
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
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0520");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.language("");
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
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0521");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
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
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0522");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.safeSearch((java.lang.Boolean) false);
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
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0523");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startIndex((java.lang.Integer) 1);
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
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0524");
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
        java.lang.Class<?> wildcardClass23 = builder20.getClass();
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
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0525");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
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
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0526");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.additionalParams(strMap21);
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
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0527");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.maxResults((java.lang.Integer) 10);
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
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0528");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.language("hi!");
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
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0529");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 0);
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
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0530");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.startPage((java.lang.Integer) 1);
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
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0531");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0532");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0533");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 0);
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
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0534");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 100);
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
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0535");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) 0);
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
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0536");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startPage((java.lang.Integer) 0);
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
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0537");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("");
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
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0538");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
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
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0539");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
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
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0540");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.geoLocation("");
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
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0541");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
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
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0542");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
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
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0543");
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
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0544");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0545");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
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
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0546");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        java.lang.Class<?> wildcardClass7 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0547");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
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
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0548");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
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
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0549");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
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
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0550");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
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
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0551");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
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
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0552");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.searchTerms("");
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
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0553");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
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
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0554");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0555");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 10);
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
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0556");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 0);
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
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0557");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
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
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0558");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder22.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder22.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder30 = builder22.language("");
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
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0559");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
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
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0560");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0561");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
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
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0562");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder24.searchTerms("");
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
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0563");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0564");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.language("");
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
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0565");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0566");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.maxResults((java.lang.Integer) (-1));
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
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0567");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.geoLocation("");
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
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0568");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.additionalParams(strMap17);
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
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0569");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startPage((java.lang.Integer) 0);
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
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0570");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
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
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0571");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
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
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0572");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0573");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
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
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0574");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 0);
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
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0575");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
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
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0576");
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
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0577");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
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
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0578");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
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
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0579");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder12.startIndex((java.lang.Integer) 1);
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
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0580");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0581");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 1);
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
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0582");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.searchTerms("");
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
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0583");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
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
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0584");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
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
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0585");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0586");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.maxResults((java.lang.Integer) 10);
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
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0587");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.additionalParams(strMap17);
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
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0588");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
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
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0589");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 1);
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
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0590");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
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
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0591");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
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
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0592");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.searchTerms("");
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
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0593");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
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
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0594");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        java.lang.Class<?> wildcardClass9 = builder6.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0595");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.additionalParams(strMap25);
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
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0596");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) (-1));
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
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0597");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0598");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0599");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.language("hi!");
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
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0600");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
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
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0601");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
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
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0602");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) (-1));
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
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0603");
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
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0604");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.geoLocation("");
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
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0605");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
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
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0606");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
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
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0607");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.maxResults((java.lang.Integer) 0);
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
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0608");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.startPage((java.lang.Integer) 0);
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
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0609");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
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
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0610");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
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
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0611");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0612");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder10.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder10.additionalParams(strMap21);
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
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0613");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
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
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0614");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
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
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0615");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
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
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0616");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
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
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0617");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) true);
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
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0618");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0619");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
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
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0620");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.geoLocation("");
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
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0621");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.maxResults((java.lang.Integer) (-1));
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
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0622");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder20.safeSearch((java.lang.Boolean) true);
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
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0623");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0624");
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
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0625");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) (-1));
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
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0626");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0627");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startPage((java.lang.Integer) 1);
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
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0628");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.safeSearch((java.lang.Boolean) true);
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
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0629");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
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
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0630");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
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
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0631");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
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
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0632");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
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
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0633");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
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
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0634");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0635");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.language("hi!");
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
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0636");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0637");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
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
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0638");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.language("hi!");
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
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0639");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.safeSearch((java.lang.Boolean) true);
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
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0640");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
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
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0641");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
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
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0642");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0643");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) (-1));
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
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0644");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) (-1));
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
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0645");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
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
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0646");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 10);
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
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0647");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.maxResults((java.lang.Integer) 100);
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
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0648");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0649");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
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
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0650");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
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
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0651");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.searchTerms("hi!");
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
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0652");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
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
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0653");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
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
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0654");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
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
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0655");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.searchTerms("");
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
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0656");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.geoLocation("hi!");
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
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0657");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 0);
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
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0658");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
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
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0659");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 1);
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
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0660");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass21 = builder14.getClass();
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
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0661");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
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
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0662");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0663");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) (-1));
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
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0664");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        java.lang.Class<?> wildcardClass5 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0665");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
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
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0666");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.searchTerms("hi!");
        java.lang.Class<?> wildcardClass25 = builder18.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0667");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
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
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0668");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 0);
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
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0669");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.safeSearch((java.lang.Boolean) true);
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
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0670");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 1);
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
    public void test0671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0671");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder16.startIndex((java.lang.Integer) 1);
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
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0672");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 100);
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
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0673");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) false);
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
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0674");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0675");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0676");
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
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0677");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 100);
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
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0678");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
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
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0679");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.geoLocation("hi!");
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
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0680");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder22.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder22.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder30 = builder22.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder32 = builder30.startPage((java.lang.Integer) 1);
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
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0681");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 100);
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
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0682");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startIndex((java.lang.Integer) 1);
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
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0683");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder16.startPage((java.lang.Integer) 0);
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
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0684");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.geoLocation("hi!");
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
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0685");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 1);
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
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0686");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0687");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0688");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 10);
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
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0689");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
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
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0690");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
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
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0691");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0692");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("");
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
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0693");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.searchTerms("hi!");
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
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0694");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
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
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0695");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0696");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder0.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0697");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0698");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.safeSearch((java.lang.Boolean) false);
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
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0699");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
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
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0700");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) (-1));
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
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0701");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("");
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
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0702");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
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
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0703");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0704");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
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
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0705");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.additionalParams(strMap19);
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
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0706");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
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
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0707");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 0);
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
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0708");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0709");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0710");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.language("");
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
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0711");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 0);
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
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0712");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 100);
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
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0713");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0714");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.language("hi!");
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
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0715");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder24.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass29 = builder28.getClass();
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
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0716");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
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
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0717");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startIndex((java.lang.Integer) (-1));
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
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0718");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
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
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0719");
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
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0720");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder16.additionalParams(strMap23);
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
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0721");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
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
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0722");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) (-1));
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
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0723");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("");
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
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0724");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.language("");
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
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0725");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0726");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
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
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0727");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
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
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0728");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
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
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0729");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0730");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
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
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0731");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("");
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
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0732");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0733");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
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
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0734");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
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
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0735");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
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
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0736");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
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
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0737");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
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
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0738");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
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
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0739");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 10);
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
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0740");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
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
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0741");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.safeSearch((java.lang.Boolean) true);
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
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0742");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) (-1));
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0743");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
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
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0744");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 10);
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
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0745");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.language("");
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
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0746");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0747");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
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
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0748");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.language("");
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
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0749");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 100);
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
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0750");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0751");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
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
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0752");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.safeSearch((java.lang.Boolean) true);
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
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0753");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
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
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0754");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0755");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
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
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0756");
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
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0757");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder22.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.maxResults((java.lang.Integer) 100);
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
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0758");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 10);
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
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0759");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
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
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0760");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
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
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0761");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
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
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0762");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.geoLocation("");
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
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0763");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.language("hi!");
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
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0764");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0765");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startPage((java.lang.Integer) (-1));
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
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0766");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) true);
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
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0767");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
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
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0768");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("hi!");
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
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0769");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) (-1));
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
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0770");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
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
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0771");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.language("hi!");
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
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0772");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.searchTerms("");
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
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0773");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
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
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0774");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.startPage((java.lang.Integer) 10);
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0775");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("hi!");
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
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0776");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0777");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0778");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) 10);
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
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0779");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
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
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0780");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
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
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0781");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.additionalParams(strMap23);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder26.startPage((java.lang.Integer) 0);
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
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0782");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) (-1));
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
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0783");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0784");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.startIndex((java.lang.Integer) 100);
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
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0785");
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
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0786");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
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
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0787");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.additionalParams(strMap23);
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
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0788");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
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
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0789");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
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
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0790");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
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
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0791");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0792");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
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
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0793");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0794");
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
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0795");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) (-1));
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
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0796");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.startPage((java.lang.Integer) 100);
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
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0797");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
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
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0798");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.startIndex((java.lang.Integer) 10);
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
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0799");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.startIndex((java.lang.Integer) 0);
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
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0800");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) false);
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
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0801");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
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
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0802");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.maxResults((java.lang.Integer) 1);
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
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0803");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.additionalParams(strMap21);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.language("");
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
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0804");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
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
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0805");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 100);
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
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0806");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("hi!");
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
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0807");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.additionalParams(strMap13);
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
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0808");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
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
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0809");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
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
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0810");
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
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0811");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
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
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0812");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
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
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0813");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startPage((java.lang.Integer) 1);
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
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0814");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0815");
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
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0816");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.language("");
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
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0817");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 1);
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
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0818");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap21 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.additionalParams(strMap21);
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
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0819");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.searchTerms("hi!");
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
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0820");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
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
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0821");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
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
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0822");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
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
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0823");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder8.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder8.safeSearch((java.lang.Boolean) false);
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
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0824");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0825");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
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
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0826");
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
        java.lang.Class<?> wildcardClass19 = builder6.getClass();
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
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0827");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
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
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0828");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 0);
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
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0829");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.additionalParams(strMap15);
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
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0830");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 100);
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
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0831");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0832");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.maxResults((java.lang.Integer) 0);
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
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0833");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
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
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0834");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
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
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0835");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
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
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0836");
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
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0837");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.lang.Class<?> wildcardClass9 = builder8.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0838");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.geoLocation("hi!");
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
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0839");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
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
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0840");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.maxResults((java.lang.Integer) 100);
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
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0841");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0842");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.additionalParams(strMap9);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0843");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.startPage((java.lang.Integer) 0);
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
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0844");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
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
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0845");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 0);
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
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0846");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
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
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0847");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
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
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0848");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.language("hi!");
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
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0849");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
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
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0850");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
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
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0851");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) (-1));
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
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0852");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("hi!");
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
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0853");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.searchTerms("hi!");
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
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0854");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0855");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.geoLocation("hi!");
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
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0856");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startPage((java.lang.Integer) 10);
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
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0857");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0858");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.searchTerms("hi!");
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
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0859");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
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
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0860");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 10);
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
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0861");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
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
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0862");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0863");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.language("hi!");
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
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0864");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
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
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0865");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
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
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0866");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.safeSearch((java.lang.Boolean) true);
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
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0867");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0868");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startPage((java.lang.Integer) (-1));
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
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0869");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 0);
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
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0870");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
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
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0871");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("hi!");
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
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0872");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0873");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0874");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0875");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 100);
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
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0876");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass13 = builder4.getClass();
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
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0877");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0878");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder10.language("");
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
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0879");
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
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0880");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
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
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0881");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
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
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0882");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.language("");
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
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0883");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0884");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
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
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0885");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 0);
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
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0886");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0887");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.language("hi!");
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
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0888");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.startIndex((java.lang.Integer) 1);
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
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0889");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.geoLocation("hi!");
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
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0890");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 0);
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
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0891");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) true);
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
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0892");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0893");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.geoLocation("hi!");
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
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0894");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("hi!");
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
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0895");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
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
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0896");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startPage((java.lang.Integer) 0);
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
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0897");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0898");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 0);
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
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0899");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.maxResults((java.lang.Integer) 0);
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
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0900");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("hi!");
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
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0901");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0902");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0903");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 1);
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
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0904");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
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
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0905");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
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
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0906");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder20.startPage((java.lang.Integer) 0);
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
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0907");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder10.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder10.additionalParams(strMap23);
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
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0908");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0909");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("");
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
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0910");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder22.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder22.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder30 = builder22.searchTerms("hi!");
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
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0911");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) (-1));
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
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0912");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
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
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0913");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
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
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0914");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
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
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0915");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.startIndex((java.lang.Integer) 10);
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
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0916");
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
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0917");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0918");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
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
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0919");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
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
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0920");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 1);
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
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0921");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.searchTerms("hi!");
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
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0922");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 100);
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
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0923");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0924");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.geoLocation("hi!");
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
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0925");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
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
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0926");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.searchTerms("");
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
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0927");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 10);
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
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0928");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.safeSearch((java.lang.Boolean) false);
        java.lang.Class<?> wildcardClass19 = builder14.getClass();
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
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0929");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
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
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0930");
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
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0931");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
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
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0932");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) (-1));
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
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0933");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) (-1));
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
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0934");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0935");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0936");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0937");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
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
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0938");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("hi!");
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
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0939");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.additionalParams(strMap15);
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
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0940");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
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
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0941");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
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
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0942");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
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
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0943");
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
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0944");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("hi!");
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
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0945");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("");
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
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0946");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) true);
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
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0947");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.maxResults((java.lang.Integer) 1);
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
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0948");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0949");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 100);
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
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0950");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
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
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0951");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0952");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.startPage((java.lang.Integer) 100);
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0953");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder14.maxResults((java.lang.Integer) 0);
        java.lang.Class<?> wildcardClass25 = builder14.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0954");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.searchTerms("");
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
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0955");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 1);
        java.lang.Class<?> wildcardClass7 = builder2.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0956");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0957");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("");
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
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0958");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
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
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0959");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.searchTerms("hi!");
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
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0960");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 10);
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
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0961");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.additionalParams(strMap17);
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
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0962");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startPage((java.lang.Integer) 10);
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
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0963");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
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
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0964");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 0);
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
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0965");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startPage((java.lang.Integer) 100);
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
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0966");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.safeSearch((java.lang.Boolean) true);
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
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0967");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 1);
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
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0968");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
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
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0969");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.startPage((java.lang.Integer) 0);
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
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0970");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) 0);
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
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0971");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 10);
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
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0972");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
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
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0973");
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
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0974");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 1);
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
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0975");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0976");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0977");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 10);
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
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0978");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
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
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0979");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0980");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.safeSearch((java.lang.Boolean) true);
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
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0981");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.language("hi!");
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
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0982");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.searchTerms("hi!");
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
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0983");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.language("hi!");
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
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0984");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.maxResults((java.lang.Integer) (-1));
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
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0985");
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
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0986");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
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
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0987");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0988");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
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
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0989");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
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
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0990");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.maxResults((java.lang.Integer) 10);
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
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0991");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.searchTerms("");
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
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0992");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 10);
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
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0993");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
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
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0994");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder12.startIndex((java.lang.Integer) 100);
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
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0995");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.searchTerms("hi!");
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
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0996");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.maxResults((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.additionalParams(strMap15);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.additionalParams(strMap17);
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
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0997");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0998");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test0999");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 1);
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
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest1.test1000");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }
}


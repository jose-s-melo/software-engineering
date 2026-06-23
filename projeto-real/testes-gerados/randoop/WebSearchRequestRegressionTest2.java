import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class WebSearchRequestRegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1001");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("hi!");
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
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1002");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("");
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
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1003");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1004");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
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
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1005");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("hi!");
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
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1006");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1007");
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
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1008");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1009");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1010");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.geoLocation("hi!");
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
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1011");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) (-1));
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
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1012");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
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
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1013");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.language("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1014");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 1);
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
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1015");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 100);
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
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1016");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1017");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1018");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 0);
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
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1019");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.additionalParams(strMap15);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1020");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 100);
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
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1021");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1022");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
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
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1023");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) (-1));
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
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1024");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
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
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1025");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1026");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 0);
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
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1027");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
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
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1028");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.geoLocation("hi!");
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
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1029");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 100);
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
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1030");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startIndex((java.lang.Integer) (-1));
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
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1031");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startIndex((java.lang.Integer) 1);
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
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1032");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
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
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1033");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
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
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1034");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
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
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1035");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1036");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 100);
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
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1037");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder10.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1038");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 100);
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
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1039");
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
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1040");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.maxResults((java.lang.Integer) 0);
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
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1041");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
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
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1042");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("hi!");
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
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1043");
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
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1044");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1045");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
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
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1046");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1047");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.additionalParams(strMap19);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.language("");
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
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1048");
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
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1049");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        java.lang.Class<?> wildcardClass9 = builder4.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1050");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder10.geoLocation("");
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
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1051");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.additionalParams(strMap19);
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
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1052");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1053");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.searchTerms("hi!");
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
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1054");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1055");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
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
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1056");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("hi!");
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
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1057");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1058");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) (-1));
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
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1059");
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
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1060");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder22.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder22.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1061");
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
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1062");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1063");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1064");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder12.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1065");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.geoLocation("hi!");
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
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1066");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) (-1));
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
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1067");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
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
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1068");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder24.language("hi!");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1069");
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
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1070");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1071");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1072");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1073");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.geoLocation("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.additionalParams(strMap11);
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
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1074");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1075");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
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
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1076");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1077");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("hi!");
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
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1078");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1079");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1080");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1081");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 100);
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
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1082");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) 10);
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
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1083");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.language("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1084");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.geoLocation("hi!");
        java.lang.Class<?> wildcardClass25 = builder24.getClass();
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1085");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.searchTerms("hi!");
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
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1086");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.language("");
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
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1087");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.safeSearch((java.lang.Boolean) false);
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
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1088");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.startPage((java.lang.Integer) 100);
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
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1089");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1090");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1091");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.language("hi!");
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
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1092");
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
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1093");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
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
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1094");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1095");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.safeSearch((java.lang.Boolean) true);
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
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1096");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("hi!");
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
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1097");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder26 = builder20.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1098");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) (-1));
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
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1099");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 100);
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
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1100");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder10.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1101");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) (-1));
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
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1102");
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
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1103");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1104");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 10);
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
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1105");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1106");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder32 = builder22.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1107");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder2.language("");
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
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1108");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
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
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1109");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1110");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1111");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.startIndex((java.lang.Integer) 100);
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
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1112");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
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
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1113");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 100);
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
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1114");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
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
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1115");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
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
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1116");
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
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1117");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.maxResults((java.lang.Integer) 1);
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
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1118");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1119");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startIndex((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1120");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("");
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
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1121");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
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
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1122");
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
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1123");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1124");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder0.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1125");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.geoLocation("hi!");
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
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1126");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.maxResults((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1127");
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
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1128");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("hi!");
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
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1129");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1130");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1131");
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
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1132");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
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
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1133");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.language("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1134");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.startPage((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1135");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.geoLocation("");
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
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1136");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
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
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1137");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startIndex((java.lang.Integer) 0);
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
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1138");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.startPage((java.lang.Integer) 10);
        java.lang.Class<?> wildcardClass9 = builder0.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1139");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
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
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1140");
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
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1141");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1142");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.startPage((java.lang.Integer) 10);
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
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1143");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1144");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startPage((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
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
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1145");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startPage((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("hi!");
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
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1146");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.searchTerms("hi!");
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
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1147");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder18.safeSearch((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1148");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.language("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.maxResults((java.lang.Integer) 100);
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
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1149");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder18.startPage((java.lang.Integer) (-1));
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
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1150");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.maxResults((java.lang.Integer) 1);
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
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1151");
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
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1152");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) true);
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
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1153");
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
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1154");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startPage((java.lang.Integer) 1);
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
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1155");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1156");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder12.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.geoLocation("");
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
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1157");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) false);
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
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1158");
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
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1159");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.additionalParams(strMap5);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) false);
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
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1160");
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
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1161");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 10);
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
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1162");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
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
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1163");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.startIndex((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder2.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder10.safeSearch((java.lang.Boolean) false);
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
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1164");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.geoLocation("");
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.additionalParams(strMap11);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("");
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
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1165");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.startPage((java.lang.Integer) (-1));
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
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1166");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.startIndex((java.lang.Integer) 100);
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
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1167");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder18.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1168");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) true);
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
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1169");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder28 = builder24.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder30 = builder24.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder32 = builder24.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1170");
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
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1171");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder16.startPage((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1172");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.language("");
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
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1173");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.maxResults((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1174");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.maxResults((java.lang.Integer) (-1));
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
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1175");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder2.additionalParams(strMap7);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.safeSearch((java.lang.Boolean) true);
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
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1176");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.safeSearch((java.lang.Boolean) false);
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
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1177");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder14.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1178");
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
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1179");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1180");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startPage((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1181");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 10);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1182");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.maxResults((java.lang.Integer) 1);
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
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1183");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startIndex((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1184");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1185");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.geoLocation("");
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
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1186");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.searchTerms("hi!");
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
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1187");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.startIndex((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.maxResults((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder4.language("");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1188");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.startIndex((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.additionalParams(strMap11);
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
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1189");
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
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1190");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
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
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1191");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder16.maxResults((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder20.geoLocation("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder20.startIndex((java.lang.Integer) (-1));
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1192");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.safeSearch((java.lang.Boolean) true);
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
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1193");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.geoLocation("");
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
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1194");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 1);
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
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1195");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.searchTerms("");
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
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1196");
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
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1197");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startPage((java.lang.Integer) 0);
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
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1198");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.additionalParams(strMap19);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1199");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1200");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder12.maxResults((java.lang.Integer) 1);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1201");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder16.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder24 = builder16.searchTerms("hi!");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1202");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.safeSearch((java.lang.Boolean) true);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.additionalParams(strMap13);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder6.startIndex((java.lang.Integer) 0);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder6.additionalParams(strMap17);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder6.geoLocation("hi!");
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1203");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startIndex((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder4.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.language("hi!");
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
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1204");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 1);
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
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1205");
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
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1206");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder20 = builder14.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder14.searchTerms("");
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
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1207");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) (-1));
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
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1208");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.startPage((java.lang.Integer) (-1));
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.additionalParams(strMap7);
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
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1209");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder14.startPage((java.lang.Integer) (-1));
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
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1210");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder4.startPage((java.lang.Integer) 0);
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
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1211");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 1);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.geoLocation("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1212");
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
        dev.langchain4j.web.search.WebSearchRequest.Builder builder22 = builder12.safeSearch((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1213");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder2.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.startIndex((java.lang.Integer) (-1));
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
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1214");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.maxResults((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder8.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder8.startPage((java.lang.Integer) 1);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder16 = builder8.startPage((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder18 = builder16.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
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
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1215");
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
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1216");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.language("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.searchTerms("");
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
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1217");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder6.maxResults((java.lang.Integer) 0);
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
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1218");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder2.additionalParams(strMap3);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder4.startIndex((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1219");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder4.startPage((java.lang.Integer) 100);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1220");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startPage((java.lang.Integer) (-1));
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.geoLocation("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.maxResults((java.lang.Integer) 10);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder8.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder10.startPage((java.lang.Integer) 0);
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
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1221");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.startIndex((java.lang.Integer) 0);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.safeSearch((java.lang.Boolean) false);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder6.searchTerms("");
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = null;
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder6.additionalParams(strMap9);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder12 = builder6.searchTerms("hi!");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder14 = builder12.maxResults((java.lang.Integer) 100);
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
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "WebSearchRequestRegressionTest2.test1222");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder0 = dev.langchain4j.web.search.WebSearchRequest.builder();
        dev.langchain4j.web.search.WebSearchRequest.Builder builder2 = builder0.searchTerms("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder4 = builder0.language("");
        dev.langchain4j.web.search.WebSearchRequest.Builder builder6 = builder0.startIndex((java.lang.Integer) 100);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder8 = builder0.safeSearch((java.lang.Boolean) true);
        dev.langchain4j.web.search.WebSearchRequest.Builder builder10 = builder0.searchTerms("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }
}


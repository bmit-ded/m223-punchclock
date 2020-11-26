package ch.zli.m223.punchclock.filter;

public class SecurityConstants {
    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
    public static final String GET_INDEX_HTML = "/index.html";
    public static final String GET_INDEX_JS = "/index.js";
    public static final String GET_LOGIN_URL = "/login";
    public static final String GET_ENTRY = "/entries";
    public static final String GET_HOMEPAGE = "/homepage.html";
    public static final String GET_HOMEPAGE_JS = "/homepage.js";
    public static final String GET_REGISTRY = "/registry.html";
    public static final String GET_REGISTRY_JS = "/registry.js";
    public static final String GET_USERS = "/users/";



}
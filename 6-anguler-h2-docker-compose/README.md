# Changes
default db is H2 in application.pro <br>
mysql docker image config in  application-docker.pro [default profile]<br>


# Startup
docker-compose up

# Troubleshoot
Error : [403]  Request has been blocked by CORS policy: No 'Access-Control-Allow-Origin' header is present on the requested resource. spring boot <br>
Fix :

```
@Configuration
public class SequertyConfig  {

	 @Bean
	    public CorsFilter corsFilter() {
	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        CorsConfiguration config = new CorsConfiguration();
	        config.setAllowCredentials(true);
	        config.addAllowedOrigin("*");
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("OPTIONS");
	        config.addAllowedMethod("GET");
	        config.addAllowedMethod("POST");
	        config.addAllowedMethod("PUT");
	        config.addAllowedMethod("DELETE");
	        source.registerCorsConfiguration("/**", config);
	        return new CorsFilter(source);
	    }
}

```

package io.swagger.api;

import io.swagger.model.ListIPAddresses;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")
@RestController
public class IpaddressesApiController implements IpaddressesApi {

    private static final Logger log = LoggerFactory.getLogger(IpaddressesApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public IpaddressesApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ListIPAddresses> deleteIPAddressesByID(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListIPAddresses>(objectMapper.readValue("[ {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n}, {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n} ]", ListIPAddresses.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListIPAddresses>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListIPAddresses>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListIPAddresses> getIPAddressesByID(@Parameter(in = ParameterIn.PATH, description = "Get ip addresses for use", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListIPAddresses>(objectMapper.readValue("[ {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n}, {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n} ]", ListIPAddresses.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListIPAddresses>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListIPAddresses>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListIPAddresses> postIPAddressesByID(@Parameter(in = ParameterIn.PATH, description = "You can change ip addresses", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListIPAddresses>(objectMapper.readValue("[ {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n}, {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n} ]", ListIPAddresses.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListIPAddresses>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListIPAddresses>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ListIPAddresses> putIPAddressesByID(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ListIPAddresses>(objectMapper.readValue("[ {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n}, {\n  \"price\" : 6,\n  \"DiskID\" : 0,\n  \"capacity\" : \"1 IP IPv4 64 IPv6 subnet, 2 IPs IPv4 64 IPv6 subnet, 3 IPs IPv4 64 IPv6 subnet, 4 IPs IPv4 64 IPv6 subnet\"\n} ]", ListIPAddresses.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ListIPAddresses>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ListIPAddresses>(HttpStatus.NOT_IMPLEMENTED);
    }

}

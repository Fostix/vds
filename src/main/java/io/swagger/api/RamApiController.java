package io.swagger.api;

import io.swagger.model.RAMs;
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
public class RamApiController implements RamApi {

    private static final Logger log = LoggerFactory.getLogger(RamApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public RamApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<RAMs> deleteRAMByID(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RAMs>(objectMapper.readValue("[ {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n}, {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n} ]", RAMs.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RAMs>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RAMs>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RAMs> getRAMByID(@Parameter(in = ParameterIn.PATH, description = "Get ram for use", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RAMs>(objectMapper.readValue("[ {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n}, {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n} ]", RAMs.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RAMs>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RAMs>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RAMs> postRAMByID(@Parameter(in = ParameterIn.PATH, description = "You can change RAM to more memory ones or less memory ones", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RAMs>(objectMapper.readValue("[ {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n}, {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n} ]", RAMs.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RAMs>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RAMs>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<RAMs> putRAMByID(@Parameter(in = ParameterIn.PATH, description = "", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<RAMs>(objectMapper.readValue("[ {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n}, {\n  \"memory\" : 6,\n  \"price\" : 5,\n  \"RAMID\" : 0,\n  \"frequency\" : 1\n} ]", RAMs.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<RAMs>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<RAMs>(HttpStatus.NOT_IMPLEMENTED);
    }

}

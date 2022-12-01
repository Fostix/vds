package io.swagger.api;

import io.swagger.model.Processor;
import io.swagger.model.Processors;
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
public class ProcessorApiController implements ProcessorApi {

    private static final Logger log = LoggerFactory.getLogger(ProcessorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProcessorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Processors> deleteProcessorByID(@Parameter(in = ParameterIn.PATH, description = "Identifier processor", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Processors>(objectMapper.readValue("[ {\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n}, {\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n} ]", Processors.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Processors>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Processors>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Processor> getProcessorByID(@Parameter(in = ParameterIn.PATH, description = "Get processor for use", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Processor>(objectMapper.readValue("{\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n}", Processor.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Processor>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Processor>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Processors> postProcessorByID(@Parameter(in = ParameterIn.PATH, description = "You can change processors to less powerful ones or more powerful ones.", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Processors>(objectMapper.readValue("[ {\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n}, {\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n} ]", Processors.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Processors>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Processors>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Processors> putProcessorByID(@Parameter(in = ParameterIn.PATH, description = "Identifier processor", required=true, schema=@Schema()) @PathVariable("id") Long id) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Processors>(objectMapper.readValue("[ {\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n}, {\n  \"core\" : \"count core then more than better\",\n  \"processorID\" : 0,\n  \"price\" : \"10000\",\n  \"brand\" : \"intel or amd\",\n  \"architecture\" : \"Zen4\",\n  \"frequency\" : \"3,4\"\n} ]", Processors.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Processors>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Processors>(HttpStatus.NOT_IMPLEMENTED);
    }

}

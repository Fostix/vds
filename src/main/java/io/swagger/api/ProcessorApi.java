/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.36).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Processor;
import io.swagger.model.Processors;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-01T04:50:02.206Z[GMT]")
@Validated
public interface ProcessorApi {

    @Operation(summary = "Delete processor", description = "", tags={ "Processor" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully processor deleted", content = @Content(mediaType = "application/json;charset&#x3D;UTF-8", schema = @Schema(implementation = Processors.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad syntactic"),
        
        @ApiResponse(responseCode = "404", description = "No such processor founda"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error"),
        
        @ApiResponse(responseCode = "504", description = "Gateway timeout") })
    @RequestMapping(value = "/processor/{id}",
        produces = { "application/json;charset=UTF-8" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Processors> deleteProcessorByID(@Parameter(in = ParameterIn.PATH, description = "Identifier processor", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Rent processor capability", description = "", tags={ "Processor" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully", content = @Content(mediaType = "application/json;charset&#x3D;UTF-8", schema = @Schema(implementation = Processor.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad syntactic"),
        
        @ApiResponse(responseCode = "404", description = "No such processor found"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error"),
        
        @ApiResponse(responseCode = "504", description = "Gateway timeout") })
    @RequestMapping(value = "/processor/{id}",
        produces = { "application/json;charset=UTF-8" }, 
        method = RequestMethod.GET)
    ResponseEntity<Processor> getProcessorByID(@Parameter(in = ParameterIn.PATH, description = "Get processor for use", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Change processor", description = "", tags={ "Processor" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Successfully processor changed", content = @Content(mediaType = "application/json;charset&#x3D;UTF-8", schema = @Schema(implementation = Processors.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad syntactic"),
        
        @ApiResponse(responseCode = "402", description = "Payment required"),
        
        @ApiResponse(responseCode = "404", description = "No such processor found"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error"),
        
        @ApiResponse(responseCode = "504", description = "Gateway timeout") })
    @RequestMapping(value = "/processor/{id}",
        produces = { "application/json;charset=UTF-8" }, 
        method = RequestMethod.POST)
    ResponseEntity<Processors> postProcessorByID(@Parameter(in = ParameterIn.PATH, description = "You can change processors to less powerful ones or more powerful ones.", required=true, schema=@Schema()) @PathVariable("id") Long id);


    @Operation(summary = "Buy processor", description = "", tags={ "Processor" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "processor added", content = @Content(mediaType = "application/json;charset&#x3D;UTF-8", schema = @Schema(implementation = Processors.class))),
        
        @ApiResponse(responseCode = "400", description = "Bad syntactic"),
        
        @ApiResponse(responseCode = "402", description = "Payment required"),
        
        @ApiResponse(responseCode = "404", description = "No such processor found"),
        
        @ApiResponse(responseCode = "500", description = "Internal server error"),
        
        @ApiResponse(responseCode = "504", description = "Gateway timeout") })
    @RequestMapping(value = "/processor/{id}",
        produces = { "application/json;charset=UTF-8" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Processors> putProcessorByID(@Parameter(in = ParameterIn.PATH, description = "Identifier processor", required=true, schema=@Schema()) @PathVariable("id") Long id);

}

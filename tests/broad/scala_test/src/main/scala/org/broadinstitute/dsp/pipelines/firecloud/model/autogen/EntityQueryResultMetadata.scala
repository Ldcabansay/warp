/**
  * FireCloud
  * Genome analysis execution service.
  *
  * OpenAPI spec version: 0.1
  *
  *
  * NOTE: This class is auto generated by the swagger code generator program.
  * https://github.com/swagger-api/swagger-codegen.git
  * Do not edit the class manually.
  */
package org.broadinstitute.dsp.pipelines.firecloud.model.autogen

case class EntityQueryResultMetadata(
    /* count of results before filtering */
    unfilteredCount: Number,
    /* count of results after filtering */
    filteredCount: Number,
    /* count of pages after filtering; honors pageSize parameter */
    filteredPageCount: Number
)

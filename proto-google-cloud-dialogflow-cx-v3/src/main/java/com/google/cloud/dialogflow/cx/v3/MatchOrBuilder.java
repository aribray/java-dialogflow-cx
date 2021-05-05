/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/cx/v3/session.proto

package com.google.cloud.dialogflow.cx.v3;

public interface MatchOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.Match)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the query.
   * Some, not all fields are filled in this message, including but not limited
   * to: `name` and `display_name`. Only filled for
   * [`INTENT`][google.cloud.dialogflow.cx.v3.Match.MatchType] match type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 1;</code>
   *
   * @return Whether the intent field is set.
   */
  boolean hasIntent();
  /**
   *
   *
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the query.
   * Some, not all fields are filled in this message, including but not limited
   * to: `name` and `display_name`. Only filled for
   * [`INTENT`][google.cloud.dialogflow.cx.v3.Match.MatchType] match type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 1;</code>
   *
   * @return The intent.
   */
  com.google.cloud.dialogflow.cx.v3.Intent getIntent();
  /**
   *
   *
   * <pre>
   * The [Intent][google.cloud.dialogflow.cx.v3.Intent] that matched the query.
   * Some, not all fields are filled in this message, including but not limited
   * to: `name` and `display_name`. Only filled for
   * [`INTENT`][google.cloud.dialogflow.cx.v3.Match.MatchType] match type.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Intent intent = 1;</code>
   */
  com.google.cloud.dialogflow.cx.v3.IntentOrBuilder getIntentOrBuilder();

  /**
   *
   *
   * <pre>
   * The event that matched the query. Only filled for
   * [`EVENT`][google.cloud.dialogflow.cx.v3.Match.MatchType] match type.
   * </pre>
   *
   * <code>string event = 6;</code>
   *
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   *
   *
   * <pre>
   * The event that matched the query. Only filled for
   * [`EVENT`][google.cloud.dialogflow.cx.v3.Match.MatchType] match type.
   * </pre>
   *
   * <code>string event = 6;</code>
   *
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString getEventBytes();

  /**
   *
   *
   * <pre>
   * The collection of parameters extracted from the query.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: depending on parameter value type, could be one of string,
   *         number, boolean, null, list or map
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 2;</code>
   *
   * @return Whether the parameters field is set.
   */
  boolean hasParameters();
  /**
   *
   *
   * <pre>
   * The collection of parameters extracted from the query.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: depending on parameter value type, could be one of string,
   *         number, boolean, null, list or map
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 2;</code>
   *
   * @return The parameters.
   */
  com.google.protobuf.Struct getParameters();
  /**
   *
   *
   * <pre>
   * The collection of parameters extracted from the query.
   * Depending on your protocol or client library language, this is a
   * map, associative array, symbol table, dictionary, or JSON object
   * composed of a collection of (MapKey, MapValue) pairs:
   * -   MapKey type: string
   * -   MapKey value: parameter name
   * -   MapValue type:
   *     -   If parameter's entity type is a composite entity: map
   *     -   Else: depending on parameter value type, could be one of string,
   *         number, boolean, null, list or map
   * -   MapValue value:
   *     -   If parameter's entity type is a composite entity:
   *         map from composite entity property names to property values
   *     -   Else: parameter value
   * </pre>
   *
   * <code>.google.protobuf.Struct parameters = 2;</code>
   */
  com.google.protobuf.StructOrBuilder getParametersOrBuilder();

  /**
   *
   *
   * <pre>
   * Final text input which was matched during MatchIntent. This value can be
   * different from original input sent in request because of spelling
   * correction or other processing.
   * </pre>
   *
   * <code>string resolved_input = 3;</code>
   *
   * @return The resolvedInput.
   */
  java.lang.String getResolvedInput();
  /**
   *
   *
   * <pre>
   * Final text input which was matched during MatchIntent. This value can be
   * different from original input sent in request because of spelling
   * correction or other processing.
   * </pre>
   *
   * <code>string resolved_input = 3;</code>
   *
   * @return The bytes for resolvedInput.
   */
  com.google.protobuf.ByteString getResolvedInputBytes();

  /**
   *
   *
   * <pre>
   * Type of this [Match][google.cloud.dialogflow.cx.v3.Match].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match.MatchType match_type = 4;</code>
   *
   * @return The enum numeric value on the wire for matchType.
   */
  int getMatchTypeValue();
  /**
   *
   *
   * <pre>
   * Type of this [Match][google.cloud.dialogflow.cx.v3.Match].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Match.MatchType match_type = 4;</code>
   *
   * @return The matchType.
   */
  com.google.cloud.dialogflow.cx.v3.Match.MatchType getMatchType();

  /**
   *
   *
   * <pre>
   * The confidence of this match. Values range from 0.0 (completely uncertain)
   * to 1.0 (completely certain).
   * This value is for informational purpose only and is only used to help match
   * the best intent within the classification threshold. This value may change
   * for the same end-user expression at any time due to a model retraining or
   * change in implementation.
   * </pre>
   *
   * <code>float confidence = 5;</code>
   *
   * @return The confidence.
   */
  float getConfidence();
}

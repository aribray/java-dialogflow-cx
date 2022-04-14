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
// source: google/cloud/dialogflow/cx/v3/audio_config.proto

package com.google.cloud.dialogflow.cx.v3;

public final class AudioConfigProto {
  private AudioConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/dialogflow/cx/v3/audio_co"
          + "nfig.proto\022\035google.cloud.dialogflow.cx.v"
          + "3\032\037google/api/field_behavior.proto\032\036goog"
          + "le/protobuf/duration.proto\"\222\001\n\016SpeechWor"
          + "dInfo\022\014\n\004word\030\003 \001(\t\022/\n\014start_offset\030\001 \001("
          + "\0132\031.google.protobuf.Duration\022-\n\nend_offs"
          + "et\030\002 \001(\0132\031.google.protobuf.Duration\022\022\n\nc"
          + "onfidence\030\004 \001(\002\"\233\002\n\020InputAudioConfig\022I\n\016"
          + "audio_encoding\030\001 \001(\0162,.google.cloud.dial"
          + "ogflow.cx.v3.AudioEncodingB\003\340A\002\022\031\n\021sampl"
          + "e_rate_hertz\030\002 \001(\005\022\030\n\020enable_word_info\030\r"
          + " \001(\010\022\024\n\014phrase_hints\030\004 \003(\t\022\r\n\005model\030\007 \001("
          + "\t\022H\n\rmodel_variant\030\n \001(\01621.google.cloud."
          + "dialogflow.cx.v3.SpeechModelVariant\022\030\n\020s"
          + "ingle_utterance\030\010 \001(\010\"i\n\024VoiceSelectionP"
          + "arams\022\014\n\004name\030\001 \001(\t\022C\n\013ssml_gender\030\002 \001(\016"
          + "2..google.cloud.dialogflow.cx.v3.SsmlVoi"
          + "ceGender\"\266\001\n\026SynthesizeSpeechConfig\022\025\n\rs"
          + "peaking_rate\030\001 \001(\001\022\r\n\005pitch\030\002 \001(\001\022\026\n\016vol"
          + "ume_gain_db\030\003 \001(\001\022\032\n\022effects_profile_id\030"
          + "\005 \003(\t\022B\n\005voice\030\004 \001(\01323.google.cloud.dial"
          + "ogflow.cx.v3.VoiceSelectionParams\"\330\001\n\021Ou"
          + "tputAudioConfig\022O\n\016audio_encoding\030\001 \001(\0162"
          + "2.google.cloud.dialogflow.cx.v3.OutputAu"
          + "dioEncodingB\003\340A\002\022\031\n\021sample_rate_hertz\030\002 "
          + "\001(\005\022W\n\030synthesize_speech_config\030\003 \001(\01325."
          + "google.cloud.dialogflow.cx.v3.Synthesize"
          + "SpeechConfig*\373\001\n\rAudioEncoding\022\036\n\032AUDIO_"
          + "ENCODING_UNSPECIFIED\020\000\022\034\n\030AUDIO_ENCODING"
          + "_LINEAR_16\020\001\022\027\n\023AUDIO_ENCODING_FLAC\020\002\022\030\n"
          + "\024AUDIO_ENCODING_MULAW\020\003\022\026\n\022AUDIO_ENCODIN"
          + "G_AMR\020\004\022\031\n\025AUDIO_ENCODING_AMR_WB\020\005\022\033\n\027AU"
          + "DIO_ENCODING_OGG_OPUS\020\006\022)\n%AUDIO_ENCODIN"
          + "G_SPEEX_WITH_HEADER_BYTE\020\007*v\n\022SpeechMode"
          + "lVariant\022$\n SPEECH_MODEL_VARIANT_UNSPECI"
          + "FIED\020\000\022\026\n\022USE_BEST_AVAILABLE\020\001\022\020\n\014USE_ST"
          + "ANDARD\020\002\022\020\n\014USE_ENHANCED\020\003*\215\001\n\017SsmlVoice"
          + "Gender\022!\n\035SSML_VOICE_GENDER_UNSPECIFIED\020"
          + "\000\022\032\n\026SSML_VOICE_GENDER_MALE\020\001\022\034\n\030SSML_VO"
          + "ICE_GENDER_FEMALE\020\002\022\035\n\031SSML_VOICE_GENDER"
          + "_NEUTRAL\020\003*\354\001\n\023OutputAudioEncoding\022%\n!OU"
          + "TPUT_AUDIO_ENCODING_UNSPECIFIED\020\000\022#\n\037OUT"
          + "PUT_AUDIO_ENCODING_LINEAR_16\020\001\022\035\n\031OUTPUT"
          + "_AUDIO_ENCODING_MP3\020\002\022%\n!OUTPUT_AUDIO_EN"
          + "CODING_MP3_64_KBPS\020\004\022\"\n\036OUTPUT_AUDIO_ENC"
          + "ODING_OGG_OPUS\020\003\022\037\n\033OUTPUT_AUDIO_ENCODIN"
          + "G_MULAW\020\005B\304\001\n!com.google.cloud.dialogflo"
          + "w.cx.v3B\020AudioConfigProtoP\001Z?google.gola"
          + "ng.org/genproto/googleapis/cloud/dialogf"
          + "low/cx/v3;cx\370\001\001\242\002\002DF\252\002\035Google.Cloud.Dial"
          + "ogflow.Cx.V3\352\002!Google::Cloud::Dialogflow"
          + "::CX::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_SpeechWordInfo_descriptor,
            new java.lang.String[] {
              "Word", "StartOffset", "EndOffset", "Confidence",
            });
    internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_InputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding",
              "SampleRateHertz",
              "EnableWordInfo",
              "PhraseHints",
              "Model",
              "ModelVariant",
              "SingleUtterance",
            });
    internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_VoiceSelectionParams_descriptor,
            new java.lang.String[] {
              "Name", "SsmlGender",
            });
    internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_SynthesizeSpeechConfig_descriptor,
            new java.lang.String[] {
              "SpeakingRate", "Pitch", "VolumeGainDb", "EffectsProfileId", "Voice",
            });
    internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3_OutputAudioConfig_descriptor,
            new java.lang.String[] {
              "AudioEncoding", "SampleRateHertz", "SynthesizeSpeechConfig",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

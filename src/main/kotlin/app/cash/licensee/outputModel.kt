/*
 * Copyright (C) 2021 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package app.cash.licensee

import kotlinx.serialization.Serializable

@Serializable
data class ArtifactDetail(
  val groupId: String,
  val artifactId: String,
  val version: String,
  // TODO do we need to include extension and classifier?
  val spdxLicenses: Set<SpdxLicense> = emptySet(),
  val unknownLicenses: Set<UnknownLicense> = emptySet(),
  val scm: ArtifactScm? = null,
)

@Serializable
data class SpdxLicense(
  val identifier: String,
  val name: String,
  val url: String,
)

@Serializable
data class UnknownLicense(
  val name: String?,
  val url: String?,
)

@Serializable
data class ArtifactScm(
  val url: String,
)

/*
 * Copyright 2024 OmniOne.
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

package org.omnione.did.base.datamodel.enums;

import com.fasterxml.jackson.annotation.JsonValue;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Enum class for the OFFER_TYPE in Data Specification documentation.
 */
@Getter
public enum OfferType {
    @SerializedName("IssueOffer")
    ISSUE_OFFER("IssueOffer"),
    @SerializedName("VerifyOffer")
    VERIFY_OFFER("VerifyOffer"),
    @SerializedName("RestoreDidOffer")
    RESTORE_DID_OFFER("RestoreDidOffer"),
    ;
    @JsonValue
    private final String value;

    OfferType(String value) {
        this.value = value;
    }
}

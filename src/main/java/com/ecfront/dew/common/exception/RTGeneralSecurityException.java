/*
 * Copyright 2020. the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.ecfront.dew.common.exception;

/**
 * The type Rt general security exception.
 *
 * @author gudaoxuri
 */
public class RTGeneralSecurityException extends RTException {

    /**
     * Instantiates a new Rt general security exception.
     */
    public RTGeneralSecurityException() {
    }

    /**
     * Instantiates a new Rt general security exception.
     *
     * @param message the message
     */
    public RTGeneralSecurityException(String message) {
        super(message);
    }

    /**
     * Instantiates a new Rt general security exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public RTGeneralSecurityException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Instantiates a new Rt general security exception.
     *
     * @param cause the cause
     */
    public RTGeneralSecurityException(Throwable cause) {
        super(cause);
    }

    /**
     * Instantiates a new Rt general security exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public RTGeneralSecurityException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

package com.example.houseutils.exception

class HouseUtilsException : RuntimeException {

    private val errorCode: ErrorCode
    private val errorMessage: String

    constructor(errorCode: ErrorCode) : super(errorCode.message) {
        this.errorCode = errorCode
        this.errorMessage = errorCode.message
    }

    constructor(errorCode: ErrorCode, errorMessage: String) : super(errorMessage) {
        this.errorCode = errorCode
        this.errorMessage = errorMessage
    }
}
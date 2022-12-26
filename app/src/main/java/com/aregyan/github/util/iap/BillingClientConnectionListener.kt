package com.aregyan.github.util.iap

interface BillingClientConnectionListener {
    fun onConnected(status: Boolean, billingResponseCode: Int)
}
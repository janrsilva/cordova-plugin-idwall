package com.janrsilva.cordova.plugin;
// The native Toast API
import android.widget.Toast;
// Cordova-required packages
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import co.idwall.idwallsdk.*;
import android.util.Log;
import java.lang.*;
import android.content.Context;
import android.content.Intent;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CordovaInterface;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class IdwallPlugin extends CordovaPlugin {
  private static final String DURATION_LONG = "long";

  @Override
  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) {
    String message;
    try {
      JSONObject options = args.getJSONObject(0);
      message = options.getString("message");
      IDwallSDK.startFlow(cordova.getActivity(), IDwallSDK.OP_COMPLETE_FLOW);
      callbackContext.success(message);
    } catch (JSONException e) {
      callbackContext.error("Error encountered: " + e.getMessage());
      return false;
    }
    return true;
  }
}

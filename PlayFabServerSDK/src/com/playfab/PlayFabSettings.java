package com.playfab;

import com.playfab.PlayFabErrors.ErrorCallback;

public class PlayFabSettings {
    public static String SdkVersion = "0.27.160613";
    public static String BuildIdentifier = "jbuild_2";
    public static String SdkVersionString = "JavaSDK-0.27.160613";

    public static String TitleId = null; // You must set this value for PlayFabSdk to work properly (Found in the Game Manager for your title, at the PlayFab Website)
    public static ErrorCallback GlobalErrorHandler;
    public static String DeveloperSecretKey = null; // You must set this value for PlayFabSdk to work properly (Found in the Game Manager for your title, at the PlayFab Website)

    public static String GetURL() {
        return "https://" + TitleId + ".playfabapi.com";
    }
}

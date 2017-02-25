/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epicest.reusables.scripting.preset;

import com.epicest.reusables.scripting.*;

/**
 * Used when a player interacts with an Door. Preset scripts are faster than
 * normal interpreted scripts.
 *
 * @author EpicestGamer
 */
public class OnDoor extends Script {

 /**
  * Does nothing in preset scripts.
  */
 @Override
 public void setScript(String path) {
  //do nothing
 }

 /**
  * Runs code for 1.loading a new scene.
  */
 @Override
 public String getString(Runner in) {
  return "Java.type('com.epicest.reusables.PixelApplication')"
          + ".currentApplication"
          + ".loadScene("
          + "'" + in.getObject().getUserData("toPlace") + "',"
          + " '" + in.getObject().getUserData("spawnPoint") + "');";
  //"loadmap~" + in.getObject().getUserData("toPlace") + "~" + in.getObject().getUserData("spawnPoint");
 }
}

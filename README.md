# FLK Mod Template
Created to fill the void of up-to-date Kotlin mod templates. 

### Setup
- Create a repository using this mod as a template — you can do this by clicking the
  “use this template” button and proceeding with the repository GitHub creates.

- Check the versions for all fields in the gradle.properties file and update if necessary.
  Make sure to refresh dependencies after doing this to download the new versions.

- Edit the fabric.mod.json and build.gradle.kts files to suit your new mod!.

  - The “mixin” object can be removed from fabric.mod.json if you don't need to use mixins.
    The same can be said about the AccessWidener file.  

  - Make sure to replace all instances of the string “flk-template“ as necessary

  - Depending on how your mod will work, you can change the entrypoint to extend
    “ClientModInitializer“ or “ServerModInitializer“ if your mod only uses one environment.
    *If you do this, remember to change the “main“ entrypoint in mod.json to “client“ or “server“ as well!*

  - To give your mod an icon in Mod Menu, upload an image named icon.png with a square aspect ratio to the “assets“ folder.

### License
This project is licensed under The Unlicense. As expected from a template, you can do 
anything you want with this code: edit, copy, or modify it to your heart's content.

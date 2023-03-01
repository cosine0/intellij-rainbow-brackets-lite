
<div align="center">
    <a href="https://plugins.jetbrains.com/plugin/10080-rainbow-brackets">
        <img src="./src/main/resources/META-INF/pluginIcon.svg" width="320" height="320" alt="logo"/>
    </a>
</div>
<h1 align="center">Intellij Rainbow Brackets Lite </h1>
<p align="center">🌈Rainbow Brackets for IntelliJ based IDEs.</p>
<br>

- [Change log](CHANGELOG.md)
- [Compatibility](#compatibility)
- [Supported languages](#supported-languages)
- [Screenshots](#screenshots)
- [Customize colors](#customize-colors)
- [Use color generator](#use-color-generator)
- [Config file path](#config-file-path)
- [HTML code in js](#html-code-in-js)
- [Kotlin function literal braces and arrow](#kotlin-function-literal-braces-and-arrow)
- [Disable rainbow brackets for specific languages](#disable-rainbow-brackets-for-specific-languages)
- [Contribute](#contribute)
- [Acknowledgements](#acknowledgements)

## Rainbow Brackets Lite

This repo is using to compile a fully free version of our product for the community to use. This is because some users do not need the paid features and do not want to constantly update their software. An open-source, fully free, and stable version is a good option for these users.

I believe this will benefit both the community and our team. The community will have access to a free version of our software, and our team will continue to receive support from those who appreciate and value the paid features.

## Compatibility

IntelliJ IDEA, PhpStorm, WebStorm, PyCharm, RubyMine, AppCode, CLion, Gogland, DataGrip, Rider, MPS, Android Studio, HUAWEI DevEco Studio, DataSpell, Code With Me

## Supported languages

Java, Scala, Clojure, Kotlin, Python, Haskell, Agda, Rust, JavaScript, TypeScript, Erlang, Go, Groovy, Ruby, Elixir, ObjectiveC, PHP, HTML, XML, SQL, Apex language, C#, Dart, Pug/Jade, Bash, Vue.js, C# Razor Pages, GLSL(the OpenGL Shading Language), Go Template, C++, C, Solidity...

## Screenshots

### Java

<img width="640" alt="java" src="https://user-images.githubusercontent.com/12044174/218252098-d73f3be1-849f-4193-a095-105b639d1955.png">


### Scala

<img width="640" alt="scala" src="https://user-images.githubusercontent.com/12044174/218252110-409c8dc0-3893-42c0-97f8-5855f88728bf.png">


### Clojure

<img width="640" alt="Clojure" src="https://user-images.githubusercontent.com/12044174/218252123-b2c2ae55-0501-46d5-81c0-4208f19958b3.png">

### Kotlin

<img width="640" alt="kotlin" src="https://user-images.githubusercontent.com/12044174/218252132-f6b0d17a-9d3b-47bc-be0c-918531ffb050.png">

### HTML/XML

**NOTE: need rurn on 'Rainbowify tag name' option**

<img width="640" alt="HTML" src="https://user-images.githubusercontent.com/12044174/218252140-926fb1cc-5836-4e9e-9a23-5d0a4d956c3c.png">

### Javascript & Typescript

**NOTE: need rurn on 'Rainbowify tag name' option**

<img width="640" alt="js" src="https://user-images.githubusercontent.com/12044174/218252159-06337dbb-ee7a-47a6-92f7-64e29f7419da.png">
<img width="640" alt="ts" src="https://user-images.githubusercontent.com/12044174/218252164-1a0547a6-a423-4a07-aa80-5200a5660aa6.png">

### C#

<img width="640" alt="CSharp" src="https://user-images.githubusercontent.com/12044174/218252203-24057a01-79ba-44e5-834d-ac4414472583.png">

### Dart

<img width="640" alt="dart" src="https://user-images.githubusercontent.com/12044174/218252217-e526703d-d644-4e51-bb17-1273f3591dc4.png">

### Python

<img width="623" alt="image" src="https://user-images.githubusercontent.com/12044174/220900164-db6476ed-e4e8-4547-966a-2db89fe82651.png">

<img width="640" alt="python" src="https://user-images.githubusercontent.com/12044174/218252230-5e21ef7c-acc4-49be-80ff-8c8ed11538ad.png">

### Pug/Jade

<img width="640" alt="pug" src="https://user-images.githubusercontent.com/12044174/218252187-1d581616-1b4a-4654-8d97-5fe9e9a505cf.png">

### Scope highlighting

**The highlight effects will not remove after release the shortcuts, but press `ESC` key can do this. You could also config `Press any key to remove the highlighting effect` in setting page.**

<kbd>Ctrl + Button3</kbd>(Windows & Linux) or <kbd>Meta + Button3</kbd>(Mac):

NOTE: <kbd>Button3</kbd> means "Secondary Click (click or tap with two fingers)" on Mac os, "Right click" for Windows or Linux.
NOTE: <kbd>Meta</kbd> means <kbd>command</kbd> on Mac os.

<img width="1000" alt="current-scope" src="https://user-images.githubusercontent.com/12044174/218252269-52373432-4054-4449-91f9-a968337b81ab.png">

![](https://user-images.githubusercontent.com/10737066/40234968-46593fe2-5adb-11e8-8ea8-0026fad86ca9.gif)

<kbd>Alt + Button3</kbd>(Windows & Linux) or <kbd>option + Button3</kbd>(Mac):

NOTE: <kbd>Button3</kbd> means "Secondary Click (click or tap with two fingers)" on Mac os, "Right click" for Windows or Linux.

<img width="1000" alt="rh" src="https://user-images.githubusercontent.com/12044174/218252282-305ece2c-e78a-453a-8558-e500d8d35c7d.png">

![](https://user-images.githubusercontent.com/10737066/40235004-642dfe54-5adb-11e8-9fd7-648b92fab8f5.gif)

### looking forward to your screenshots(PR welcome!)

## Customize colors

<kbd>Settings/Preferences</kbd> > <kbd>Editor</kbd> > <kbd>Color Scheme</kbd> > <kbd>Rainbow Brackets</kbd>:

<img width="849" alt="scheme" src="https://user-images.githubusercontent.com/12044174/218252304-5e22918f-5ab9-4bc2-8bfa-65d4614fc303.png">


## Use color generator

If you didn't like the build-in colors, or want some new color but don't want to try out and pick colors. Please use color generator.

<kbd>Settings/Preferences</kbd> > <kbd>Other Settings</kbd> > <kbd>Rainbow Brackets</kbd> > <kbd>Use color generator</kbd>

If you turn on this option, we will auto generate some colors for you.

### Advanced options of color generator

<img width="749" alt="image" src="https://user-images.githubusercontent.com/12044174/202852094-2da6945b-598e-4def-ab0c-331abdd6d3f8.png">

```hue``` – Controls the hue of the generated color. You can pass a string representing a color name: ```red```, ```orange```, ```yellow```, ```green```, ```blue```, ```purple```, ```pink``` and ```monochrome``` are currently supported. If you pass a  hexidecimal color string such as ```#00FFFF```, color generator will extract its hue value and use that to generate colors.

```luminosity``` – Controls the luminosity of the generated color. You can specify a string containing ```bright```, ```light``` or ```dark```.

### Want to config the number of colors?

<kbd>Settings/Preferences</kbd> > <kbd>Other Settings</kbd> > <kbd>Rainbow Brackets</kbd> > `Number of colors`: 5 or more

And you can use the color generator and config you number of colors at the same time.

NOTE: For default and darcula color scheme(`Editor -> Color Scheme -> Rainbow Brackets -> Scheme`) the color number is 10, for the other scheme the number is 5, if your number is bigger than the number, you can config them in the config file.
If the color is not exist, we will use color generator to generator it for you.

## Config file path

If you want to customize the advanced configuration, you could edit the config file then restart your IDE. 
Config file path in `APP_CONFIG/rainbow_brackets.xml`. 

In MAC OS env maybe like `~/Library/Preferences/IntelliJIdea2020.2/options/rainbow_brackets.xml`.

If you are using the ToolBox, then it will be like `~/Library/ApplicationSupport/JetBrains/IntelliJIdea2020.2/options/rainbow_brackets.xml`

In Linux env maybe like `~/.IntelliJIdea/config/options/rainbow_brackets.xml`.

In Windows env maybe like `C:\Users\izhangzhihao\.IntelliJIdea2020.2\config\options\rainbow_brackets.xml`.

## HTML code in js

To enable rainbow brackets for HTML inside js code like this:

```javascript
var html = '<div><div><div>Hello</div></div></div>';
```

This plugin will automatically override color scheme property "HTML_CODE" [cause our rainbow color been covered by intellij built-in functionality](https://intellij-support.jetbrains.com/hc/en-us/community/posts/360000117450-My-HighlightVisitor-been-covered-by-intellij-built-in-functionality).
You still could set `<option name="rainbowifyHTMLInsideJS" value="false" />` in config file to disable.

## Kotlin function literal braces and arrow

To enable rainbow brackets for multiple level lambda Kotlin code like this:

```kotlin
event.throwable?.let { throwable ->
    IdeErrorsDialog.findPluginId(throwable)?.let { pluginId ->
        PluginManager.getPlugin(pluginId)?.let { ideaPluginDescriptor ->
            if (!ideaPluginDescriptor.isBundled) {
                bean.pluginName = ideaPluginDescriptor.name
                bean.pluginVersion = ideaPluginDescriptor.version
            }
        }
    }
}
```

This plugin will automatically override color scheme property "KOTLIN_FUNCTION_LITERAL_BRACES_AND_ARROW" cause our rainbow color is being covered by kotlin plugin built-in functionality.
You still could set `<option name="rainbowifyKotlinFunctionLiteralBracesAndArrow" value="false" />` in config file to disable.

## Disable rainbow brackets for specific languages

<kbd>Settings/Preferences</kbd> > <kbd>Other Settings</kbd> > <kbd>Rainbow Brackets</kbd> > `Do NOT rainbowify these languages (name or extension, comma separated)`: 

NOTE: You can use **name** of language or **extension** of file name(The names should be **lowercase**).

## Contribute

NOTE: To view the PSI tree and explore the internal PSI structure of source code, you need to set up your IDE by following [this](https://www.jetbrains.com/help/idea/psi-viewer.html).
For the Rider IDE, please follow: [this](https://rider-support.jetbrains.com/hc/en-us/articles/207327910-How-to-run-JetBrains-Rider-in-Internal-Mode)

* `gradle test`
* `gradle runIde`
* `gradle buildPlugin`

## Acknowledgements

Intellij-rainbow-brackets is heavily inspired by [Rainbow Brackets for Visual Studio Code](https://marketplace.visualstudio.com/items?itemName=2gua.rainbow-brackets)

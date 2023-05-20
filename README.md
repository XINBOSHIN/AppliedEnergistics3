# Applied Energistics 3 Modern

## About

>A Mod about Matter, Energy and using them to conquer the world..

This project is a GTNH fork of Applied Energistics 3 for Minecraft 1.7.10

## Contacts

* [Website](https://appliedenergistics.github.io) _This website will contain nothing about this unofficial version._
* [GitHub](https://github.com/Xinboshin/Applied-Energistics3


## License

* Applied Energistics 3 API
  - (c) 2013 - 2015 AlgorithmX2 et al
  - [![License](https://img.shields.io/badge/License-MIT-red.svg?style=flat-square)](http://opensource.org/licenses/MIT)
* Applied Energistics 3
  - (c) 2013 - 2015 AlgorithmX2 et al
  - [![License](https://img.shields.io/badge/License-LGPLv3-blue.svg?style=flat-square)](https://raw.githubusercontent.com/AppliedEnergistics/Applied-Energistics-2/rv2/LICENSE)
* Textures and Models
  - (c) 2013 - 2015 AlgorithmX2 et al
  - [![License](https://img.shields.io/badge/License-CC%20BY--NC--SA%203.0-yellow.svg?style=flat-square)](https://creativecommons.org/licenses/by-nc-sa/3.0/)
* Text and Translations
  - [![License](https://img.shields.io/badge/License-No%20Restriction-green.svg?style=flat-square)](https://creativecommons.org/publicdomain/zero/1.0/)

## Installation

You install this mod by putting it into the `minecraft/mods/` folder. It has no additional hard dependencies.


## Contribution

Before you want to add major changes, you might want to discuss them with us first, before wasting your time.
If you are still willing to contribute to this project, you can contribute via [Pull-Request](https://help.github.com/articles/creating-a-pull-request).

The [guidelines for contributing](https://github.com/Xinboshin/Applied-Energistics3/blob/master/CONTRIBUTING.md) contain more detailed information about topics like the used code style and should also be considered.

Here are a few things to keep in mind that will help get your PR approved.

* A PR should be focused on content. Any PRs where the changes are only syntax will be rejected.
* Use the file you are editing as a style guide.
* Consider your feature. [Suggestion Guidelines](http://ae-mod.info/Suggestion-Guidelines/)
  - Is your suggestion already possible using Vanilla + AE3?
  - Make sure your feature isn't already in the works, or hasn't been rejected previously.
  - Does your feature simplify another feature of AE2? These changes will not be accepted.
  - If your feature can be done by any popular mod, discuss with us first.

Getting Started

1. Fork this repository
2. Clone the fork via
  * SSH `git clone git@github.com:<your username>/Applied-Energistics3.git` or 
  * HTTPS `git clone https://github.com/<your username>/Applied-Energistics3.git`
3. Change code base
4. Add changes to git `git add -A`
5. Commit changes to your clone `git commit -m "<summery of made changes>"`
6. Push to your fork `git push`
7. Create a Pull-Request on GitHub
8. Wait for review
9. Squash commits for cleaner history

If you are only doing single file pull requests, GitHub supports using a quick way without the need of cloning your fork. Also read up about [synching](https://help.github.com/articles/syncing-a-fork) if you plan to contribute on regular basis.

## Applied Energistics 3 API

The API for Applied Energistics 3. It is open source to discuss changes, improve documentation, and provide better add-on support in general.

Development and standard builds can be obtained at [GTNH Jenkins](http://jenkins.usrv.eu:8080/job/Applied-Energistics) too.

### Maven

When compiling against the AE2 API you can use gradle dependencies, just add

    dependencies {
        compile "appeng:appliedenergistics2:rv_-_____-__:dev"
    }

or add the compile line to your existing dependencies task to your build.gradle

Where the __ are filled in with the correct version criteria; AE2 is available from the default forge maven so no additional repositories are necessary.

An example string would be `appeng:appliedenergistics2:rv2-alpha-30:dev`

## Applied Energistics 2 Localization

### English Text

`en_US` is included in this repository, fixes to typos are welcome.

### Encoding

Files must be encoded as UTF-8.

### New or updated Translations

The language files are located in `/src/main/resources/assets/appliedenergistics3/lang/` and use the [appropriate locale code](http://minecraft.gamepedia.com/Language) as name and `.lang` as extension.

To update an translation edit the corresponding file and improve/correct the existing entry. Or copy any entries from `en_US.lang` for missing translation.

To create a new translation, copy the contents of `en_US.lang`, create a new file with appropriate filename, and translate it to your language.

Please keep in mind that we use [String format](https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html) to pass additional data to the text for displaying.
Therefore you should preserve parts like `%s` or `%1$d%%`, which allows us to replace them with the correct values while you still have the option to change their order for match the rules of grammar.
This might not be possible for some languages. Should this be the case, please contact us.

### Final Note

If you have have issues localizing something feel free to contact us on IRC, at #AppliedEnergistics on Esper.net

Thanks to everyone helping out to improve localization of AE3.

## Credits

Thanks to
 
* Notch et al for Minecraft
* Lex et al for MinecraftForge
* AlgorithmX2 for AppliedEnergistics2
* Credit to [AE2 1.18](https://github.com/AppliedEnergistics/Applied-Energistics-2) for texture contributions.

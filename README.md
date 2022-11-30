# LauNuts

Download the LauNuts knowledge graph at the [Hobbit server](https://hobbitdata.informatik.uni-leipzig.de/OPAL/LauNuts/).


## LauNuts generator

This code creates a knowledge graph for German regions and cities consisting of

- [Local Administrative Units (LAU)](https://ec.europa.eu/eurostat/web/nuts/local-administrative-units)
- [Nomenclature of Territorial Units for Statistics (NUTS)](https://ec.europa.eu/eurostat/web/nuts/background)


## Java packages and files

- [sources](./src/main/java/org/dice_research/launuts/sources) Source files metadata based on [sources.json](sources.json).


## Notes

- This is not related to the musical instrument [launut](https://www.metmuseum.org/art/collection/search/501966).
- The [Java Excel parser](https://github.com/adibaba/LauNuts/tree/e9e6d1c60060c084042df6971379747094d47c02/src/main/java/org/dice_research/launuts/excel) and [test](https://github.com/adibaba/LauNuts/tree/e9e6d1c60060c084042df6971379747094d47c02/src/test/java/org/dice_research/launuts) were removed as the JVM run out of memory. Instead, CSV is used now.


## Credits

[Data Science Group (DICE)](https://dice-research.org/) at [Paderborn University](https://www.uni-paderborn.de/)

This work has been supported by the German Federal Ministry of Transport and Digital Infrastructure (BMVI) in the project [Open Data Portal Germany (OPAL)](http://projekt-opal.de/) (funding code 19F2028A).
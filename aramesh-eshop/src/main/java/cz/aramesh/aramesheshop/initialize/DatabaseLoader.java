package cz.aramesh.aramesheshop.initialize;

import cz.aramesh.aramesheshop.model.Category;
import cz.aramesh.aramesheshop.model.Product;
import cz.aramesh.aramesheshop.repository.CategoryRepository;
import cz.aramesh.aramesheshop.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@AllArgsConstructor
public class DatabaseLoader implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        Category catOne = new Category("svítidla", "Svítidlo je elektrický spotřebič sloužící k osvětlování.");
        Category catTwo = new Category("topení", "Topení je elektrický spotřebič sloužící k vytápění.");
        Product productOne = new Product("Stolní lampa Tolomeo",
                "Stolní lampu Tolomeo Tavolo vytvořili Giancarlo " + "Fassina a Michele de Lucchi pro značku " +
                        "Artemide" + ". Tolomeo patří do rodiny lamp, které jsou založeny " + "na konzolových " +
                        "konstrukcích. Známé " + "pro svou zjednodušenou estetiku, snadno se s nimi manipuluje do " + "různých poloh. Tato " + "malá stolní lampa se neliší a poskytuje pohodlnou a přizpůsobivou možnost pro " + "povrchy " + "všech typů. Stolní lampa Tolomeo Micro Tavolo má dvoudílný konzolový rám se sadou drátěných " + "závěsů po délce hlavního sloupu. Tyto panty umožňují svítilně volný pohyb a také se může " + "otáčet " + "kolem kruhové základny. K dispozici je difuzér ve tvaru misky, který lze podle " + "potřeby nasměrovat " + "pomocí praktické smyčky na vnější straně. Rám je vyroben z leštěného" + " hliníku, zatímco difuzor má " + "matný eloxovaný hliník. K dispozici jsou různé barvy, " + "včetně přírodního kovu, lesklé zlaté nebo bílé" + " a lakované červené, černé, oranžové a " + "modré.", new BigDecimal(8896));
        Product productTwo = new Product("Vitrážová stolní lampa Tiffany",
                "Tiffany lampa je vyrobena z kombinace " + "vitrážového skla a kovových mosazných prvků, patinované " + "v" + " barvě tmavě hnědé. Navíc noha lampy je " + "zdobená rovněž vitráží. Stínidlo této " + "vitrážové" + " lampy o průměru 30 cm zdobí květy macešek a je " + "vyrobeno ručně tradiční " + "technikou. " + "Skleněné stínidlo Tiffany stolní lampy se skládá z opracovaných " + "barevn" + "ých sklíček. " + "Barevná sklíčka vytvářejí vzory a vyniknou především při rozsvícení lampy." + " Je " + "vyrobeno " + "v nejvyšší kvalitě ze skla vitrážového-opálového firmy SPECTRUM v " + "kombinaci s měděnou fólií" + " a cínu. Kombinace krásných barev především vynikne po " + "rozsvícení vitrážového svítidla.", new BigDecimal(8425));
        Product productThree = new Product("Ecofilm set ES 80-1,0 x 10m / 780 W", "Sada obsahuje jeden pás topné " +
                "folie se zaizolovanými okraji a připojovacími vodiči délky 5m.  Instalaci tak může provést " + "sv" +
                "épomocí" + " uživatel nebo podlahářská firma, zajišťující pokládku plovoucí podlahy. Součástí " +
                "balení je i návod," + " záruční list.", new BigDecimal(8817));
        Product productFour = new Product("Akumulační kamna SHF 2000", "Kompaktní, na podlaze stojící akumulační " +
                "kamna s vysokým tepelným výkonem. Komfortní a energeticky úsporný provoz díky inteligentní " +
                "technologii automatického nabíjení C-Plus-Technogy. Integrovaný regulátor teploty v místnosti s " +
                "týdenním časovačem a zjištěním otevřeného okna. Dobře přístupný ovládací prvek s podsvíceným LCD " +
                "displejem. Dlouhá životnost. Velmi tichý provoz díky tangenciálnímu ventilátoru s nízkou hlučností."
                , new BigDecimal(12718));
        productOne.addCategory(catOne);
        productTwo.addCategory(catOne);
        productThree.addCategory(catTwo);
        productFour.addCategory(catTwo);
        categoryRepository.save(catOne);
        categoryRepository.save(catTwo);
        productRepository.save(productOne);
        productRepository.save(productTwo);
        productRepository.save(productThree);
        productRepository.save(productFour);
    }
}

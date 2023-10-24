package com.example.recyclerview_p;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.recyclerview_p.Models.Equipos;
import com.example.recyclerview_p.Adapter.EquiposAdapter;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Equipos>Lista_Equipos = new ArrayList<>();
        Lista_Equipos.add(new Equipos("Real Madrid","La Liga","Santiago Bernabeu",
                "El Real Madrid Club de Fútbol, también conocido como Real Madrid, es una entidad polideportiva con sede en Madrid, España. Fundado el 6 de marzo de 1902 como Sociedad Madrid Foot-Ball Club, el club es uno de los más exitosos en la historia del fútbol. Ha ganado numerosos títulos nacionales e internacionales, incluyendo la prestigiosa UEFA Champions League. El Real Madrid tiene una intensa rivalidad con dos equipos: Atlético de Madrid y FC Barcelona. Con Atlético de Madrid, compite en el famoso \"Derbi madrileño\", mientras que con FC Barcelona, disputa el emocionante \"El Clásico\". El club cambió su nombre a \"Real Madrid\" en 1920 y su primer presidente fue Juan Padrós y es denomiado como el equipo mas grande de la historia.\n" +
                        "\n" +
                        "Su palmares;\n" +
                        "35 Ligas\n" +
                        "14 Champions League\n" +
                        "26 Copas del Rey\n" +
                        "5 Mundiales de Clubes\t\n" +
                        "3 Copa Intercontinental\n" +
                        "5 Supercopa de Europa\n" +
                        "2 Europa Leagues\n" +
                        "2 Copa Latina\n" +
                        "1 Copa Iberoamericana\n" +
                        "1 Copa de la Liga\n" +
                        "1 Copa Eva Duarte"));
        Lista_Equipos.add(new Equipos("Barcelona","La Liga","Camp Nou",
                "El Fútbol Club Barcelona, conocido como el Barcelona o Barça, es un emblemático club de fútbol con sede en Barcelona, España. Fundado en 1899, es famoso por su estilo de juego único y ha ganado numerosos títulos, incluyendo La Liga y la Liga de Campeones de la UEFA. Su rivalidad con el Real Madrid es legendaria, y el Camp Nou es su estadio icónico.\n" +
                        "\n" +
                        "Su palmares;\n" +
                        "27 Ligas\n" +
                        "31 Copa del Rey\n" +
                        "14 Supercopa de España\n" +
                        "3 Copa Eva Duarte\n" +
                        "2 Copa de la Liga\n" +
                        "3 Copa Mundial de Clubes\n" +
                        "5 Champions League\n" +
                        "5 Supercopa de Europa\n" +
                        "4 Recopa de Europa\n" +
                        "3 Copa de Ferias\n" +
                        "2 Copa Latina"));
        Lista_Equipos.add(new Equipos("Manchester United","Premier League","Old Trafford",
                "El Manchester United es un prestigioso club de fútbol con sede en Manchester, Inglaterra. Fundado en 1878, es uno de los clubes más reconocidos a nivel mundial. El equipo ha ganado numerosos títulos de la Premier League y es conocido por su rica historia y seguidores apasionados. El Old Trafford es su icónico estadio y el club ha sido hogar de legendarios futbolistas como Sir Matt Busby, Sir Bobby Charlton y Sir Alex Ferguson. La rivalidad con el Liverpool es una de las más intensas en el fútbol inglés.\n" +
                        "\n" +
                        "Su palmares;\n" +
                        "20 Premier League\n" +
                        "12 FA Cup \n" +
                        "6 Carabao Cup\n" +
                        "21 Community Shield\n" +
                        "\n" +
                        "1 Mundial de Clubes\n" +
                        "1 Copa Intercontinental\n" +
                        "3 Champions League\n" +
                        "1 Europa League\n" +
                        "1 Supercopa de Europa\n" +
                        "1 Recopa de Europa"));
        Lista_Equipos.add(new Equipos("Manchester City","Premier League","Etihad Stadium",
                "El Manchester City es un destacado club de fútbol con sede en Manchester, Inglaterra. Fundado en 1880, el equipo ha experimentado un renacimiento significativo en las últimas décadas. El City es conocido por su fútbol atractivo y su éxito en la Premier League, habiendo ganado varios títulos de liga. El Etihad Stadium es su estadio emblemático, y el club ha tenido notables entrenadores como Pep Guardiola. El derbi de Mánchester con el Manchester United es uno de los encuentros más esperados en el fútbol inglés.\n" +
                        "\n" +
                        "Su palmares;\n" +
                        "9 Premier League\n" +
                        "7 FA Cup \n" +
                        "8 Carabao Cup\n" +
                        "6 Community Shield\n" +
                        "9 Championship\n" +
                        "1 Champions League\n" +
                        "1 Supercopa de Europa\n" +
                        "1 Recopa de Europa"));
        Lista_Equipos.add(new Equipos("Chelsea","Premier League","Stamford Bridge",
                "El Chelsea Football Club, comúnmente conocido como Chelsea, es un club de fútbol con sede en Londres, Inglaterra. Fundado en 1905, el Chelsea es uno de los clubes más destacados de la Premier League y ha tenido un gran éxito en la escena del fútbol inglés e internacional. El equipo juega en el estadio Stamford Bridge, que es uno de los estadios más icónicos de la liga inglesa. El Chelsea es conocido por su estilo de juego competitivo y ha atraído a jugadores de clase mundial a lo largo de los años.\n" +
                        "\n" +
                        "Palmarés del Chelsea:\n" +
                        "\n" +
                        "6 títulos de la Premier League\n" +
                        "8 Copas de Inglaterra (FA Cup)\n" +
                        "5 Copas de la Liga (Carabao Cup)\n" +
                        "4 Copas de la Comunidad (Community Shield)\n" +
                        "2 UEFA Champions League\n" +
                        "2 Recopas de Europa\n" +
                        "2 Supercopa de Europa\n" +
                        "2 Copas de la Liga Inglesa\n" +
                        "2 Copas FA Charity\n" +
                        "1 Liga de Campeones de la UEFA\n" +
                        "2 Europa League"));
        Lista_Equipos.add(new Equipos("Liverpool","Premier League","Anfield",
                "El Liverpool Football Club, comúnmente conocido como Liverpool, es uno de los clubes más icónicos del fútbol inglés e internacional. Fundado en 1892, el club tiene una rica historia de éxitos en la Premier League y competiciones europeas, incluyendo la Liga de Campeones de la UEFA. Anfield es su famoso estadio, y el Liverpool ha tenido legendarios futbolistas y entrenadores a lo largo de los años. La rivalidad con el Everton en el \"Merseyside Derby\" es una de las más apasionadas en el fútbol británico. El Liverpool es conocido por su apoyo apasionado y su lema \"You'll Never Walk Alone\"."));
        Lista_Equipos.add(new Equipos("Juventus","Serie A","Allianz Stadium",
                "La Juventus Football Club, comúnmente conocida como la Juventus o simplemente Juve, es uno de los clubes de fútbol más destacados de Italia y Europa. Fundado en 1897, la Juventus es conocida por su dominio en la Serie A, habiendo ganado numerosos títulos de liga. El equipo juega en el estadio Allianz Stadium en Turín. La Juventus ha tenido futbolistas de renombre a lo largo de su historia y ha competido exitosamente en competiciones europeas como la Liga de Campeones de la UEFA. La rivalidad con el AC Milan e Inter de Milán es intensa y es considerada una de las más emocionantes en el fútbol italiano. La Juventus es sinónimo de éxito y pasión por el fútbol."));
        Lista_Equipos.add(new Equipos("A.C Milan","Serie A","San Siro",
                "El AC Milan, conocido simplemente como Milan, es uno de los clubes de fútbol más prominentes de Italia y del mundo. Fundado en 1899, el club tiene una rica historia de éxitos en la Serie A, habiendo ganado numerosos títulos de liga y competiciones europeas, incluyendo la Liga de Campeones de la UEFA. El equipo juega en el estadio San Siro en Milán, uno de los estadios más icónicos del fútbol. El AC Milan ha tenido una serie de futbolistas legendarios a lo largo de los años y su rivalidad con la Juventus es una de las más destacadas en el fútbol italiano. El AC Milan es sinónimo de tradición, pasión y éxito en el mundo del fútbol."));
        Lista_Equipos.add(new Equipos("Inter de Milan","Serie A","San Siro",
                "El AC Milan, conocido simplemente como Milan, es uno de los clubes de fútbol más prominentes de Italia y del mundo. Fundado en 1899, el club tiene una rica historia de éxitos en la Serie A, habiendo ganado numerosos títulos de liga y competiciones europeas, incluyendo la Liga de Campeones de la UEFA. El equipo juega en el estadio San Siro en Milán, uno de los estadios más icónicos del fútbol. El AC Milan ha tenido una serie de futbolistas legendarios a lo largo de los años y su rivalidad con la Juventus es una de las más destacadas en el fútbol italiano. El AC Milan es sinónimo de tradición, pasión y éxito en el mundo del fútbol."));
        Lista_Equipos.add(new Equipos("Bayern Munich","Bundesliga","Allianz Arena",
                "El Bayern de Múnich, conocido como Bayern Múnich o FC Bayern, es uno de los clubes de fútbol más exitosos y reconocidos de Alemania y el mundo. Fundado en 1900, el club ha dominado la Bundesliga alemana, ganando numerosos títulos de liga. El equipo juega en el estadio Allianz Arena en Múnich, un estadio de renombre mundial. El Bayern de Múnich ha tenido futbolistas legendarios y ha competido con éxito en competiciones europeas, incluyendo la Liga de Campeones de la UEFA. El club es conocido por su historia, tradición y un apoyo apasionado por parte de sus seguidores. El Bayern es sinónimo de excelencia y éxito en el fútbol."));
        Lista_Equipos.add(new Equipos("Borussia Dortmund","Bundesliga","Signal Iduna Park",
                "El Borussia Dortmund, a menudo conocido simplemente como Dortmund o BVB, es uno de los clubes de fútbol más destacados de Alemania y de Europa. Fundado en 1909, el club ha tenido un éxito continuo en la Bundesliga alemana y ha ganado numerosos títulos de liga. El equipo juega en el estadio Signal Iduna Park, uno de los estadios más grandes y ruidosos del mundo. El Borussia Dortmund ha tenido una base de seguidores apasionados y ha sido hogar de jugadores notables a lo largo de los años. El club ha competido en competiciones europeas y es conocido por su estilo de juego ofensivo y emocionante. El Borussia Dortmund es sinónimo de pasión, emoción y fútbol atractivo."));
        Lista_Equipos.add(new Equipos("PSG","Ligue 1","Parc des Princes",
                "El Paris Saint-Germain, conocido como PSG, es uno de los clubes de fútbol más destacados de Francia y del mundo. Fundado en 1970, el club ha sido un competidor líder en la Ligue 1 francesa y ha ganado múltiples títulos de liga. El equipo juega en el Parc des Princes, su estadio icónico en París. El PSG ha atraído a talentosos futbolistas de renombre internacional y ha competido en competiciones europeas, incluyendo la Liga de Campeones de la UEFA. El club es conocido por su poderío financiero y su ambición en el mundo del fútbol. El PSG es sinónimo de éxito, estrellas y un enfoque determinado hacia el fútbol de élite."));
        Lista_Equipos.add(new Equipos("Boca Juniors","Superliga Argentina","La Bombonera",
                "El Club Atlético Boca Juniors, comúnmente conocido como Boca Juniors, es uno de los clubes de fútbol más emblemáticos y exitosos de Argentina y el mundo. Fundado en 1905, el club tiene una rica historia de éxitos en la Primera División argentina y competiciones internacionales, como la Copa Libertadores. Boca Juniors juega en La Bombonera, su icónico estadio en el barrio de La Boca, Buenos Aires. El equipo ha tenido legendarios futbolistas y ha mantenido una histórica rivalidad con River Plate en el Superclásico argentino, uno de los enfrentamientos más intensos en el fútbol. Boca Juniors es conocido por su apasionada hinchada, los \"Xeneizes,\" y su famoso lema \"La Bombonera no tiembla, late.\" El club es sinónimo de pasión, garra y una tradición rica en el fútbol argentino."));
        Lista_Equipos.add(new Equipos("River Plate","Superliga Argentina","El Monumental",
                "El Club Atlético River Plate, conocido simplemente como River Plate o River, es uno de los clubes de fútbol más destacados de Argentina y Sudamérica. Fundado en 1901, el club tiene una rica historia de éxitos en la Primera División argentina y competiciones internacionales, incluyendo la Copa Libertadores. River Plate juega en el estadio Monumental, uno de los estadios más icónicos de Sudamérica. El equipo ha tenido futbolistas legendarios y ha sostenido una intensa rivalidad con Boca Juniors en el Superclásico argentino, uno de los partidos más emocionantes y seguidos en el mundo. River Plate es conocido por su hinchada apasionada, los \"Millonarios\", y su lema \"El más grande\" en referencia a su grandeza en el fútbol argentino. El club es sinónimo de tradición, éxito y una rica historia en el fútbol."));
        Lista_Equipos.add(new Equipos("América","Liga MX","Estadio Azteca",
                "El Club América, comúnmente conocido como el América o las Águilas, es uno de los clubes de fútbol más prominentes de México y de toda América. Fundado en 1916, el club es uno de los equipos más exitosos de la Liga MX, habiendo ganado numerosos títulos de liga y copas nacionales. El América juega en el Estadio Azteca, uno de los estadios más emblemáticos del fútbol mexicano.\n" +
                        "\n" +
                        "El equipo ha tenido una serie de futbolistas destacados y ha competido con éxito en competiciones internacionales, como la Liga de Campeones de la CONCACAF."));
        Lista_Equipos.add(new Equipos("Chivas","Liga MX","Estadio Akron",
                "El Club Deportivo Guadalajara, más conocido como las Chivas o Chivas Rayadas, es uno de los clubes de fútbol más icónicos de México y del continente americano. Fundado en 1906, el club es famoso por su política de solamente contratar jugadores mexicanos, lo que le otorga un carácter único en el fútbol mexicano.\n" +
                        "\n" +
                        "El equipo juega en el Estadio Akron, ubicado en Guadalajara, Jalisco. Las Chivas tienen una rica historia de éxitos en la Liga MX, habiendo ganado múltiples títulos de liga y copas nacionales. El club también ha tenido éxito en competiciones internacionales, como la Liga de Campeones de la CONCACAF.\n" +
                        "\n" +
                        "La rivalidad con el Club América es una de las más intensas y conocidas en el fútbol mexicano y se conoce como el \"Clásico Nacional\". "));
        EquiposAdapter ea = new EquiposAdapter(Lista_Equipos);
        androidx.recyclerview.widget.RecyclerView rc = findViewById(R.id.rcEquipos);
        rc.setAdapter(ea);
        rc.setLayoutManager(new LinearLayoutManager(this));
        rc.setHasFixedSize(true);

    }
}
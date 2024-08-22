package com.folkazores.folk_azores.util;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.folkazores.folk_azores.model.Volunteer;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.time.LocalDate;

@Component
public class VolunteerDeserializer extends JsonDeserializer<Volunteer> {

    @Override
    public Volunteer deserialize(JsonParser jsonParser, DeserializationContext context) throws IOException, JsonProcessingException {
        JsonNode node = jsonParser.getCodec().readTree(jsonParser);

        Volunteer volunteer = new Volunteer();

        volunteer.setFullName(node.get("full_name").asText());
        volunteer.setEmail(node.get("email").asText());
        volunteer.setBirthdate(LocalDate.parse(node.get("birthdate").asText()));
        volunteer.setPhone(node.get("phone").asText());
        volunteer.setTshirtSize(node.get("tshirt_size").asText());
        volunteer.setCcNumber(node.get("cc_number").asText());
        volunteer.setNif(node.get("nif").asText());
        volunteer.setLevelOfEducation(node.get("level_of_education").asText());
        volunteer.setFacebookLink(node.get("facebook_link").asText());
        volunteer.setInstagramLink(node.get("instagram_link").asText());
        volunteer.setOccupation(node.get("occupation").asText());
        volunteer.setLanguagesSpoken(node.get("languages_spoken").asText());
        volunteer.setPreferredActivity(node.get("preferred_activity").asText());
        volunteer.setWeekAvailability(node.get("week_availability").asText());
        volunteer.setTimeOfDayAvailability(node.get("time_of_day_availability").asText());

        return volunteer;
    }
}

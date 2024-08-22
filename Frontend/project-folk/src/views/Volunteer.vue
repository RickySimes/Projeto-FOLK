<template>
  <div class="flex flex-col min-h-screen">
    <!-- Header -->
    <header class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
          <li><router-link to="/" class="hover:text-gray-200">Home</router-link></li>
          <li><a target="_blank" href="https://issuu.com/cofit/docs/folk_azores_2024_cartaz_a4_web"
              class="hover:text-gray-200">Programa</a></li>
          <li><router-link to="/Volunteer" class="hover:text-gray-200">Voluntariado</router-link></li>
          <li><a href="#" class="hover:text-gray-200">História</a></li>
        </ul>
      </nav>
    </header>

    <!-- Main Content -->
    <main class="flex-grow flex items-center justify-center bg-gray-100">
      <div class="w-full max-w-4xl p-8 bg-white font-folk rounded-lg shadow-md">
        <form @submit.prevent="handleSubmit" class="space-y-6">
          <h1 class="text-2xl font-bold mb-6 text-gray-800">Voluntariado Folk Azores</h1>

          <!-- Full Name -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="full_name">Nome Completo</label>
            <input v-model="formData.full_name"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="full_name" type="text" placeholder="Nome Completo" />
          </div>

          <!-- Email -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="email">Email</label>
            <input v-model="formData.email"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="email" type="email" placeholder="Email" />
          </div>

          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="birthdate">Data de Nascimento</label>
            <input v-model="formData.birthdate"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="birthdate" type="text" placeholder="Data de Nascimento" />
          </div>

          <!-- Phone Number -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="phone">Telemóvel</label>
            <input v-model="formData.phone"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="phone" type="number" placeholder="Telemóvel" />
          </div>

          <!-- T-Shirt Size -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Tamanho da T-Shirt</label>
            <div class="flex flex-wrap items-center space-x-6">
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="XS" class="radio-button"
                  v-model="formData.tshirt_size">
                XS</label>
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="S" class="radio-button"
                  v-model="formData.tshirt_size">
                S</label>
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="M" class="radio-button"
                  v-model="formData.tshirt_size">
                M</label>
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="L" class="radio-button"
                  v-model="formData.tshirt_size">
                L</label>
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="XL" class="radio-button"
                  v-model="formData.tshirt_size">
                XL</label>
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="XXL" class="radio-button"
                  v-model="formData.tshirt_size">
                XXL</label>
              <label class="flex items-center"><input type="radio" name="tshirt_size" value="XXXL" class="radio-button"
                  v-model="formData.tshirt_size">
                XXXL</label>
            </div>
          </div>

          <!-- CC Number -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="cc_number">N.º Cartão de Cidadão</label>
            <input v-model="formData.cc_number"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="cc_number" type="number" placeholder="Número Cartão de Cidadão" />
          </div>

          <!-- NIF -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="nif">N.º Identificação Fiscal</label>
            <input v-model="formData.nif"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="nif" type="number" placeholder="Número de Identificação Fiscal" />
          </div>

          <!-- Education Level -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Habilitações Literárias</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="radio" name="level_of_education" value="Basico"
                  class="radio-button" v-model="formData.level_of_education"> Básico</label>
              <label class="flex items-center"><input type="radio" name="level_of_education" value="Secundario"
                  class="radio-button" v-model="formData.level_of_education">
                Secundário</label>
              <label class="flex items-center"><input type="radio" name="level_of_education" value="Licenciatura"
                  class="radio-button" v-model="formData.level_of_education">
                Licenciatura</label>
              <label class="flex items-center"><input type="radio" name="level_of_education" value="Mestrado"
                  class="radio-button" v-model="formData.level_of_education"> Mestrado</label>
              <label class="flex items-center"><input type="radio" name="level_of_education" value="Doutoramento"
                  class="radio-button" v-model="formData.level_of_education">
                Doutoramento</label>
            </div>
          </div>

          <!-- Facebook Link -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="facebook_link">Facebook</label>
            <input v-model="formData.facebook_link"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="facebook_link" type="text" placeholder="Facebook Link" />
          </div>

          <!-- Instagram Link -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="instagram_link">Instagram</label>
            <input v-model="formData.instagram_link"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="instagram_link" type="text" placeholder="Instagram Link" />
          </div>

          <!-- Occupation -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2" for="occupation">Ocupação</label>
            <input v-model="formData.occupation"
              class="shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="occupation" type="text" placeholder="Ocupação" />
          </div>

          <!-- Languages Spoken -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Idioma(s)</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Inglês" class="checkbox"
                  v-model="formData.languages_spoken">
                Inglês
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Espanhol" class="checkbox"
                  v-model="formData.languages_spoken">
                Espanhol
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Frances" class="checkbox"
                  v-model="formData.languages_spoken">
                Francês
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Alemao" class="checkbox"
                  v-model="formData.languages_spoken">
                Alemão
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Italiano" class="checkbox"
                  v-model="formData.languages_spoken">
                Italiano
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Russo" class="checkbox"
                  v-model="formData.languages_spoken">
                Russo
              </label>
              <label class="flex items-center">
                <input type="checkbox" name="languages_spoken" value="Ucraniano" class="checkbox"
                  v-model="formData.languages_spoken">
                Ucraniano
              </label>
            </div>

            <label class="flex mt-4 mb-2 items-center">
              <input type="checkbox" class="checkbox" v-model="customLanguageEnabled"> Outra
            </label>
            <!-- Textbox for Other Language -->
            <input v-if="customLanguageEnabled" v-model="formData.otherLanguage"
              class="mt-2 shadow appearance-none border rounded w-full py-2 px-3 text-gray-700 leading-tight focus:outline-none focus:shadow-outline"
              id="otherLanguage" type="text" placeholder="Specify Other Language" />
          </div>

          <!-- Areas of Interest -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Área de voluntariado pretendida</label>
            <div class="flex flex-wrap items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="preferred_activity"
                  value="Acompanhamento de grupos" class="checkbox" v-model="formData.preferred_activity">
                Acompanhamento de Grupos</label>
              <label class="flex items-center"><input type="checkbox" name="preferred_activity" value="Secretariado"
                  class="checkbox" v-model="formData.preferred_activity"> Secretariado</label>
              <label class="flex items-center"><input type="checkbox" name="preferred_activity" value="Multimedia"
                  class="checkbox" v-model="formData.preferred_activity">
                Multimédia</label>
              <label class="flex items-center"><input type="checkbox" name="preferred_activity" value="Logistica"
                  class="checkbox" v-model="formData.preferred_activity">
                Logística</label>
              <label class="flex items-center"><input type="checkbox" name="preferred_activity" value="Vendas"
                  class="checkbox" v-model="formData.preferred_activity">
                Vendas</label>
              <label class="flex items-center"><input type="checkbox" name="preferred_activity" value="Bar"
                  class="checkbox" v-model="formData.preferred_activity">
                Bar</label>
            </div>
          </div>

          <!-- Weekly Availability -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Disponibilidade Semanal</label>
            <div class="flex items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="week_availability" value="Semana"
                  class="checkbox" v-model="formData.week_availability"> Semana</label>
              <label class="flex items-center"><input type="checkbox" name="week_availability" value="Fim-de-semana"
                  class="checkbox" v-model="formData.week_availability">
                Fim-de-semana</label>
            </div>
          </div>

          <!-- Time of Day Availability -->
          <div class="mb-4">
            <label class="block text-gray-700 text-sm font-bold mb-2">Disponibilidade no período do dia</label>
            <div class="flex items-center space-x-4">
              <label class="flex items-center"><input type="checkbox" name="time_of_day_availability" value="Manha"
                  class="checkbox" v-model="formData.time_of_day_availability"> Manhã</label>
              <label class="flex items-center"><input type="checkbox" name="time_of_day_availability" value="Tarde"
                  class="checkbox" v-model="formData.time_of_day_availability"> Tarde</label>
              <label class="flex items-center"><input type="checkbox" name="time_of_day_availability" value="Noite"
                  class="checkbox" v-model="formData.time_of_day_availability"> Noite</label>
            </div>
          </div>

          <!-- Submit Button -->
          <div class="flex items-center justify-between">
            <button :disabled="!isFormValid" :class="{ 'btn-disabled': !isFormValid }" type="submit">

              Submit
            </button>
          </div>
        </form>
      </div>
    </main>

    <!-- Footer -->
    <footer class="bg-gradient-to-r from-blue-600 to-purple-900 text-white py-4 shadow-lg">
      <nav class="container mx-auto flex justify-center items-center space-x-8">
        <ul class="flex space-x-8 md:space-x-24 font-folk text-sm md:text-base">
          <li><a target="_blank" href="https://www.facebook.com/folkazores" class="hover:text-gray-200">Facebook</a>
          </li>
          <li><a target="_blank" href="https://www.instagram.com/folk.azores/" class="hover:text-gray-200">Instagram</a>
          </li>
        </ul>
      </nav>
    </footer>
  </div>
</template>

<style>
/* Google-style radio button */

button {
  background-color: #007bff;
  color: white;
  padding: 10px 20px;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  transition: background-color 0.3s ease;
}

/* Disabled button styling */
.btn-disabled {
  background-color: #a0c4ff;
  /* Lighter shade of blue */
  cursor: not-allowed;
}

.radio-button {
  appearance: none;
  background-color: #fff;
  margin: 0;
  font: inherit;
  width: 24px;
  height: 24px;
  border: 2px solid #d1d5db;
  border-radius: 50%;
  display: grid;
  place-content: center;
  cursor: pointer;
  margin-right: 10px;
}

.radio-button::before {
  content: "";
  width: 12px;
  height: 12px;
  border-radius: 50%;
  transform: scale(0);
  transition: 120ms transform ease-in-out;
  box-shadow: inset 14px 14px #2563eb;
  /* Adjust this color to match your theme */
}

.radio-button:checked::before {
  transform: scale(1);
}

.radio-button:focus {
  outline: none;
  box-shadow: 0 0 0 4px rgba(37, 99, 235, 0.3);
}


/* Google-style checkbox */
.checkbox {
  appearance: none;
  background-color: #fff;
  font: inherit;
  width: 24px;
  height: 24px;
  border: 2px solid #d1d5db;
  border-radius: 4px;
  display: grid;
  place-content: center;
  cursor: pointer;
  margin-right: 10px;
}

.checkbox::before {
  content: "";
  width: 16px;
  height: 16px;
  clip-path: polygon(14% 44%, 0 65%, 50% 100%, 100% 16%, 80% 0, 43% 62%);
  transform: scale(0);
  transition: 120ms transform ease-in-out;
  background-color: #2563eb;
  /* Adjust this color to match your theme */
}

.checkbox:checked::before {
  transform: scale(1);
}

.checkbox:focus {
  outline: none;
  box-shadow: 0 0 0 4px rgba(37, 99, 235, 0.3);
}

/* Responsive Form Styling */
@media (max-width: 640px) {
  .form-container {
    padding: 4px;
  }

  .form-container input,
  .form-container textarea {
    font-size: 0.875rem;
  }
}
</style>

<script>

import { defineComponent, ref, onMounted, computed, watch } from 'vue';
import axios from "axios";
import flatpickr from 'flatpickr';
import 'flatpickr/dist/flatpickr.min.css';

export default defineComponent({
  setup() {

    const formData = ref({
      full_name: '',
      email: '',
      birthdate: '',
      phone: '',
      tshirt_size: '',
      cc_number: '',
      nif: '',
      level_of_education: '',
      facebook_link: '',
      instagram_link: '',
      occupation: '',
      languages_spoken: [],
      preferred_activity: [],
      week_availability: [],
      time_of_day_availability: []
    });

    const isFormValid = computed(() => {
      return (
        formData.value.full_name &&
        formData.value.email &&
        formData.value.birthdate &&
        formData.value.phone &&
        formData.value.cc_number &&
        formData.value.nif &&
        formData.value.languages_spoken.length > 0 &&
        formData.value.preferred_activity.length > 0 &&
        formData.value.week_availability.length > 0 &&
        formData.value.time_of_day_availability.length > 0 &&
        (!customLanguageEnabled.value || formData.value.otherLanguage)
      );
    });

    const customLanguageEnabled = ref(false);

    onMounted(() => {
      flatpickr('#birthdate', {
        dateFormat: 'Y-m-d',
        onChange: (selectedDates, dateStr) => {
          formData.value.birthdate = dateStr;
        }
      });
    });

    watch(formData, () => { }, { deep: true });

    const handleSubmit = async () => {
      const data = { ...formData.value };




      // If custom language is enabled and the otherLanguage field is not empty
      if (customLanguageEnabled.value && formData.value.otherLanguage) {
        data.languages_spoken.push(formData.value.otherLanguage); // Add the custom language to the languages array
      }

      data.languages_spoken = data.languages_spoken.join(', ');
      data.preferred_activity = data.preferred_activity.join(', ');
      data.week_availability = data.week_availability.join(', ');
      data.time_of_day_availability = data.time_of_day_availability.join(', ');

      console.log(data);

      const jsonData = JSON.stringify(data);

      console.log(data);

      try {
        // Await the fetch call and get the response object directly
        const response = await fetch('https://projeto-folk.vercel.app/api/volunteers', {
          method: 'POST',
          headers: {
            'Content-Type': 'application/json',
          },
          body: jsonData,
          credentials: 'include',
        });

        if (response.ok) {
          // Parse the JSON from the response
          const result = await response.json();
          alert('Form submitted successfully!');
          resetForm();
          console.log(result);
        } else {
          console.error('Error:', response.statusText);
          resetForm();
        }
      } catch (error) {
        console.error('Network error:', error);
      }
    };

    const resetForm = () => {
      formData.value = {
        full_name: '',
        email: '',
        birthdate: '',
        phone: '',
        tshirt_size: '',
        cc_number: '',
        nif: '',
        level_of_education: '',
        facebook_link: '',
        instagram_link: '',
        occupation: '',
        languages_spoken: [],
        otherLanguage: '',
        preferred_activity: [],
        week_availability: [],
        time_of_day_availability: [],
      };
      customLanguageEnabled.value = false;
    };

    return {
      formData,
      customLanguageEnabled,
      handleSubmit,
      resetForm,
      isFormValid
    };
  },
});

</script>

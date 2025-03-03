import globals from 'globals';

import eslintJs from '@eslint/js';
import eslintJsPlugin from '@stylistic/eslint-plugin-js';
import eslintTsPlugin from '@typescript-eslint/eslint-plugin';
import eslintTsParser from '@typescript-eslint/parser';

export default [
  {
    files: ['**/*.js'],
    plugins: {
      '@stylistic/js': eslintJsPlugin,
    },
    rules: {
      ...eslintJs.configs.recommended.rules,
      '@stylistic/js/semi': ['error'],
    },
    languageOptions: {
      ecmaVersion: 2022,
      sourceType: 'module',
      globals: {
        ...globals.node,
      },
    }
  },
  {
    files: ['**/*.ts'],
    plugins: {
      '@typescript-eslint': eslintTsPlugin,
    },
    rules: eslintTsPlugin.configs.recommended.rules,
    languageOptions: {
      parser: eslintTsParser,
      ecmaVersion: 2022,
      sourceType: 'module',
      globals: {
        ...globals.node,
      },
    },
  }
];
